# ChatCompletionRequestToolMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | [**RoleEnum**](#RoleEnum) | The role of the messages author, in this case &#x60;tool&#x60;. | 
**content** | **OneOfChatCompletionRequestToolMessageContent** | The contents of the tool message. | 
**toolCallId** | **String** | Tool call that this message is responding to. | 

<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
TOOL | &quot;tool&quot;
