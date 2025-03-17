# ThreadObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier, which can be referenced in API endpoints. | 
**object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;thread&#x60;. | 
**createdAt** | **Integer** | The Unix timestamp (in seconds) for when the thread was created. | 
**toolResources** | [**ModifyThreadRequestToolResources**](ModifyThreadRequestToolResources.md) |  | 
**metadata** | [**Metadata**](Metadata.md) |  | 

<a name="ObjectEnum"></a>
## Enum: ObjectEnum
Name | Value
---- | -----
THREAD | &quot;thread&quot;
