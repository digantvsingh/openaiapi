# FineTuningJobEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always \&quot;fine_tuning.job.event\&quot;. | 
**id** | **String** | The object identifier. | 
**createdAt** | **Integer** | The Unix timestamp (in seconds) for when the fine-tuning job was created. | 
**level** | [**LevelEnum**](#LevelEnum) | The log level of the event. | 
**message** | **String** | The message of the event. | 
**type** | [**TypeEnum**](#TypeEnum) | The type of event. |  [optional]
**data** | **Object** | The data associated with the event. |  [optional]

<a name="ObjectEnum"></a>
## Enum: ObjectEnum
Name | Value
---- | -----
FINE_TUNING_JOB_EVENT | &quot;fine_tuning.job.event&quot;

<a name="LevelEnum"></a>
## Enum: LevelEnum
Name | Value
---- | -----
INFO | &quot;info&quot;
WARN | &quot;warn&quot;
ERROR | &quot;error&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
MESSAGE | &quot;message&quot;
METRICS | &quot;metrics&quot;
