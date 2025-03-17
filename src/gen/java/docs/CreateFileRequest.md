# CreateFileRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file** | [**File**](File.md) | The File object (not file name) to be uploaded.  | 
**purpose** | [**PurposeEnum**](#PurposeEnum) | The intended purpose of the uploaded file. One of: - &#x60;assistants&#x60;: Used in the Assistants API - &#x60;batch&#x60;: Used in the Batch API - &#x60;fine-tune&#x60;: Used for fine-tuning - &#x60;vision&#x60;: Images used for vision fine-tuning - &#x60;user_data&#x60;: Flexible file type for any purpose - &#x60;evals&#x60;: Used for eval data sets  | 

<a name="PurposeEnum"></a>
## Enum: PurposeEnum
Name | Value
---- | -----
ASSISTANTS | &quot;assistants&quot;
BATCH | &quot;batch&quot;
FINE_TUNE | &quot;fine-tune&quot;
VISION | &quot;vision&quot;
USER_DATA | &quot;user_data&quot;
EVALS | &quot;evals&quot;
