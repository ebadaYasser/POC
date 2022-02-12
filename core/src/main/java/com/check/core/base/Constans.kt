package com.check.core.base


object DependencyRules {
    const val REQUIRED = "Required"
    const val MAX_LENGTH = "MaxLength"
    const val MIN_LENGTH = "MinLength"
    const val VALUE = "Value"
}

object ConditionsRules {
    const val AND = "and"
    const val OR = "or"
}

object DependencyActions {
    const val SHOWN = "shown"
    const val HIDDEN = "hidden"
    const val ENABLED = "enabled"
    const val DISABLED = "disabled"
}

object TestResponse {
    const val RESPONSE_FORM_WITH_SECTION = "{\n" +
            "    \"ErrorEn\": null,\n" +
            "    \"ErrorAr\": null,\n" +
            "    \"Success\": true,\n" +
            "    \"Data\": {\n" +
            "        \"Fields\": [\n" +
            "            {\n" +
            "                \"ReadinessIndicator\": null,\n" +
            "                \"ControlType\": \"SECTION\",\n" +
            "                \"Fields\": null,\n" +
            "                \"Id\": \"1b2876b1-8529-4e48-8f38-57fd7fcab5b7\",\n" +
            "                \"TemplateQuestionId\": null,\n" +
            "                \"EnLabel\": \"Section 1\",\n" +
            "                \"ArLabel\": \"Section 1\",\n" +
            "                \"FieldOrder\": 0,\n" +
            "                \"SectionId\": null,\n" +
            "                \"ConditionalView\": {\n" +
            "                    \"Action\": \"hidden\",\n" +
            "                    \"Operator\": \"and\",\n" +
            "                    \"Conditions\": []\n" +
            "                },\n" +
            "                \"VisibilityView\": []\n" +
            "            },\n" +
            "            {\n" +
            "                \"ControlType\": \"TEXT_BOX\",\n" +
            "                \"Regex\": \"\",\n" +
            "                \"EnPlaceholder\": null,\n" +
            "                \"ArPlaceholder\": null,\n" +
            "                \"Required\": false,\n" +
            "                \"HasAttachments\": false,\n" +
            "                \"HasNotes\": false,\n" +
            "                \"ResponsibleUnit\": null,\n" +
            "                \"SeverityLevel\": null,\n" +
            "                \"Id\": \"3c544ef2-e81c-413b-a259-ec9d2b35a2df\",\n" +
            "                \"TemplateQuestionId\": null,\n" +
            "                \"EnLabel\": \"Section 1 Edit Text\",\n" +
            "                \"ArLabel\": \"Section 1 Edit Text\",\n" +
            "                \"FieldOrder\": 1,\n" +
            "                \"SectionId\": \"1b2876b1-8529-4e48-8f38-57fd7fcab5b7\",\n" +
            "                \"ConditionalView\": {\n" +
            "                    \"Action\": \"hidden\",\n" +
            "                    \"Operator\": \"and\",\n" +
            "                    \"Conditions\": []\n" +
            "                },\n" +
            "                \"VisibilityView\": []\n" +
            "            },\n" +
            "            {\n" +
            "                \"ControlType\": \"TEXT_BOX\",\n" +
            "                \"Regex\": \"\",\n" +
            "                \"EnPlaceholder\": null,\n" +
            "                \"ArPlaceholder\": null,\n" +
            "                \"Required\": false,\n" +
            "                \"HasAttachments\": false,\n" +
            "                \"HasNotes\": false,\n" +
            "                \"ResponsibleUnit\": null,\n" +
            "                \"SeverityLevel\": null,\n" +
            "                \"Id\": \"3c26fc75-e249-4d01-b4da-d00229dfb338\",\n" +
            "                \"TemplateQuestionId\": null,\n" +
            "                \"EnLabel\": \"Text Box 2 Section 1\",\n" +
            "                \"ArLabel\": \"Text Box 2 Section 1\",\n" +
            "                \"FieldOrder\": 2,\n" +
            "                \"SectionId\": \"1b2876b1-8529-4e48-8f38-57fd7fcab5b7\",\n" +
            "                \"ConditionalView\": {\n" +
            "                    \"Action\": \"hidden\",\n" +
            "                    \"Operator\": \"and\",\n" +
            "                    \"Conditions\": [\n" +
            "                        {\n" +
            "                            \"LinkedFieldId\": \"3c544ef2-e81c-413b-a259-ec9d2b35a2df\",\n" +
            "                            \"ConditionType\": \"MinLength\",\n" +
            "                            \"ValidatorValue\": \"6\",\n" +
            "                            \"EnErrorMsg\": null,\n" +
            "                            \"ArErrorMsg\": null\n" +
            "                        }\n" +
            "                    ]\n" +
            "                },\n" +
            "                \"VisibilityView\": []\n" +
            "            },\n" +
            "            {\n" +
            "                \"ReadinessIndicator\": null,\n" +
            "                \"ControlType\": \"SECTION\",\n" +
            "                \"Fields\": null,\n" +
            "                \"Id\": \"5b78bc69-84ae-4eec-ab28-4e0ecc4ec6d5\",\n" +
            "                \"TemplateQuestionId\": null,\n" +
            "                \"EnLabel\": \"Section 2\",\n" +
            "                \"ArLabel\": \"Section 2\",\n" +
            "                \"FieldOrder\": 3,\n" +
            "                \"SectionId\": null,\n" +
            "                \"ConditionalView\": {\n" +
            "                    \"Action\": \"hidden\",\n" +
            "                    \"Operator\": \"or\",\n" +
            "                    \"Conditions\": [\n" +
            "                        {\n" +
            "                            \"LinkedFieldId\": \"3c544ef2-e81c-413b-a259-ec9d2b35a2df\",\n" +
            "                            \"ConditionType\": \"Value\",\n" +
            "                            \"ValidatorValue\": \"show\",\n" +
            "                            \"EnErrorMsg\": null,\n" +
            "                            \"ArErrorMsg\": null\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"LinkedFieldId\": \"3e761c9b-917f-4491-9f6a-d0995e9c7e20\",\n" +
            "                            \"ConditionType\": \"Required\",\n" +
            "                            \"ValidatorValue\": \"\",\n" +
            "                            \"EnErrorMsg\": null,\n" +
            "                            \"ArErrorMsg\": null\n" +
            "                        }\n" +
            "                    ]\n" +
            "                },\n" +
            "                \"VisibilityView\": []\n" +
            "            },\n" +
            "            {\n" +
            "                \"ControlType\": \"TEXT_BOX\",\n" +
            "                \"Regex\": \"\",\n" +
            "                \"EnPlaceholder\": null,\n" +
            "                \"ArPlaceholder\": null,\n" +
            "                \"Required\": false,\n" +
            "                \"HasAttachments\": false,\n" +
            "                \"HasNotes\": false,\n" +
            "                \"ResponsibleUnit\": null,\n" +
            "                \"SeverityLevel\": null,\n" +
            "                \"Id\": \"26424c31-3a96-4a19-b1b7-eee013d2b8a5\",\n" +
            "                \"TemplateQuestionId\": null,\n" +
            "                \"EnLabel\": \"Section 2 Edit Text\",\n" +
            "                \"ArLabel\": \"Section 2 Edit Text\",\n" +
            "                \"FieldOrder\": 4,\n" +
            "                \"SectionId\": \"5b78bc69-84ae-4eec-ab28-4e0ecc4ec6d5\",\n" +
            "                \"ConditionalView\": {\n" +
            "                    \"Action\": \"hidden\",\n" +
            "                    \"Operator\": \"and\",\n" +
            "                    \"Conditions\": []\n" +
            "                },\n" +
            "                \"VisibilityView\": []\n" +
            "            },\n" +
            "            {\n" +
            "                \"ReadinessIndicator\": null,\n" +
            "                \"ControlType\": \"SECTION\",\n" +
            "                \"Fields\": null,\n" +
            "                \"Id\": \"6cff6cc7-222d-4bf8-bf9a-bf1dd17dba35\",\n" +
            "                \"TemplateQuestionId\": null,\n" +
            "                \"EnLabel\": \"Section 3\",\n" +
            "                \"ArLabel\": \"Section 3\",\n" +
            "                \"FieldOrder\": 5,\n" +
            "                \"SectionId\": null,\n" +
            "                \"ConditionalView\": {\n" +
            "                    \"Action\": \"disabled\",\n" +
            "                    \"Operator\": \"and\",\n" +
            "                    \"Conditions\": [\n" +
            "                        {\n" +
            "                            \"LinkedFieldId\": \"3c544ef2-e81c-413b-a259-ec9d2b35a2df\",\n" +
            "                            \"ConditionType\": \"Required\",\n" +
            "                            \"ValidatorValue\": \"\",\n" +
            "                            \"EnErrorMsg\": null,\n" +
            "                            \"ArErrorMsg\": null\n" +
            "                        }\n" +
            "                    ]\n" +
            "                },\n" +
            "                \"VisibilityView\": []\n" +
            "            },\n" +
            "            {\n" +
            "                \"ControlType\": \"TEXT_BOX\",\n" +
            "                \"Regex\": \"\",\n" +
            "                \"EnPlaceholder\": null,\n" +
            "                \"ArPlaceholder\": null,\n" +
            "                \"Required\": false,\n" +
            "                \"HasAttachments\": false,\n" +
            "                \"HasNotes\": false,\n" +
            "                \"ResponsibleUnit\": null,\n" +
            "                \"SeverityLevel\": null,\n" +
            "                \"Id\": \"3e761c9b-917f-4491-9f6a-d0995e9c7e20\",\n" +
            "                \"TemplateQuestionId\": null,\n" +
            "                \"EnLabel\": \"Section 3 Edit Text\",\n" +
            "                \"ArLabel\": \"Section 3 Edit Text\",\n" +
            "                \"FieldOrder\": 6,\n" +
            "                \"SectionId\": \"6cff6cc7-222d-4bf8-bf9a-bf1dd17dba35\",\n" +
            "                \"ConditionalView\": {\n" +
            "                    \"Action\": \"hidden\",\n" +
            "                    \"Operator\": \"and\",\n" +
            "                    \"Conditions\": []\n" +
            "                },\n" +
            "                \"VisibilityView\": []\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}"

    const val RESPONSE_FORM_WITH_NO_SECTION = "{\n" +
            "\t\"ErrorEn\": null,\n" +
            "\t\"ErrorAr\": null,\n" +
            "\t\"Success\": true,\n" +
            "\t\"Data\": {\n" +
            "\t\t\"id\": \"form1\",\n" +
            "\t\t\"score\": 0,\n" +
            "\t\t\"templateId\": \"\",\n" +
            "\t\t\"themeId\": \"\",\n" +
            "\t\t\"campaign\": {\n" +
            "\t\t\t\"header\": {\n" +
            "\t\t\t\t\"logo\": \"\",\n" +
            "\t\t\t\t\"title\": \"Campaign Title\",\n" +
            "\t\t\t\t\"description\": \"Add Description\",\n" +
            "\t\t\t\t\"showQuestionCount\": false\n" +
            "\t\t\t},\n" +
            "\t\t\t\"submissionMessage\": {\n" +
            "\t\t\t\t\"logo\": \"\",\n" +
            "\t\t\t\t\"title\": \"Thank You!\",\n" +
            "\t\t\t\t\"description\": \"Your submission has been received\",\n" +
            "\t\t\t\t\"showQuestionCount\": false\n" +
            "\t\t\t}\n" +
            "\t\t},\n" +
            "\t\t\"Fields\": [{\n" +
            "\t\t\t\t\"ControlType\": \"TEXT_BOX\",\n" +
            "\t\t\t\t\"Regex\": \"\",\n" +
            "\t\t\t\t\"EnPlaceholder\": null,\n" +
            "\t\t\t\t\"ArPlaceholder\": null,\n" +
            "\t\t\t\t\"Required\": false,\n" +
            "\t\t\t\t\"HasAttachments\": false,\n" +
            "\t\t\t\t\"HasNotes\": false,\n" +
            "\t\t\t\t\"values\": [],\n" +
            "\t\t\t\t\"ResponsibleUnit\": null,\n" +
            "\t\t\t\t\"SeverityLevel\": null,\n" +
            "\t\t\t\t\"Id\": \"0a4fe0b7-f1b3-4538-b1c3-5e0bec3bdc72\",\n" +
            "\t\t\t\t\"TemplateQuestionId\": null,\n" +
            "\t\t\t\t\"EnLabel\": \"TextBoxDependent Field\",\n" +
            "\t\t\t\t\"ArLabel\": \"TextBoxDependent Field\",\n" +
            "\t\t\t\t\"FieldOrder\": 0,\n" +
            "\t\t\t\t\"SectionId\": null,\n" +
            "\t\t\t\t\"ConditionalView\": {\n" +
            "\t\t\t\t\t\"Action\": \"hidden\",\n" +
            "\t\t\t\t\t\"Operator\": \"and\",\n" +
            "\t\t\t\t\t\"Conditions\": []\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"VisibilityView\": []\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"ControlType\": \"TEXT_BOX\",\n" +
            "\t\t\t\t\"Regex\": \"\",\n" +
            "\t\t\t\t\"EnPlaceholder\": null,\n" +
            "\t\t\t\t\"ArPlaceholder\": null,\n" +
            "\t\t\t\t\"Required\": false,\n" +
            "\t\t\t\t\"HasAttachments\": false,\n" +
            "\t\t\t\t\"HasNotes\": false,\n" +
            "\t\t\t\t\"values\": [],\n" +
            "\t\t\t\t\"ResponsibleUnit\": null,\n" +
            "\t\t\t\t\"SeverityLevel\": null,\n" +
            "\t\t\t\t\"Id\": \"d43e2a16-7d9c-4c00-94c6-4b94d68bba81\",\n" +
            "\t\t\t\t\"TemplateQuestionId\": null,\n" +
            "\t\t\t\t\"EnLabel\": \"TextBoxDependency Hidden\",\n" +
            "\t\t\t\t\"ArLabel\": \"TextBoxDependency Hidde\",\n" +
            "\t\t\t\t\"FieldOrder\": 1,\n" +
            "\t\t\t\t\"SectionId\": \"\",\n" +
            "\t\t\t\t\"ConditionalView\": {\n" +
            "\t\t\t\t\t\"Action\": \"hidden\",\n" +
            "\t\t\t\t\t\"Operator\": \"and\",\n" +
            "\t\t\t\t\t\"Conditions\": [{\n" +
            "\t\t\t\t\t\t\"LinkedFieldId\": \"0a4fe0b7-f1b3-4538-b1c3-5e0bec3bdc72\",\n" +
            "\t\t\t\t\t\t\"ConditionType\": \"Required\",\n" +
            "\t\t\t\t\t\t\"ValidatorValue\": \"\",\n" +
            "\t\t\t\t\t\t\"EnErrorMsg\": null,\n" +
            "\t\t\t\t\t\t\"ArErrorMsg\": null\n" +
            "\t\t\t\t\t}]\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"VisibilityView\": []\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"ControlType\": \"TEXT_BOX\",\n" +
            "\t\t\t\t\"Regex\": \"\",\n" +
            "\t\t\t\t\"EnPlaceholder\": null,\n" +
            "\t\t\t\t\"ArPlaceholder\": null,\n" +
            "\t\t\t\t\"Required\": false,\n" +
            "\t\t\t\t\"HasAttachments\": false,\n" +
            "\t\t\t\t\"HasNotes\": false,\n" +
            "\t\t\t\t\"values\": [],\n" +
            "\t\t\t\t\"ResponsibleUnit\": null,\n" +
            "\t\t\t\t\"SeverityLevel\": null,\n" +
            "\t\t\t\t\"Id\": \"1a18af5f-b213-4f68-967b-06cf23dece4d\",\n" +
            "\t\t\t\t\"TemplateQuestionId\": null,\n" +
            "\t\t\t\t\"EnLabel\": \"TextBox Multiple hidden\",\n" +
            "\t\t\t\t\"ArLabel\": \"TextBox Multiple hidden\",\n" +
            "\t\t\t\t\"FieldOrder\": 2,\n" +
            "\t\t\t\t\"SectionId\": null,\n" +
            "\t\t\t\t\"ConditionalView\": {\n" +
            "\t\t\t\t\t\"Action\": \"hidden\",\n" +
            "\t\t\t\t\t\"Operator\": \"and\",\n" +
            "\t\t\t\t\t\"Conditions\": [{\n" +
            "\t\t\t\t\t\t\t\"LinkedFieldId\": \"0a4fe0b7-f1b3-4538-b1c3-5e0bec3bdc72\",\n" +
            "\t\t\t\t\t\t\t\"ConditionType\": \"Required\",\n" +
            "\t\t\t\t\t\t\t\"ValidatorValue\": \"\",\n" +
            "\t\t\t\t\t\t\t\"EnErrorMsg\": null,\n" +
            "\t\t\t\t\t\t\t\"ArErrorMsg\": null\n" +
            "\t\t\t\t\t\t},\n" +
            "\t\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\t\"LinkedFieldId\": \"d43e2a16-7d9c-4c00-94c6-4b94d68bba81\",\n" +
            "\t\t\t\t\t\t\t\"ConditionType\": \"Value\",\n" +
            "\t\t\t\t\t\t\t\"ValidatorValue\": \"test\",\n" +
            "\t\t\t\t\t\t\t\"EnErrorMsg\": null,\n" +
            "\t\t\t\t\t\t\t\"ArErrorMsg\": null\n" +
            "\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t]\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"VisibilityView\": []\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"ControlType\": \"TEXT_BOX\",\n" +
            "\t\t\t\t\"Regex\": \"\",\n" +
            "\t\t\t\t\"EnPlaceholder\": null,\n" +
            "\t\t\t\t\"ArPlaceholder\": null,\n" +
            "\t\t\t\t\"Required\": false,\n" +
            "\t\t\t\t\"HasAttachments\": false,\n" +
            "\t\t\t\t\"HasNotes\": false,\n" +
            "\t\t\t\t\"values\": [],\n" +
            "\t\t\t\t\"ResponsibleUnit\": null,\n" +
            "\t\t\t\t\"SeverityLevel\": null,\n" +
            "\t\t\t\t\"Id\": \"1f8216b9-374c-489f-9c79-6e99bba454d6\",\n" +
            "\t\t\t\t\"TemplateQuestionId\": null,\n" +
            "\t\t\t\t\"EnLabel\": \"Disabled Field\",\n" +
            "\t\t\t\t\"ArLabel\": \"Disabled Field\",\n" +
            "\t\t\t\t\"FieldOrder\": 3,\n" +
            "\t\t\t\t\"SectionId\": null,\n" +
            "\t\t\t\t\"ConditionalView\": {\n" +
            "\t\t\t\t\t\"Action\": \"disabled\",\n" +
            "\t\t\t\t\t\"Operator\": \"and\",\n" +
            "\t\t\t\t\t\"Conditions\": [{\n" +
            "\t\t\t\t\t\t\"LinkedFieldId\": \"0a4fe0b7-f1b3-4538-b1c3-5e0bec3bdc72\",\n" +
            "\t\t\t\t\t\t\"ConditionType\": \"Value\",\n" +
            "\t\t\t\t\t\t\"ValidatorValue\": \"test\",\n" +
            "\t\t\t\t\t\t\"EnErrorMsg\": null,\n" +
            "\t\t\t\t\t\t\"ArErrorMsg\": null\n" +
            "\t\t\t\t\t}]\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"VisibilityView\": []\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"ControlType\": \"TEXT_BOX\",\n" +
            "\t\t\t\t\"Regex\": \"\",\n" +
            "\t\t\t\t\"EnPlaceholder\": null,\n" +
            "\t\t\t\t\"ArPlaceholder\": null,\n" +
            "\t\t\t\t\"Required\": false,\n" +
            "\t\t\t\t\"HasAttachments\": false,\n" +
            "\t\t\t\t\"HasNotes\": false,\n" +
            "\t\t\t\t\"values\": [],\n" +
            "\n" +
            "\t\t\t\t\"ResponsibleUnit\": null,\n" +
            "\t\t\t\t\"SeverityLevel\": null,\n" +
            "\t\t\t\t\"Id\": \"faec19ff-41f2-4f28-88e7-b26f703ce33b\",\n" +
            "\t\t\t\t\"TemplateQuestionId\": null,\n" +
            "\t\t\t\t\"EnLabel\": \"TextBox\",\n" +
            "\t\t\t\t\"ArLabel\": \"TextBox\",\n" +
            "\t\t\t\t\"FieldOrder\": 4,\n" +
            "\t\t\t\t\"SectionId\": null,\n" +
            "\t\t\t\t\"ConditionalView\": {\n" +
            "\t\t\t\t\t\"Action\": \"hidden\",\n" +
            "\t\t\t\t\t\"Operator\": \"and\",\n" +
            "\t\t\t\t\t\"Conditions\": []\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"VisibilityView\": []\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"ControlType\": \"CALENDER\",\n" +
            "\t\t\t\t\"Regex\": \"\",\n" +
            "\t\t\t\t\"EnPlaceholder\": null,\n" +
            "\t\t\t\t\"ArPlaceholder\": null,\n" +
            "\t\t\t\t\"Required\": false,\n" +
            "\t\t\t\t\"HasAttachments\": false,\n" +
            "\t\t\t\t\"HasNotes\": false,\n" +
            "\t\t\t\t\"values\": [],\n" +
            "\n" +
            "\t\t\t\t\"ResponsibleUnit\": null,\n" +
            "\t\t\t\t\"SeverityLevel\": null,\n" +
            "\t\t\t\t\"Id\": \"5515a4a2-e413-4c16-8289-69ebf9f52071\",\n" +
            "\t\t\t\t\"TemplateQuestionId\": null,\n" +
            "\t\t\t\t\"EnLabel\": \"calendar\",\n" +
            "\t\t\t\t\"ArLabel\": \"calendar\",\n" +
            "\t\t\t\t\"FieldOrder\": 5,\n" +
            "\t\t\t\t\"SectionId\": null,\n" +
            "\t\t\t\t\"ConditionalView\": {\n" +
            "\t\t\t\t\t\"Action\": \"hidden\",\n" +
            "\t\t\t\t\t\"Operator\": \"and\",\n" +
            "\t\t\t\t\t\"Conditions\": []\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"VisibilityView\": []\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"ControlType\": \"TEXT_BOX\",\n" +
            "\t\t\t\t\"Regex\": \"\",\n" +
            "\t\t\t\t\"EnPlaceholder\": null,\n" +
            "\t\t\t\t\"ArPlaceholder\": null,\n" +
            "\t\t\t\t\"Required\": false,\n" +
            "\t\t\t\t\"HasAttachments\": false,\n" +
            "\t\t\t\t\"HasNotes\": false,\n" +
            "\t\t\t\t\"values\": [],\n" +
            "\n" +
            "\t\t\t\t\"ResponsibleUnit\": null,\n" +
            "\t\t\t\t\"SeverityLevel\": null,\n" +
            "\t\t\t\t\"Id\": \"b0b4a5e4-fd5e-42f8-8275-ec5725417602\",\n" +
            "\t\t\t\t\"TemplateQuestionId\": null,\n" +
            "\t\t\t\t\"EnLabel\": \"TextBox\",\n" +
            "\t\t\t\t\"ArLabel\": \"TextBox\",\n" +
            "\t\t\t\t\"FieldOrder\": 6,\n" +
            "\t\t\t\t\"SectionId\": null,\n" +
            "\t\t\t\t\"ConditionalView\": {\n" +
            "\t\t\t\t\t\"Action\": \"hidden\",\n" +
            "\t\t\t\t\t\"Operator\": \"and\",\n" +
            "\t\t\t\t\t\"Conditions\": []\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"VisibilityView\": []\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"ControlType\": \"TEXT_BOX\",\n" +
            "\t\t\t\t\"Regex\": \"\",\n" +
            "\t\t\t\t\"EnPlaceholder\": null,\n" +
            "\t\t\t\t\"ArPlaceholder\": null,\n" +
            "\t\t\t\t\"Required\": false,\n" +
            "\t\t\t\t\"HasAttachments\": false,\n" +
            "\t\t\t\t\"HasNotes\": false,\n" +
            "\t\t\t\t\"values\": [],\n" +
            "\n" +
            "\t\t\t\t\"ResponsibleUnit\": null,\n" +
            "\t\t\t\t\"SeverityLevel\": null,\n" +
            "\t\t\t\t\"Id\": \"afe651ed-40ae-4fbd-b1e0-2f0991fc2cc1\",\n" +
            "\t\t\t\t\"TemplateQuestionId\": null,\n" +
            "\t\t\t\t\"EnLabel\": \"testbox\",\n" +
            "\t\t\t\t\"ArLabel\": \"testbox\",\n" +
            "\t\t\t\t\"FieldOrder\": 7,\n" +
            "\t\t\t\t\"SectionId\": null,\n" +
            "\t\t\t\t\"ConditionalView\": {\n" +
            "\t\t\t\t\t\"Action\": \"hidden\",\n" +
            "\t\t\t\t\t\"Operator\": \"and\",\n" +
            "\t\t\t\t\t\"Conditions\": []\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"VisibilityView\": []\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"ControlType\": \"TEXT_BOX\",\n" +
            "\t\t\t\t\"Regex\": \"\",\n" +
            "\t\t\t\t\"EnPlaceholder\": null,\n" +
            "\t\t\t\t\"ArPlaceholder\": null,\n" +
            "\t\t\t\t\"Required\": false,\n" +
            "\t\t\t\t\"HasAttachments\": false,\n" +
            "\t\t\t\t\"HasNotes\": false,\n" +
            "\t\t\t\t\"values\": [],\n" +
            "\n" +
            "\t\t\t\t\"ResponsibleUnit\": null,\n" +
            "\t\t\t\t\"SeverityLevel\": null,\n" +
            "\t\t\t\t\"Id\": \"42d8bd5a-bcfe-4568-8abe-5599230197a7\",\n" +
            "\t\t\t\t\"TemplateQuestionId\": null,\n" +
            "\t\t\t\t\"EnLabel\": \"textbox\",\n" +
            "\t\t\t\t\"ArLabel\": \"textbox\",\n" +
            "\t\t\t\t\"FieldOrder\": 8,\n" +
            "\t\t\t\t\"SectionId\": null,\n" +
            "\t\t\t\t\"ConditionalView\": {\n" +
            "\t\t\t\t\t\"Action\": \"hidden\",\n" +
            "\t\t\t\t\t\"Operator\": \"and\",\n" +
            "\t\t\t\t\t\"Conditions\": []\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"VisibilityView\": []\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"ControlType\": \"TEXT_BOX\",\n" +
            "\t\t\t\t\"Regex\": \"\",\n" +
            "\t\t\t\t\"EnPlaceholder\": null,\n" +
            "\t\t\t\t\"ArPlaceholder\": null,\n" +
            "\t\t\t\t\"Required\": false,\n" +
            "\t\t\t\t\"HasAttachments\": false,\n" +
            "\t\t\t\t\"HasNotes\": false,\n" +
            "\t\t\t\t\"values\": [],\n" +
            "\n" +
            "\t\t\t\t\"ResponsibleUnit\": null,\n" +
            "\t\t\t\t\"SeverityLevel\": null,\n" +
            "\t\t\t\t\"Id\": \"74d1274f-1140-4deb-8dc7-3d83a46c7e98\",\n" +
            "\t\t\t\t\"TemplateQuestionId\": null,\n" +
            "\t\t\t\t\"EnLabel\": \"textbox\",\n" +
            "\t\t\t\t\"ArLabel\": \"textbox\",\n" +
            "\t\t\t\t\"FieldOrder\": 9,\n" +
            "\t\t\t\t\"SectionId\": null,\n" +
            "\t\t\t\t\"ConditionalView\": {\n" +
            "\t\t\t\t\t\"Action\": \"hidden\",\n" +
            "\t\t\t\t\t\"Operator\": \"and\",\n" +
            "\t\t\t\t\t\"Conditions\": []\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"VisibilityView\": []\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"ControlType\": \"TEXT_BOX\",\n" +
            "\t\t\t\t\"Regex\": \"\",\n" +
            "\t\t\t\t\"EnPlaceholder\": null,\n" +
            "\t\t\t\t\"ArPlaceholder\": null,\n" +
            "\t\t\t\t\"Required\": false,\n" +
            "\t\t\t\t\"HasAttachments\": false,\n" +
            "\t\t\t\t\"HasNotes\": false,\n" +
            "\t\t\t\t\"values\": [],\n" +
            "\n" +
            "\t\t\t\t\"ResponsibleUnit\": null,\n" +
            "\t\t\t\t\"SeverityLevel\": null,\n" +
            "\t\t\t\t\"Id\": \"e010816d-79f7-4401-b098-faee7d72bb34\",\n" +
            "\t\t\t\t\"TemplateQuestionId\": null,\n" +
            "\t\t\t\t\"EnLabel\": \"textbox\",\n" +
            "\t\t\t\t\"ArLabel\": \"textbox\",\n" +
            "\t\t\t\t\"FieldOrder\": 10,\n" +
            "\t\t\t\t\"SectionId\": null,\n" +
            "\t\t\t\t\"ConditionalView\": {\n" +
            "\t\t\t\t\t\"Action\": \"hidden\",\n" +
            "\t\t\t\t\t\"Operator\": \"and\",\n" +
            "\t\t\t\t\t\"Conditions\": []\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"VisibilityView\": []\n" +
            "\t\t\t}\n" +
            "\t\t]\n" +
            "\t}\n" +
            "}"
//        const val RESPONSE_FORM_WITH_NO_SECTION = "{\n" +
//                "    \"ErrorEn\": null,\n" +
//                "    \"ErrorAr\": null,\n" +
//                "    \"Success\": true,\n" +
//                "    \"Data\": {\n" +
//                "    \"id\": \"form1\",\n" +
//                "    \"score\": 0,\n" +
//                "    \"templateId\": \"\",\n" +
//                "    \themeId\": \"\", \n" +
//                "    \"campaign\": {\n" +
//                "    \"header\": {\n" +
//                "    \"logo\": \"\",\n" +
//                "    \"title\": \"Campaign Title\", \n" +
//                "    \"description\": \"Add Description\", \n" +
//                "    \"showQuestionCount\": false, \n" +
//                "      }, \n" +
//                "    \"submissionMessage\": {\n" +
//                "    \"logo\": \"\", \n" +
//                "    \"title\": \"Thank You!\", \n" +
//                "    \"description\": \"Your submission has been received\", \n" +
//                "    \"showQuestionCount\": false, \n" +
//                "    }, \n" +
//                "        \"Fields\": [\n" +
//                "            {\n" +
//                "                \"ControlType\": \"TEXT_BOX\",\n" +
//                "                \"Regex\": \"\",\n" +
//                "                \"EnPlaceholder\": null,\n" +
//                "                \"ArPlaceholder\": null,\n" +
//                "                \"Required\": false,\n" +
//                "                \"HasAttachments\": false,\n" +
//                "                \"HasNotes\": false,\n" +
//                "                \"ResponsibleUnit\": null,\n" +
//                "                \"SeverityLevel\": null,\n" +
//                "                \"Id\": \"0a4fe0b7-f1b3-4538-b1c3-5e0bec3bdc72\",\n" +
//                "                \"TemplateQuestionId\": null,\n" +
//                "                \"EnLabel\": \"TextBoxDependent Field\",\n" +
//                "                \"ArLabel\": \"TextBoxDependent Field\",\n" +
//                "                \"FieldOrder\": 0,\n" +
//                "                \"SectionId\": null,\n" +
//                "                \"ConditionalView\": {\n" +
//                "                    \"Action\": \"hidden\",\n" +
//                "                    \"Operator\": \"and\",\n" +
//                "                    \"Conditions\": []\n" +
//                "                },\n" +
//                "                \"VisibilityView\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "                \"ControlType\": \"TEXT_BOX\",\n" +
//                "                \"Regex\": \"\",\n" +
//                "                \"EnPlaceholder\": null,\n" +
//                "                \"ArPlaceholder\": null,\n" +
//                "                \"Required\": false,\n" +
//                "                \"HasAttachments\": false,\n" +
//                "                \"HasNotes\": false,\n" +
//                "                \"ResponsibleUnit\": null,\n" +
//                "                \"SeverityLevel\": null,\n" +
//                "                \"Id\": \"d43e2a16-7d9c-4c00-94c6-4b94d68bba81\",\n" +
//                "                \"TemplateQuestionId\": null,\n" +
//                "                \"EnLabel\": \"TextBoxDependency Hidden\",\n" +
//                "                \"ArLabel\": \"TextBoxDependency Hidde\",\n" +
//                "                \"FieldOrder\": 1,\n" +
//                "                \"SectionId\": \"\",\n" +
//                "                \"ConditionalView\": {\n" +
//                "                    \"Action\": \"hidden\",\n" +
//                "                    \"Operator\": \"and\",\n" +
//                "                    \"Conditions\": [\n" +
//                "                        {\n" +
//                "                            \"LinkedFieldId\": \"0a4fe0b7-f1b3-4538-b1c3-5e0bec3bdc72\",\n" +
//                "                            \"ConditionType\": \"Required\",\n" +
//                "                            \"ValidatorValue\": \"\",\n" +
//                "                            \"EnErrorMsg\": null,\n" +
//                "                            \"ArErrorMsg\": null\n" +
//                "                        }\n" +
//                "                    ]\n" +
//                "                },\n" +
//                "                \"VisibilityView\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "                \"ControlType\": \"TEXT_BOX\",\n" +
//                "                \"Regex\": \"\",\n" +
//                "                \"EnPlaceholder\": null,\n" +
//                "                \"ArPlaceholder\": null,\n" +
//                "                \"Required\": false,\n" +
//                "                \"HasAttachments\": false,\n" +
//                "                \"HasNotes\": false,\n" +
//                "                \"ResponsibleUnit\": null,\n" +
//                "                \"SeverityLevel\": null,\n" +
//                "                \"Id\": \"1a18af5f-b213-4f68-967b-06cf23dece4d\",\n" +
//                "                \"TemplateQuestionId\": null,\n" +
//                "                \"EnLabel\": \"TextBox Multiple hidden\",\n" +
//                "                \"ArLabel\": \"TextBox Multiple hidden\",\n" +
//                "                \"FieldOrder\": 2,\n" +
//                "                \"SectionId\": null,\n" +
//                "                \"ConditionalView\": {\n" +
//                "                    \"Action\": \"hidden\",\n" +
//                "                    \"Operator\": \"and\",\n" +
//                "                    \"Conditions\": [\n" +
//                "                        {\n" +
//                "                            \"LinkedFieldId\": \"0a4fe0b7-f1b3-4538-b1c3-5e0bec3bdc72\",\n" +
//                "                            \"ConditionType\": \"Required\",\n" +
//                "                            \"ValidatorValue\": \"\",\n" +
//                "                            \"EnErrorMsg\": null,\n" +
//                "                            \"ArErrorMsg\": null\n" +
//                "                        },\n" +
//                "                        {\n" +
//                "                            \"LinkedFieldId\": \"d43e2a16-7d9c-4c00-94c6-4b94d68bba81\",\n" +
//                "                            \"ConditionType\": \"Value\",\n" +
//                "                            \"ValidatorValue\": \"test\",\n" +
//                "                            \"EnErrorMsg\": null,\n" +
//                "                            \"ArErrorMsg\": null\n" +
//                "                        }\n" +
//                "                    ]\n" +
//                "                },\n" +
//                "                \"VisibilityView\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "                \"ControlType\": \"TEXT_BOX\",\n" +
//                "                \"Regex\": \"\",\n" +
//                "                \"EnPlaceholder\": null,\n" +
//                "                \"ArPlaceholder\": null,\n" +
//                "                \"Required\": false,\n" +
//                "                \"HasAttachments\": false,\n" +
//                "                \"HasNotes\": false,\n" +
//                "                \"ResponsibleUnit\": null,\n" +
//                "                \"SeverityLevel\": null,\n" +
//                "                \"Id\": \"1f8216b9-374c-489f-9c79-6e99bba454d6\",\n" +
//                "                \"TemplateQuestionId\": null,\n" +
//                "                \"EnLabel\": \"Disabled Field\",\n" +
//                "                \"ArLabel\": \"Disabled Field\",\n" +
//                "                \"FieldOrder\": 3,\n" +
//                "                \"SectionId\": null,\n" +
//                "                \"ConditionalView\": {\n" +
//                "                    \"Action\": \"disabled\",\n" +
//                "                    \"Operator\": \"and\",\n" +
//                "                    \"Conditions\": [\n" +
//                "                        {\n" +
//                "                            \"LinkedFieldId\": \"0a4fe0b7-f1b3-4538-b1c3-5e0bec3bdc72\",\n" +
//                "                            \"ConditionType\": \"Value\",\n" +
//                "                            \"ValidatorValue\": \"test\",\n" +
//                "                            \"EnErrorMsg\": null,\n" +
//                "                            \"ArErrorMsg\": null\n" +
//                "                        }\n" +
//                "                    ]\n" +
//                "                },\n" +
//                "                \"VisibilityView\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "                \"ControlType\": \"TEXT_BOX\",\n" +
//                "                \"Regex\": \"\",\n" +
//                "                \"EnPlaceholder\": null,\n" +
//                "                \"ArPlaceholder\": null,\n" +
//                "                \"Required\": false,\n" +
//                "                \"HasAttachments\": false,\n" +
//                "                \"HasNotes\": false,\n" +
//                "                \"ResponsibleUnit\": null,\n" +
//                "                \"SeverityLevel\": null,\n" +
//                "                \"Id\": \"faec19ff-41f2-4f28-88e7-b26f703ce33b\",\n" +
//                "                \"TemplateQuestionId\": null,\n" +
//                "                \"EnLabel\": \"TextBox\",\n" +
//                "                \"ArLabel\": \"TextBox\",\n" +
//                "                \"FieldOrder\": 4,\n" +
//                "                \"SectionId\": null,\n" +
//                "                \"ConditionalView\": {\n" +
//                "                    \"Action\": \"hidden\",\n" +
//                "                    \"Operator\": \"and\",\n" +
//                "                    \"Conditions\": []\n" +
//                "                },\n" +
//                "                \"VisibilityView\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "                \"ControlType\": \"CALENDER\",\n" +
//                "                \"Regex\": \"\",\n" +
//                "                \"EnPlaceholder\": null,\n" +
//                "                \"ArPlaceholder\": null,\n" +
//                "                \"Required\": false,\n" +
//                "                \"HasAttachments\": false,\n" +
//                "                \"HasNotes\": false,\n" +
//                "                \"ResponsibleUnit\": null,\n" +
//                "                \"SeverityLevel\": null,\n" +
//                "                \"Id\": \"5515a4a2-e413-4c16-8289-69ebf9f52071\",\n" +
//                "                \"TemplateQuestionId\": null,\n" +
//                "                \"EnLabel\": \"calendar\",\n" +
//                "                \"ArLabel\": \"calendar\",\n" +
//                "                \"FieldOrder\": 5,\n" +
//                "                \"SectionId\": null,\n" +
//                "                \"ConditionalView\": {\n" +
//                "                    \"Action\": \"hidden\",\n" +
//                "                    \"Operator\": \"and\",\n" +
//                "                    \"Conditions\": []\n" +
//                "                },\n" +
//                "                \"VisibilityView\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "                \"ControlType\": \"TEXT_BOX\",\n" +
//                "                \"Regex\": \"\",\n" +
//                "                \"EnPlaceholder\": null,\n" +
//                "                \"ArPlaceholder\": null,\n" +
//                "                \"Required\": false,\n" +
//                "                \"HasAttachments\": false,\n" +
//                "                \"HasNotes\": false,\n" +
//                "                \"ResponsibleUnit\": null,\n" +
//                "                \"SeverityLevel\": null,\n" +
//                "                \"Id\": \"b0b4a5e4-fd5e-42f8-8275-ec5725417602\",\n" +
//                "                \"TemplateQuestionId\": null,\n" +
//                "                \"EnLabel\": \"TextBox\",\n" +
//                "                \"ArLabel\": \"TextBox\",\n" +
//                "                \"FieldOrder\": 6,\n" +
//                "                \"SectionId\": null,\n" +
//                "                \"ConditionalView\": {\n" +
//                "                    \"Action\": \"hidden\",\n" +
//                "                    \"Operator\": \"and\",\n" +
//                "                    \"Conditions\": []\n" +
//                "                },\n" +
//                "                \"VisibilityView\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "                \"ControlType\": \"TEXT_BOX\",\n" +
//                "                \"Regex\": \"\",\n" +
//                "                \"EnPlaceholder\": null,\n" +
//                "                \"ArPlaceholder\": null,\n" +
//                "                \"Required\": false,\n" +
//                "                \"HasAttachments\": false,\n" +
//                "                \"HasNotes\": false,\n" +
//                "                \"ResponsibleUnit\": null,\n" +
//                "                \"SeverityLevel\": null,\n" +
//                "                \"Id\": \"afe651ed-40ae-4fbd-b1e0-2f0991fc2cc1\",\n" +
//                "                \"TemplateQuestionId\": null,\n" +
//                "                \"EnLabel\": \"testbox\",\n" +
//                "                \"ArLabel\": \"testbox\",\n" +
//                "                \"FieldOrder\": 7,\n" +
//                "                \"SectionId\": null,\n" +
//                "                \"ConditionalView\": {\n" +
//                "                    \"Action\": \"hidden\",\n" +
//                "                    \"Operator\": \"and\",\n" +
//                "                    \"Conditions\": []\n" +
//                "                },\n" +
//                "                \"VisibilityView\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "                \"ControlType\": \"TEXT_BOX\",\n" +
//                "                \"Regex\": \"\",\n" +
//                "                \"EnPlaceholder\": null,\n" +
//                "                \"ArPlaceholder\": null,\n" +
//                "                \"Required\": false,\n" +
//                "                \"HasAttachments\": false,\n" +
//                "                \"HasNotes\": false,\n" +
//                "                \"ResponsibleUnit\": null,\n" +
//                "                \"SeverityLevel\": null,\n" +
//                "                \"Id\": \"42d8bd5a-bcfe-4568-8abe-5599230197a7\",\n" +
//                "                \"TemplateQuestionId\": null,\n" +
//                "                \"EnLabel\": \"textbox\",\n" +
//                "                \"ArLabel\": \"textbox\",\n" +
//                "                \"FieldOrder\": 8,\n" +
//                "                \"SectionId\": null,\n" +
//                "                \"ConditionalView\": {\n" +
//                "                    \"Action\": \"hidden\",\n" +
//                "                    \"Operator\": \"and\",\n" +
//                "                    \"Conditions\": []\n" +
//                "                },\n" +
//                "                \"VisibilityView\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "                \"ControlType\": \"TEXT_BOX\",\n" +
//                "                \"Regex\": \"\",\n" +
//                "                \"EnPlaceholder\": null,\n" +
//                "                \"ArPlaceholder\": null,\n" +
//                "                \"Required\": false,\n" +
//                "                \"HasAttachments\": false,\n" +
//                "                \"HasNotes\": false,\n" +
//                "                \"ResponsibleUnit\": null,\n" +
//                "                \"SeverityLevel\": null,\n" +
//                "                \"Id\": \"74d1274f-1140-4deb-8dc7-3d83a46c7e98\",\n" +
//                "                \"TemplateQuestionId\": null,\n" +
//                "                \"EnLabel\": \"textbox\",\n" +
//                "                \"ArLabel\": \"textbox\",\n" +
//                "                \"FieldOrder\": 9,\n" +
//                "                \"SectionId\": null,\n" +
//                "                \"ConditionalView\": {\n" +
//                "                    \"Action\": \"hidden\",\n" +
//                "                    \"Operator\": \"and\",\n" +
//                "                    \"Conditions\": []\n" +
//                "                },\n" +
//                "                \"VisibilityView\": []\n" +
//                "            },\n" +
//                "            {\n" +
//                "                \"ControlType\": \"TEXT_BOX\",\n" +
//                "                \"Regex\": \"\",\n" +
//                "                \"EnPlaceholder\": null,\n" +
//                "                \"ArPlaceholder\": null,\n" +
//                "                \"Required\": false,\n" +
//                "                \"HasAttachments\": false,\n" +
//                "                \"HasNotes\": false,\n" +
//                "                \"ResponsibleUnit\": null,\n" +
//                "                \"SeverityLevel\": null,\n" +
//                "                \"Id\": \"e010816d-79f7-4401-b098-faee7d72bb34\",\n" +
//                "                \"TemplateQuestionId\": null,\n" +
//                "                \"EnLabel\": \"textbox\",\n" +
//                "                \"ArLabel\": \"textbox\",\n" +
//                "                \"FieldOrder\": 10,\n" +
//                "                \"SectionId\": null,\n" +
//                "                \"ConditionalView\": {\n" +
//                "                    \"Action\": \"hidden\",\n" +
//                "                    \"Operator\": \"and\",\n" +
//                "                    \"Conditions\": []\n" +
//                "                },\n" +
//                "                \"VisibilityView\": []\n" +
//                "            }\n" +
//                "        ]\n" +
//                "    }\n" +
//                "}"


//    const val NEW_RESPONSE = "{\n" +
//            "  \"id\": \"form1\",\n" +
//            "  \"score\": 0,\n" +
//            "  \"templateId\": \"\",\n" +
//            "  \"themeId\": \"\",\n" +
//            "  \"campaign\": {\n" +
//            "  \"header\": {\n" +
//            "  \"logo\": \"\",\n" +
//            "  \"title\": \"Campaign Title\",\n" +
//            "  \"description\": \"Add Description\",\n" +
//            "  \"showQuestionCount\": false\n" +
//            "  },\n" +
//            "  \"footer\": {\n" +
//            "  \"logo\": \"\",\n" +
//            "  \"title\": \"Campaign Title\",\n" +
//            "  \"description\": \"Add Description\",\n" +
//            "  \"showQuestionCount\": false\n" +
//            "  },\n" +
//            "  \"welcome\": {\n" +
//            "  \"logo\": \"\",\n" +
//            "  \"title\": \"Welcome\",\n" +
//            "  \"description\": \"Hi there, please fill out and submit this form.\",\n" +
//            "  \"showQuestionCount\": false\n" +
//            "  }\n" +
//            "  },\n" +
//            "  \"submissionMessage\": {\n" +
//            "  \"logo\": \"\",\n" +
//            "  \"title\": \"Thank You!\",\n" +
//            "  \"description\": \"Your submission has been received!\",\n" +
//            "  \"showQuestionCount\": false\n" +
//            "  },\n" +
//            "  \"settings\": {\n" +
//            "  \"format\": \"classic\",\n" +
//            "  \"status\": \"active\",\n" +
//            "  \"publishStatus\": \"draft\",\n" +
//            "  \"enableScoreCalculation\": true,\n" +
//            "  \"defaultLanguage\": {\n" +
//            "  \"name\": \"English\",\n" +
//            "  \"code\": \"EN\",\n" +
//            "  \"RTL\": false\n" +
//            "  },\n" +
//            "  \"avalibleLanguages\": [{\n" +
//            "  \"name\": \"English\",\n" +
//            "  \"code\": \"EN\",\n" +
//            "  \"RTL\": false\n" +
//            "  },\n" +
//            "  {\n" +
//            "  \"name\": \"Spanish\",\n" +
//            "  \"code\": \"ES\",\n" +
//            "  \"RTL\": false\n" +
//            "  }\n" +
//            "  ]\n" +
//            "  },\n" +
//            "  \"properties\": {\n" +
//            "  \"submit\": \"Submit\",\n" +
//            "  \"next\": \"Next\",\n" +
//            "  \"back\": \"Back\",\n" +
//            "  \"backVisibility\": true\n" +
//            "  },\n" +
//            "  \"fields\": [{\n" +
//            "  \"id\": \"28ba187e-1994-4383-815d-0c787ef64713\",\n" +
//            "  \"type\": \"Page\",\n" +
//            "  \"parentId\": null,\n" +
//            "  \"order\": 0,\n" +
//            "  \"templateQuestionId\": \"\",\n" +
//            "  \"properties\": {\n" +
//            "  \"label\": \"Page 1\",\n" +
//            "  \"subLabel\": \"\",\n" +
//            "  \"labelPosition\": \"Top\",\n" +
//            "  \"tooltip\": \"\",\n" +
//            "  \"hidden\": false,\n" +
//            "  \"submit\": \"Submit\",\n" +
//            "  \"next\": \"Next\",\n" +
//            "  \"back\": \"Back\",\n" +
//            "  \"backVisibility\": true\n" +
//            "  },\n" +
//            "  \"styles\": {\n" +
//            "  \"labelStyles\": {\n" +
//            "  \n" +
//            "  }\n" +
//            "},\n" +
//            "\"logics\": {\n" +
//            "\n" +
//            "},\n" +
//            "\"localization\": {\n" +
//            "\n" +
//            "}\n" +
//            "},\n" +
//            "{\n" +
//            "\"id\": \"129873987-777b-4d94-b1a9-oiyeoqiw0\",\n" +
//            "\"type\": \"Paragraph\",\n" +
//            "\"parentId\": \"28ba187e-1994-4383-815d-0c787ef64713\",\n" +
//            "\"order\": 0,\n" +
//            "\"templateQuestionId\": \"\",\n" +
//            "\"properties\": {\n" +
//            "\"label\": \"label\",\n" +
//            "\"subLabel\": \"\",\n" +
//            "\"labelPosition\": \"Top\",\n" +
//            "\"tooltip\": \"\",\n" +
//            "\"hidden\": false\n" +
//            "},\n" +
//            "\"styles\": {\n" +
//            "\"labelStyles\": {}\n" +
//            "},\n" +
//            "\"logics\": {},\n" +
//            "\"localization\": {}\n" +
//            "},\n" +
//            "{\n" +
//            "\"id\": \"04347389-add2-4604-8bd9-5105987d0c14\",\n" +
//            "\"type\": \"Date\",\n" +
//            "\"parentId\": \"28ba187e-1994-4383-815d-0c787ef64713\",\n" +
//            "\"order\": 0,\n" +
//            "\"templateQuestionId\": \"\",\n" +
//            "\"properties\": {\n" +
//            "\"label\": \"question label\",\n" +
//            "\"subLabel\": \"sublabel\",\n" +
//            "\"labelPosition\": \"Top\",\n" +
//            "\"tooltip\": \"\",\n" +
//            "\"hidden\": false,\n" +
//            "\"placeholder\": \"\",\n" +
//            "\"defaultValue\": \"\",\n" +
//            "\"required\": false,\n" +
//            "\"disabled\": false,\n" +
//            "\"dateTimeType\": \"both\",\n" +
//            "\"dateSelectionMode\": \"range\",\n" +
//            "\"dateFormat\": \"yy/mm/dd\",\n" +
//            "\"timeFormat\": \"12\",\n" +
//            "\"firstDayOfWeek\": 0,\n" +
//            "\"defaultDateType\": \"none\",\n" +
//            "\"defaultTimeType\": \"none\",\n" +
//            "\"disabledDates\": [\"2021/11/26\", \"2021/11/28\", \"2021/11/29\"],\n" +
//            "\"disabledDays\": []\n" +
//            "},\n" +
//            "\"styles\": {\n" +
//            "\"labelStyles\": {},\n" +
//            "\"anwserStyles\": {},\n" +
//            "\"placeholderStyles\": {}\n" +
//            "},\n" +
//            "\"logics\": {},\n" +
//            "\"localization\": {},\n" +
//            "\"weight\": 0,\n" +
//            "\"score\": 0,\n" +
//            "\"value\": []\n" +
//            "},\n" +
//            "{\n" +
//            "\"id\": \"8828828282-add2-4604-8bd9-5105987d0c14\",\n" +
//            "\"type\": \"Date\",\n" +
//            "\"parentId\": \"28ba187e-1994-4383-815d-0c787ef64713\",\n" +
//            "\"order\": 0,\n" +
//            "\"templateQuestionId\": \"\",\n" +
//            "\"properties\": {\n" +
//            "\"label\": \"Date 222\",\n" +
//            "\"subLabel\": \"sublabel\",\n" +
//            "\"labelPosition\": \"Top\",\n" +
//            "\"tooltip\": \"\",\n" +
//            "\"hidden\": false,\n" +
//            "\"placeholder\": \"\",\n" +
//            "\"defaultValue\": \"\",\n" +
//            "\"required\": false,\n" +
//            "\"disabled\": false,\n" +
//            "\"dateTimeType\": \"both\",\n" +
//            "\"dateSelectionMode\": \"multiple\",\n" +
//            "\"dateFormat\": \"yy/mm/dd\",\n" +
//            "\"timeFormat\": \"24\",\n" +
//            "\"firstDayOfWeek\": 0,\n" +
//            "\"defaultDateType\": \"none\",\n" +
//            "\"defaultTimeType\": \"none\",\n" +
//            "\"disabledDates\": [\"2021/11/26\", \"2021/11/28\", \"2021/11/29\"],\n" +
//            "\"disabledDays\": [2, 3, 0]\n" +
//            "},\n" +
//            "\"styles\": {\n" +
//            "\"labelStyles\": {},\n" +
//            "\"anwserStyles\": {},\n" +
//            "\"placeholderStyles\": {}\n" +
//            "},\n" +
//            "\"logics\": {},\n" +
//            "\"localization\": {},\n" +
//            "\"weight\": 0,\n" +
//            "\"score\": 0,\n" +
//            "\"value\": []\n" +
//            "},\n" +
//            "{\n" +
//            "\"id\": \"abab74f7-46e7-405e-bb5f-df0f7af3cace\",\n" +
//            "\"type\": \"Textbox\",\n" +
//            "\"parentId\": \"28ba187e-1994-4383-815d-0c787ef64713\",\n" +
//            "\"order\": 0,\n" +
//            "\"templateQuestionId\": \"\",\n" +
//            "\"properties\": {\n" +
//            "\"label\": \"label\",\n" +
//            "\"subLabel\": \"\",\n" +
//            "\"labelPosition\": \"Top\",\n" +
//            "\"tooltip\": \"\",\n" +
//            "\"hidden\": false,\n" +
//            "\"placeholder\": \"Placeholder\",\n" +
//            "\"defaultValue\": \"\",\n" +
//            "\"required\": true,\n" +
//            "\"disabled\": false,\n" +
//            "\"entryLimit\": \"Character\",\n" +
//            "\"autocomplete\": true,\n" +
//            "\"allowSpellcheck\": true,\n" +
//            "\"textCase\": \"Tt\",\n" +
//            "\"maximumLength\": 2,\n" +
//            "\"minimumLength\": 1,\n" +
//            "\"prefix\": {\n" +
//            "\"display\": \"Text box\",\n" +
//            "\"value\": []\n" +
//            "},\n" +
//            "\"suffix\": {\n" +
//            "\"display\": \"Dropdown\",\n" +
//            "\"options\": [\"Mr\", \"Mrs\"],\n" +
//            "\"value\": []\n" +
//            "}\n" +
//            "},\n" +
//            "\"styles\": {\n" +
//            "\"labelStyles\": {},\n" +
//            "\"anwserStyles\": {},\n" +
//            "\"placeholderStyles\": {}\n" +
//            "},\n" +
//            "\"logics\": {},\n" +
//            "\"localization\": {},\n" +
//            "\"weight\": 0,\n" +
//            "\"score\": 0,\n" +
//            "\"value\": [],\n" +
//            "\"subType\": \"Any\"\n" +
//            "},\n" +
//            "{\n" +
//            "\"id\": \"1616161-dfac-475b-8602-0770wye022\",\n" +
//            "\"type\": \"TextArea\",\n" +
//            "\"parentId\": \"28ba187e-1994-4383-815d-0c787ef64713\",\n" +
//            "\"order\": 0,\n" +
//            "\"templateQuestionId\": \"\",\n" +
//            "\"properties\": {\n" +
//            "\"label\": \"Text Area Page\",\n" +
//            "\"subLabel\": \"\",\n" +
//            "\"labelPosition\": \"Top\",\n" +
//            "\"tooltip\": \"\",\n" +
//            "\"hidden\": false,\n" +
//            "\"placeholder\": \"\",\n" +
//            "\"defaultValue\": \"\",\n" +
//            "\"required\": true,\n" +
//            "\"disabled\": false,\n" +
//            "\"entryLimit\": \"Character\",\n" +
//            "\"autocomplete\": true,\n" +
//            "\"allowSpellcheck\": true,\n" +
//            "\"textCase\": \"Tt\",\n" +
//            "\"editor\": \"PlainText\",\n" +
//            "\"fullScreen\": true,\n" +
//            "\"autoExpand\": true,\n" +
//            "\"minimumLength\": 2,\n" +
//            "\"maximumLength\": 9000\n" +
//            "},\n" +
//            "\"styles\": {\n" +
//            "\"labelStyles\": {},\n" +
//            "\"anwserStyles\": {},\n" +
//            "\"placeholderStyles\": {}\n" +
//            "},\n" +
//            "\"logics\": {},\n" +
//            "\"localization\": {},\n" +
//            "\"weight\": 0,\n" +
//            "\"score\": 0,\n" +
//            "\"value\": []\n" +
//            "},\n" +
//            "{\n" +
//            "\"id\": \"4284d0d3-dfac-475b-8602-821a38822f33\",\n" +
//            "\"type\": \"TextArea\",\n" +
//            "\"parentId\": \"28ba187e-1994-4383-815d-0c787ef64713\",\n" +
//            "\"order\": 0,\n" +
//            "\"templateQuestionId\": \"\",\n" +
//            "\"properties\": {\n" +
//            "\"label\": \"Text Area, Text Area.\",\n" +
//            "\"subLabel\": \"\",\n" +
//            "\"labelPosition\": \"Top\",\n" +
//            "\"tooltip\": \"\",\n" +
//            "\"hidden\": false,\n" +
//            "\"placeholder\": \"\",\n" +
//            "\"defaultValue\": \"\",\n" +
//            "\"required\": true,\n" +
//            "\"disabled\": false,\n" +
//            "\"entryLimit\": \"Character\",\n" +
//            "\"autocomplete\": true,\n" +
//            "\"allowSpellcheck\": true,\n" +
//            "\"textCase\": \"Tt\",\n" +
//            "\"editor\": \"RichText\",\n" +
//            "\"fullScreen\": true,\n" +
//            "\"autoExpand\": true,\n" +
//            "\"minimumLength\": 2,\n" +
//            "\"maximumLength\": 9000\n" +
//            "},\n" +
//            "\"styles\": {\n" +
//            "\"labelStyles\": {},\n" +
//            "\"anwserStyles\": {},\n" +
//            "\"placeholderStyles\": {}\n" +
//            "},\n" +
//            "\"logics\": {},\n" +
//            "\"localization\": {},\n" +
//            "\"weight\": 0,\n" +
//            "\"score\": 0,\n" +
//            "\"value\": []\n" +
//            "},\n" +
//            "{\n" +
//            "\"id\": \"c9e61a19-b337-4b7d-9715-21b9a2000d7d\",\n" +
//            "\"type\": \"Number\",\n" +
//            "\"parentId\": \"28ba187e-1994-4383-815d-0c787ef64713\",\n" +
//            "\"order\": 0,\n" +
//            "\"templateQuestionId\": \"\",\n" +
//            "\"properties\": {\n" +
//            "\"label\": \"Numeric Label\",\n" +
//            "\"subLabel\": \"\",\n" +
//            "\"labelPosition\": \"Top\",\n" +
//            "\"tooltip\": \"\",\n" +
//            "\"hidden\": false,\n" +
//            "\"placeholder\": \"Ex. 123\",\n" +
//            "\"defaultValue\": \"\",\n" +
//            "\"required\": false,\n" +
//            "\"disabled\": false,\n" +
//            "\"decimalPlaces\": 2,\n" +
//            "\"step\": 2,\n" +
//            "\"entryLimit\": \"Digit\",\n" +
//            "\"minimumValue\": 1,\n" +
//            "\"maximumValue\": 3,\n" +
//            "\"minimumDigit\": 1,\n" +
//            "\"maximumDigit\": 2\n" +
//            "},\n" +
//            "\"styles\": {\n" +
//            "\"labelStyles\": {},\n" +
//            "\"anwserStyles\": {},\n" +
//            "\"placeholderStyles\": {}\n" +
//            "},\n" +
//            "\"logics\": {},\n" +
//            "\"localization\": {},\n" +
//            "\"weight\": 0,\n" +
//            "\"score\": 0,\n" +
//            "\"value\": []\n" +
//            "},\n" +
//            "{\n" +
//            "\"id\": \"999-999\",\n" +
//            "\"type\": \"Section\",\n" +
//            "\"parentId\": \"28ba187e-1994-4383-815d-0c787ef64713\",\n" +
//            "\"order\": 0,\n" +
//            "\"templateQuestionId\": \"\",\n" +
//            "\"properties\": {\n" +
//            "\"label\": \"Section 1\",\n" +
//            "\"subLabel\": \"\",\n" +
//            "\"labelPosition\": \"Top\",\n" +
//            "\"tooltip\": \"\",\n" +
//            "\"hidden\": false,\n" +
//            "\"submit\": \"Submit\",\n" +
//            "\"next\": \"Next\",\n" +
//            "\"back\": \"Back\",\n" +
//            "\"backVisibility\": true\n" +
//            "},\n" +
//            "\"styles\": {\n" +
//            "\"labelStyles\": {\n" +
//            "\n" +
//            "}\n" +
//            "},\n" +
//            "\"logics\": {\n" +
//            "\n" +
//            "},\n" +
//            "\"localization\": {\n" +
//            "\n" +
//            "}\n" +
//            "},\n" +
//            "{\n" +
//            "\"id\": \"989897978-dfac-475b-8602-0770wye022\",\n" +
//            "\"type\": \"TextArea\",\n" +
//            "\"parentId\": \"999-999\",\n" +
//            "\"order\": 0,\n" +
//            "\"templateQuestionId\": \"\",\n" +
//            "\"properties\": {\n" +
//            "\"label\": \"Text Area, Text Area 222.\",\n" +
//            "\"subLabel\": \"\",\n" +
//            "\"labelPosition\": \"Top\",\n" +
//            "\"tooltip\": \"\",\n" +
//            "\"hidden\": false,\n" +
//            "\"placeholder\": \"\",\n" +
//            "\"defaultValue\": \"\",\n" +
//            "\"required\": true,\n" +
//            "\"disabled\": false,\n" +
//            "\"entryLimit\": \"Character\",\n" +
//            "\"autocomplete\": true,\n" +
//            "\"allowSpellcheck\": true,\n" +
//            "\"textCase\": \"Tt\",\n" +
//            "\"editor\": \"PlainText\",\n" +
//            "\"fullScreen\": true,\n" +
//            "\"autoExpand\": true,\n" +
//            "\"minimumLength\": 2,\n" +
//            "\"maximumLength\": 9000\n" +
//            "},\n" +
//            "\"styles\": {\n" +
//            "\"labelStyles\": {},\n" +
//            "\"anwserStyles\": {},\n" +
//            "\"placeholderStyles\": {}\n" +
//            "},\n" +
//            "\"logics\": {},\n" +
//            "\"localization\": {},\n" +
//            "\"weight\": 0,\n" +
//            "\"score\": 0,\n" +
//            "\"value\": []\n" +
//            "},\n" +
//            "{\n" +
//            "\"id\": \"4284d0d3-dfac-475b-8602-0770wye022\",\n" +
//            "\"type\": \"TextArea\",\n" +
//            "\"parentId\": \"999-999\",\n" +
//            "\"order\": 0,\n" +
//            "\"templateQuestionId\": \"\",\n" +
//            "\"properties\": {\n" +
//            "\"label\": \"RichText AREA\",\n" +
//            "\"subLabel\": \"\",\n" +
//            "\"labelPosition\": \"Top\",\n" +
//            "\"tooltip\": \"\",\n" +
//            "\"hidden\": false,\n" +
//            "\"placeholder\": \"\",\n" +
//            "\"defaultValue\": \"\",\n" +
//            "\"required\": true,\n" +
//            "\"disabled\": false,\n" +
//            "\"entryLimit\": \"Character\",\n" +
//            "\"autocomplete\": true,\n" +
//            "\"allowSpellcheck\": true,\n" +
//            "\"textCase\": \"Tt\",\n" +
//            "\"editor\": \"RichText\",\n" +
//            "\"fullScreen\": true,\n" +
//            "\"autoExpand\": true,\n" +
//            "\"minimumLength\": 2,\n" +
//            "\"maximumLength\": 9000\n" +
//            "},\n" +
//            "\"styles\": {\n" +
//            "\"labelStyles\": {},\n" +
//            "\"anwserStyles\": {},\n" +
//            "\"placeholderStyles\": {}\n" +
//            "},\n" +
//            "\"logics\": {},\n" +
//            "\"localization\": {},\n" +
//            "\"weight\": 0,\n" +
//            "\"score\": 0,\n" +
//            "\"value\": []\n" +
//            "},\n" +
//            "{\n" +
//            "\"id\": \"abab74f7-46e7-405e-bb5f-07070970970\",\n" +
//            "\"type\": \"Textbox\",\n" +
//            "\"parentId\": \"999-999\",\n" +
//            "\"order\": 0,\n" +
//            "\"templateQuestionId\": \"\",\n" +
//            "\"properties\": {\n" +
//            "\"label\": \"TEXT BOX SECTION \",\n" +
//            "\"subLabel\": \"\",\n" +
//            "\"labelPosition\": \"Top\",\n" +
//            "\"tooltip\": \"\",\n" +
//            "\"hidden\": false,\n" +
//            "\"placeholder\": \"Placeholder 10370192\",\n" +
//            "\"defaultValue\": \"\",\n" +
//            "\"required\": true,\n" +
//            "\"disabled\": false,\n" +
//            "\"entryLimit\": \"Character\",\n" +
//            "\"autocomplete\": true,\n" +
//            "\"allowSpellcheck\": true,\n" +
//            "\"textCase\": \"Tt\",\n" +
//            "\"maximumLength\": 2,\n" +
//            "\"minimumLength\": 1,\n" +
//            "\"prefix\": {\n" +
//            "\"display\": \"Text box\",\n" +
//            "\"value\": []\n" +
//            "},\n" +
//            "\"suffix\": {}\n" +
//            "},\n" +
//            "\"styles\": {\n" +
//            "\"labelStyles\": {},\n" +
//            "\"anwserStyles\": {},\n" +
//            "\"placeholderStyles\": {}\n" +
//            "},\n" +
//            "\"logics\": {},\n" +
//            "\"localization\": {},\n" +
//            "\"weight\": 0,\n" +
//            "\"score\": 0,\n" +
//            "\"value\": [],\n" +
//            "\"subType\": \"Any\"\n" +
//            "},\n" +
//            "{\n" +
//            "\"id\": \"abab74f7-46e7-405e-bb5f-76791hehe\",\n" +
//            "\"type\": \"Textbox\",\n" +
//            "\"parentId\": \"28ba187e-1994-4383-815d-0c787ef64713\",\n" +
//            "\"order\": 0,\n" +
//            "\"templateQuestionId\": \"\",\n" +
//            "\"properties\": {\n" +
//            "\"label\": \"BOX LABEL TEXT BOX LABEL \",\n" +
//            "\"subLabel\": \"\",\n" +
//            "\"labelPosition\": \"Top\",\n" +
//            "\"tooltip\": \"\",\n" +
//            "\"hidden\": false,\n" +
//            "\"placeholder\": \"Placeholder 22\",\n" +
//            "\"defaultValue\": \"\",\n" +
//            "\"required\": true,\n" +
//            "\"disabled\": false,\n" +
//            "\"entryLimit\": \"Character\",\n" +
//            "\"autocomplete\": true,\n" +
//            "\"allowSpellcheck\": true,\n" +
//            "\"textCase\": \"Tt\",\n" +
//            "\"maximumLength\": 2,\n" +
//            "\"minimumLength\": 1,\n" +
//            "\"prefix\": {\n" +
//            "\"display\": \"Text box\",\n" +
//            "\"value\": []\n" +
//            "},\n" +
//            "\"suffix\": {\n" +
//            "\"display\": \"Dropdown\",\n" +
//            "\"options\": [\"Mr\", \"Mrs\"],\n" +
//            "\"value\": []\n" +
//            "}\n" +
//            "},\n" +
//            "\"styles\": {\n" +
//            "\"labelStyles\": {},\n" +
//            "\"anwserStyles\": {},\n" +
//            "\"placeholderStyles\": {}\n" +
//            "},\n" +
//            "\"logics\": {},\n" +
//            "\"localization\": {},\n" +
//            "\"weight\": 0,\n" +
//            "\"score\": 0,\n" +
//            "\"value\": [],\n" +
//            "\"subType\": \"Any\"\n" +
//            "},\n" +
//            "{\n" +
//            "\"id\": \"28ba187e-1994-4383-815d-673976ey22\",\n" +
//            "\"type\": \"Page\",\n" +
//            "\"parentId\": null,\n" +
//            "\"order\": 0,\n" +
//            "\"templateQuestionId\": \"\",\n" +
//            "\"properties\": {\n" +
//            "\"label\": \"Page 2\",\n" +
//            "\"subLabel\": \"\",\n" +
//            "\"labelPosition\": \"Top\",\n" +
//            "\"tooltip\": \"\",\n" +
//            "\"hidden\": false,\n" +
//            "\"submit\": \"Submit\",\n" +
//            "\"next\": \"Next\",\n" +
//            "\"back\": \"Back\",\n" +
//            "\"backVisibility\": true\n" +
//            "},\n" +
//            "\"styles\": {\n" +
//            "\"labelStyles\": {\n" +
//            "\n" +
//            "}\n" +
//            "},\n" +
//            "\"logics\": {\n" +
//            "\n" +
//            "},\n" +
//            "\"localization\": {\n" +
//            "\n" +
//            "}\n" +
//            "},\n" +
//            "{\n" +
//            "\"id\": \"2445f139-777b-4d94-b1a9-ddf1979f7ce0\",\n" +
//            "\"type\": \"Paragraph\",\n" +
//            "\"parentId\": \"28ba187e-1994-4383-815d-673976ey22\",\n" +
//            "\"order\": 0,\n" +
//            "\"templateQuestionId\": \"\",\n" +
//            "\"properties\": {\n" +
//            "\"label\": \"<p>qweqweqwe</p>\",\n" +
//            "\"subLabel\": \"\",\n" +
//            "\"labelPosition\": \"Top\",\n" +
//            "\"tooltip\": \"\",\n" +
//            "\"hidden\": false\n" +
//            "},\n" +
//            "\"styles\": {\n" +
//            "\"labelStyles\": {}\n" +
//            "},\n" +
//            "\"logics\": {},\n" +
//            "\"localization\": {}\n" +
//            "},\n" +
//            "{\n" +
//            "\"id\": \"abab74f7-46e7-405e-bb5f-81297918279\",\n" +
//            "\"type\": \"Textbox\",\n" +
//            "\"parentId\": \"28ba187e-1994-4383-815d-673976ey22\",\n" +
//            "\"order\": 0,\n" +
//            "\"templateQuestionId\": \"\",\n" +
//            "\"properties\": {\n" +
//            "\"label\": \"TEXT BOX LABEL Page 2\",\n" +
//            "\"subLabel\": \"\",\n" +
//            "\"labelPosition\": \"Top\",\n" +
//            "\"tooltip\": \"\",\n" +
//            "\"hidden\": false,\n" +
//            "\"placeholder\": \"Placeholder\",\n" +
//            "\"defaultValue\": \"\",\n" +
//            "\"required\": true,\n" +
//            "\"disabled\": false,\n" +
//            "\"entryLimit\": \"Character\",\n" +
//            "\"autocomplete\": true,\n" +
//            "\"allowSpellcheck\": true,\n" +
//            "\"textCase\": \"Tt\",\n" +
//            "\"maximumLength\": 2,\n" +
//            "\"minimumLength\": 1,\n" +
//            "\"prefix\": {},\n" +
//            "\"suffix\": {}\n" +
//            "},\n" +
//            "\"styles\": {\n" +
//            "\"labelStyles\": {},\n" +
//            "\"anwserStyles\": {},\n" +
//            "\"placeholderStyles\": {}\n" +
//            "},\n" +
//            "\"logics\": {},\n" +
//            "\"localization\": {},\n" +
//            "\"weight\": 0,\n" +
//            "\"score\": 0,\n" +
//            "\"value\": [],\n" +
//            "\"subType\": \"Any\"\n" +
//            "}\n" +
//            "],\n" +
//            "\"logics\": [\n" +
//            "\n" +
//            "],\n" +
//            "\"warning\": {\n" +
//            "\n" +
//            "},\n" +
//            "\t\"localization\": {\n" +
//            "\n" +
//            "}\n" +
//            "}"
}

object FieldTypes {
    const val TEXT_FIELD = "TEXT_BOX"
    const val CALENDAR = "CALENDER"
}

object FieldsAdapterViewTypes {
    const val TEXT_BOX_TYPE = 0
    const val CALENDAR_TYPE = 1
}