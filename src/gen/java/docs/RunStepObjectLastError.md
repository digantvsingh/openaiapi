# RunStepObjectLastError

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CodeEnum**](#CodeEnum) | One of &#x60;server_error&#x60; or &#x60;rate_limit_exceeded&#x60;. | 
**message** | **String** | A human-readable description of the error. | 

<a name="CodeEnum"></a>
## Enum: CodeEnum
Name | Value
---- | -----
SERVER_ERROR | &quot;server_error&quot;
RATE_LIMIT_EXCEEDED | &quot;rate_limit_exceeded&quot;
