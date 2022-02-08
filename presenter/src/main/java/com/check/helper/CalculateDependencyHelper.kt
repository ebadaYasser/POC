package com.check.helper

import com.check.core.base.ConditionsRules.AND
import com.check.core.base.DependencyActions.DISABLED
import com.check.core.base.DependencyActions.ENABLED
import com.check.core.base.DependencyActions.HIDDEN
import com.check.core.base.DependencyActions.SHOWN
import com.check.core.base.DependencyRules.MAX_LENGTH
import com.check.core.base.DependencyRules.MIN_LENGTH
import com.check.core.base.DependencyRules.REQUIRED
import com.check.core.base.DependencyRules.VALUE
import com.check.domain.models.Field

class CalculateDependencyHelper(private val childItem: Field, parentItem: Field) {
    private val parentValues = parentItem.values ?: mutableListOf()
    private val parentId = parentItem.id

    fun isThereAnyDependencyValidated() {
        val conditionsArray = childItem.conditionalView?.conditions ?: arrayListOf()
        val conditionOperator = childItem.conditionalView?.operator ?: AND
        for (condition in conditionsArray) {
            if (parentId == condition.linkedFieldId) {
                when (condition.conditionType) {
                    REQUIRED -> condition.isConditionPassed = performRequiredDependency()
                    VALUE -> condition.isConditionPassed = performValuesDependency(condition.validatorValue!!)
                    MAX_LENGTH -> condition.isConditionPassed =
                        performMaxLengthDependency(condition.validatorValue!!)
                    MIN_LENGTH -> condition.isConditionPassed =
                        performMinLengthDependency(condition.validatorValue!!)
                }
            }
        }
        if (conditionOperator == AND)
            updateAction(conditionsArray.all { it.isConditionPassed!! })
        else
            updateAction(conditionsArray.any { it.isConditionPassed!! })
    }

    private fun performRequiredDependency(): Boolean {
        return parentValues.isNotEmpty()
    }

    private fun performValuesDependency(validatorValue: String): Boolean {
        return parentValues.contains(validatorValue)
    }

    private fun performMaxLengthDependency(validatorValue: String): Boolean {
        return if (parentValues.isNotEmpty()) {
            parentValues[0].toString().length <= validatorValue.length
        } else {
            false
        }
    }

    private fun performMinLengthDependency(validatorValue: String): Boolean {
        return if (parentValues.isNotEmpty()) {
            parentValues[0].toString().length >= validatorValue.length
        } else
            false
    }

    private fun updateAction(isAllActionFullFilled: Boolean) {
        val action = childItem.conditionalView?.action ?: ""
        if (isAllActionFullFilled) {
            if (childItem.conditionalView?.action == HIDDEN)
                childItem.conditionalView!!.action = SHOWN
            else
                if (childItem.conditionalView?.action == DISABLED)
                    childItem.conditionalView!!.action = ENABLED
        } else {
            if (childItem.conditionalView?.action == SHOWN)
                childItem.conditionalView!!.action = HIDDEN
            else
                if (childItem.conditionalView?.action == ENABLED)
                    childItem.conditionalView!!.action = DISABLED
            childItem.values?.clear()
        }
    }

}