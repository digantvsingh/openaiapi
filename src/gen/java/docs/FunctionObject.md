# FunctionObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | A description of what the function does, used by the model to choose when and how to call the function. |  [optional]
**name** | **String** | The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. | 
**parameters** | [**FunctionParameters**](FunctionParameters.md) |  |  [optional]
**strict** | **Boolean** | Whether to enable strict schema adherence when generating the function call. If set to true, the model will follow the exact schema defined in the &#x60;parameters&#x60; field. Only a subset of JSON Schema is supported when &#x60;strict&#x60; is &#x60;true&#x60;. Learn more about Structured Outputs in the [function calling guide](docs/guides/function-calling). |  [optional]
