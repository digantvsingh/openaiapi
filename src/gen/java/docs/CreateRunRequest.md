# CreateRunRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assistantId** | **String** | The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. | 
**model** | **String** | The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used. |  [optional]
**instructions** | **String** | Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis. |  [optional]
**additionalInstructions** | **String** | Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions. |  [optional]
**tools** | **List&lt;OneOfCreateRunRequestToolsItems&gt;** | Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. |  [optional]
**metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  |  [optional]
