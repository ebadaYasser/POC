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

object DependencyActions{
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
      "    \"ErrorEn\": null,\n" +
      "    \"ErrorAr\": null,\n" +
      "    \"Success\": true,\n" +
      "    \"Data\": {\n" +
      "        \"Fields\": [\n" +
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
      "                \"Id\": \"0a4fe0b7-f1b3-4538-b1c3-5e0bec3bdc72\",\n" +
      "                \"TemplateQuestionId\": null,\n" +
      "                \"EnLabel\": \"TextBoxDependent Field\",\n" +
      "                \"ArLabel\": \"TextBoxDependent Field\",\n" +
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
      "                \"Id\": \"d43e2a16-7d9c-4c00-94c6-4b94d68bba81\",\n" +
      "                \"TemplateQuestionId\": null,\n" +
      "                \"EnLabel\": \"TextBoxDependency Hidden\",\n" +
      "                \"ArLabel\": \"TextBoxDependency Hidde\",\n" +
      "                \"FieldOrder\": 1,\n" +
      "                \"SectionId\": \"\",\n" +
      "                \"ConditionalView\": {\n" +
      "                    \"Action\": \"hidden\",\n" +
      "                    \"Operator\": \"and\",\n" +
      "                    \"Conditions\": [\n" +
      "                        {\n" +
      "                            \"LinkedFieldId\": \"0a4fe0b7-f1b3-4538-b1c3-5e0bec3bdc72\",\n" +
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
      "                \"Id\": \"1a18af5f-b213-4f68-967b-06cf23dece4d\",\n" +
      "                \"TemplateQuestionId\": null,\n" +
      "                \"EnLabel\": \"TextBox Multiple hidden\",\n" +
      "                \"ArLabel\": \"TextBox Multiple hidden\",\n" +
      "                \"FieldOrder\": 2,\n" +
      "                \"SectionId\": null,\n" +
      "                \"ConditionalView\": {\n" +
      "                    \"Action\": \"hidden\",\n" +
      "                    \"Operator\": \"and\",\n" +
      "                    \"Conditions\": [\n" +
      "                        {\n" +
      "                            \"LinkedFieldId\": \"0a4fe0b7-f1b3-4538-b1c3-5e0bec3bdc72\",\n" +
      "                            \"ConditionType\": \"Required\",\n" +
      "                            \"ValidatorValue\": \"\",\n" +
      "                            \"EnErrorMsg\": null,\n" +
      "                            \"ArErrorMsg\": null\n" +
      "                        },\n" +
      "                        {\n" +
      "                            \"LinkedFieldId\": \"d43e2a16-7d9c-4c00-94c6-4b94d68bba81\",\n" +
      "                            \"ConditionType\": \"Value\",\n" +
      "                            \"ValidatorValue\": \"test\",\n" +
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
      "                \"Id\": \"1f8216b9-374c-489f-9c79-6e99bba454d6\",\n" +
      "                \"TemplateQuestionId\": null,\n" +
      "                \"EnLabel\": \"Disabled Field\",\n" +
      "                \"ArLabel\": \"Disabled Field\",\n" +
      "                \"FieldOrder\": 3,\n" +
      "                \"SectionId\": null,\n" +
      "                \"ConditionalView\": {\n" +
      "                    \"Action\": \"disabled\",\n" +
      "                    \"Operator\": \"and\",\n" +
      "                    \"Conditions\": [\n" +
      "                        {\n" +
      "                            \"LinkedFieldId\": \"0a4fe0b7-f1b3-4538-b1c3-5e0bec3bdc72\",\n" +
      "                            \"ConditionType\": \"Value\",\n" +
      "                            \"ValidatorValue\": \"test\",\n" +
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
      "                \"Id\": \"faec19ff-41f2-4f28-88e7-b26f703ce33b\",\n" +
      "                \"TemplateQuestionId\": null,\n" +
      "                \"EnLabel\": \"TextBox\",\n" +
      "                \"ArLabel\": \"TextBox\",\n" +
      "                \"FieldOrder\": 4,\n" +
      "                \"SectionId\": null,\n" +
      "                \"ConditionalView\": {\n" +
      "                    \"Action\": \"hidden\",\n" +
      "                    \"Operator\": \"and\",\n" +
      "                    \"Conditions\": []\n" +
      "                },\n" +
      "                \"VisibilityView\": []\n" +
      "            },\n" +
      "            {\n" +
      "                \"ControlType\": \"CALENDER\",\n" +
      "                \"Regex\": \"\",\n" +
      "                \"EnPlaceholder\": null,\n" +
      "                \"ArPlaceholder\": null,\n" +
      "                \"Required\": false,\n" +
      "                \"HasAttachments\": false,\n" +
      "                \"HasNotes\": false,\n" +
      "                \"ResponsibleUnit\": null,\n" +
      "                \"SeverityLevel\": null,\n" +
      "                \"Id\": \"5515a4a2-e413-4c16-8289-69ebf9f52071\",\n" +
      "                \"TemplateQuestionId\": null,\n" +
      "                \"EnLabel\": \"calendar\",\n" +
      "                \"ArLabel\": \"calendar\",\n" +
      "                \"FieldOrder\": 5,\n" +
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
      "                \"Id\": \"b0b4a5e4-fd5e-42f8-8275-ec5725417602\",\n" +
      "                \"TemplateQuestionId\": null,\n" +
      "                \"EnLabel\": \"TextBox\",\n" +
      "                \"ArLabel\": \"TextBox\",\n" +
      "                \"FieldOrder\": 6,\n" +
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
      "                \"Id\": \"afe651ed-40ae-4fbd-b1e0-2f0991fc2cc1\",\n" +
      "                \"TemplateQuestionId\": null,\n" +
      "                \"EnLabel\": \"testbox\",\n" +
      "                \"ArLabel\": \"testbox\",\n" +
      "                \"FieldOrder\": 7,\n" +
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
      "                \"Id\": \"42d8bd5a-bcfe-4568-8abe-5599230197a7\",\n" +
      "                \"TemplateQuestionId\": null,\n" +
      "                \"EnLabel\": \"textbox\",\n" +
      "                \"ArLabel\": \"textbox\",\n" +
      "                \"FieldOrder\": 8,\n" +
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
      "                \"Id\": \"74d1274f-1140-4deb-8dc7-3d83a46c7e98\",\n" +
      "                \"TemplateQuestionId\": null,\n" +
      "                \"EnLabel\": \"textbox\",\n" +
      "                \"ArLabel\": \"textbox\",\n" +
      "                \"FieldOrder\": 9,\n" +
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
      "                \"Id\": \"e010816d-79f7-4401-b098-faee7d72bb34\",\n" +
      "                \"TemplateQuestionId\": null,\n" +
      "                \"EnLabel\": \"textbox\",\n" +
      "                \"ArLabel\": \"textbox\",\n" +
      "                \"FieldOrder\": 10,\n" +
      "                \"SectionId\": null,\n" +
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
}

object FieldTypes {
  const val TEXT_FIELD = "TEXT_BOX"
  const val CALENDAR = "CALENDER"
}

object FieldsAdapterViewTypes {
  const val TEXT_BOX_TYPE = 0
  const val CALENDAR_TYPE = 1
}