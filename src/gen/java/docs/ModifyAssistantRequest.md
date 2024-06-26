# ModifyAssistantRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | **AnyOfModifyAssistantRequestModel** | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.  |  [optional]
**name** | **String** | The name of the assistant. The maximum length is 256 characters.  |  [optional]
**description** | **String** | The description of the assistant. The maximum length is 512 characters.  |  [optional]
**instructions** | **String** | The system instructions that the assistant uses. The maximum length is 32768 characters.  |  [optional]
**tools** | **List&lt;OneOfModifyAssistantRequestToolsItems&gt;** | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  |  [optional]
**fileIds** | **List&lt;String&gt;** | A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant.  |  [optional]
**metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  |  [optional]
