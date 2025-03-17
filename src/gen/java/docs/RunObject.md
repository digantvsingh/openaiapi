# RunObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**toolResources** | [**ModifyThreadRequestToolResources**](ModifyThreadRequestToolResources.md) |  |  [optional]
**id** | **String** | The identifier, which can be referenced in API endpoints. | 
**reasoningEffort** | [**ReasoningEffort**](ReasoningEffort.md) |  |  [optional]
**object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;thread.run&#x60;. | 
**createdAt** | **Integer** | The Unix timestamp (in seconds) for when the run was created. | 
**threadId** | **String** | The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. | 
**assistantId** | **String** | The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. | 
**status** | [**StatusEnum**](#StatusEnum) | The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, &#x60;incomplete&#x60;, or &#x60;expired&#x60;. | 
**requiredAction** | [**RunObjectRequiredAction**](RunObjectRequiredAction.md) |  | 
**lastError** | [**RunObjectLastError**](RunObjectLastError.md) |  | 
**expiresAt** | **Integer** | The Unix timestamp (in seconds) for when the run will expire. | 
**startedAt** | **Integer** | The Unix timestamp (in seconds) for when the run was started. | 
**cancelledAt** | **Integer** | The Unix timestamp (in seconds) for when the run was cancelled. | 
**failedAt** | **Integer** | The Unix timestamp (in seconds) for when the run failed. | 
**completedAt** | **Integer** | The Unix timestamp (in seconds) for when the run was completed. | 
**incompleteDetails** | [**RunObjectIncompleteDetails**](RunObjectIncompleteDetails.md) |  | 
**model** | **String** | The model that the [assistant](/docs/api-reference/assistants) used for this run. | 
**instructions** | **String** | The instructions that the [assistant](/docs/api-reference/assistants) used for this run. | 
**tools** | **List&lt;OneOfRunObjectToolsItems&gt;** | The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. | 
**metadata** | [**Metadata**](Metadata.md) |  | 
**usage** | [**RunCompletionUsage**](RunCompletionUsage.md) |  | 
**temperature** | [**BigDecimal**](BigDecimal.md) | The sampling temperature used for this run. If not set, defaults to 1. |  [optional]
**topP** | [**BigDecimal**](BigDecimal.md) | The nucleus sampling value used for this run. If not set, defaults to 1. |  [optional]
**maxPromptTokens** | **Integer** | The maximum number of prompt tokens specified to have been used over the course of the run.  | 
**maxCompletionTokens** | **Integer** | The maximum number of completion tokens specified to have been used over the course of the run.  | 
**truncationStrategy** | **AllOfRunObjectTruncationStrategy** |  | 
**toolChoice** | **String** |  | 
**parallelToolCalls** | **Boolean** |  | 
**responseFormat** | **String** |  | 

<a name="ObjectEnum"></a>
## Enum: ObjectEnum
Name | Value
---- | -----
THREAD_RUN | &quot;thread.run&quot;

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
QUEUED | &quot;queued&quot;
IN_PROGRESS | &quot;in_progress&quot;
REQUIRES_ACTION | &quot;requires_action&quot;
CANCELLING | &quot;cancelling&quot;
CANCELLED | &quot;cancelled&quot;
FAILED | &quot;failed&quot;
COMPLETED | &quot;completed&quot;
INCOMPLETE | &quot;incomplete&quot;
EXPIRED | &quot;expired&quot;
