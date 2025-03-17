# ChatApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChatCompletion**](ChatApi.md#createChatCompletion) | **POST** /chat/completions | **Starting a new project?** We recommend trying [Responses](/docs/api-reference/responses)  to take advantage of the latest OpenAI platform features. Compare [Chat Completions with Responses](/docs/guides/responses-vs-chat-completions?api-mode&#x3D;responses).  ---  Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
[**deleteChatCompletion**](ChatApi.md#deleteChatCompletion) | **DELETE** /chat/completions/{completion_id} | Delete a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; can be deleted. 
[**getChatCompletion**](ChatApi.md#getChatCompletion) | **GET** /chat/completions/{completion_id} | Get a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; will be returned. 
[**getChatCompletionMessages**](ChatApi.md#getChatCompletionMessages) | **GET** /chat/completions/{completion_id}/messages | Get the messages in a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; will be returned. 
[**listChatCompletions**](ChatApi.md#listChatCompletions) | **GET** /chat/completions | List stored Chat Completions. Only Chat Completions that have been stored with the &#x60;store&#x60; parameter set to &#x60;true&#x60; will be returned. 
[**updateChatCompletion**](ChatApi.md#updateChatCompletion) | **POST** /chat/completions/{completion_id} | Modify a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; can be modified. Currently, the only supported modification is to update the &#x60;metadata&#x60; field. 

<a name="createChatCompletion"></a>
# **createChatCompletion**
> CreateChatCompletionResponse createChatCompletion(body)

**Starting a new project?** We recommend trying [Responses](/docs/api-reference/responses)  to take advantage of the latest OpenAI platform features. Compare [Chat Completions with Responses](/docs/guides/responses-vs-chat-completions?api-mode&#x3D;responses).  ---  Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChatApi apiInstance = new ChatApi();
CreateChatCompletionRequest body = new CreateChatCompletionRequest(); // CreateChatCompletionRequest | 
try {
    CreateChatCompletionResponse result = apiInstance.createChatCompletion(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#createChatCompletion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md)|  |

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/event-stream

<a name="deleteChatCompletion"></a>
# **deleteChatCompletion**
> ChatCompletionDeleted deleteChatCompletion(completionId)

Delete a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; can be deleted. 

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChatApi apiInstance = new ChatApi();
String completionId = "completionId_example"; // String | The ID of the chat completion to delete.
try {
    ChatCompletionDeleted result = apiInstance.deleteChatCompletion(completionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#deleteChatCompletion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **completionId** | **String**| The ID of the chat completion to delete. |

### Return type

[**ChatCompletionDeleted**](ChatCompletionDeleted.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getChatCompletion"></a>
# **getChatCompletion**
> CreateChatCompletionResponse getChatCompletion(completionId)

Get a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; will be returned. 

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChatApi apiInstance = new ChatApi();
String completionId = "completionId_example"; // String | The ID of the chat completion to retrieve.
try {
    CreateChatCompletionResponse result = apiInstance.getChatCompletion(completionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getChatCompletion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **completionId** | **String**| The ID of the chat completion to retrieve. |

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getChatCompletionMessages"></a>
# **getChatCompletionMessages**
> ChatCompletionMessageList getChatCompletionMessages(completionId, after, limit, order)

Get the messages in a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; will be returned. 

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChatApi apiInstance = new ChatApi();
String completionId = "completionId_example"; // String | The ID of the chat completion to retrieve messages from.
String after = "after_example"; // String | Identifier for the last message from the previous pagination request.
Integer limit = 20; // Integer | Number of messages to retrieve.
String order = "asc"; // String | Sort order for messages by timestamp. Use `asc` for ascending order or `desc` for descending order. Defaults to `asc`.
try {
    ChatCompletionMessageList result = apiInstance.getChatCompletionMessages(completionId, after, limit, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#getChatCompletionMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **completionId** | **String**| The ID of the chat completion to retrieve messages from. |
 **after** | **String**| Identifier for the last message from the previous pagination request. | [optional]
 **limit** | **Integer**| Number of messages to retrieve. | [optional] [default to 20]
 **order** | **String**| Sort order for messages by timestamp. Use &#x60;asc&#x60; for ascending order or &#x60;desc&#x60; for descending order. Defaults to &#x60;asc&#x60;. | [optional] [default to asc] [enum: asc, desc]

### Return type

[**ChatCompletionMessageList**](ChatCompletionMessageList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listChatCompletions"></a>
# **listChatCompletions**
> ChatCompletionList listChatCompletions(model, metadata, after, limit, order)

List stored Chat Completions. Only Chat Completions that have been stored with the &#x60;store&#x60; parameter set to &#x60;true&#x60; will be returned. 

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChatApi apiInstance = new ChatApi();
String model = "model_example"; // String | The model used to generate the Chat Completions.
Metadata metadata = new Metadata(); // Metadata | A list of metadata keys to filter the Chat Completions by. Example:  `metadata[key1]=value1&metadata[key2]=value2` 
String after = "after_example"; // String | Identifier for the last chat completion from the previous pagination request.
Integer limit = 20; // Integer | Number of Chat Completions to retrieve.
String order = "asc"; // String | Sort order for Chat Completions by timestamp. Use `asc` for ascending order or `desc` for descending order. Defaults to `asc`.
try {
    ChatCompletionList result = apiInstance.listChatCompletions(model, metadata, after, limit, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#listChatCompletions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **String**| The model used to generate the Chat Completions. | [optional]
 **metadata** | [**Metadata**](.md)| A list of metadata keys to filter the Chat Completions by. Example:  &#x60;metadata[key1]&#x3D;value1&amp;metadata[key2]&#x3D;value2&#x60;  | [optional]
 **after** | **String**| Identifier for the last chat completion from the previous pagination request. | [optional]
 **limit** | **Integer**| Number of Chat Completions to retrieve. | [optional] [default to 20]
 **order** | **String**| Sort order for Chat Completions by timestamp. Use &#x60;asc&#x60; for ascending order or &#x60;desc&#x60; for descending order. Defaults to &#x60;asc&#x60;. | [optional] [default to asc] [enum: asc, desc]

### Return type

[**ChatCompletionList**](ChatCompletionList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateChatCompletion"></a>
# **updateChatCompletion**
> CreateChatCompletionResponse updateChatCompletion(body, completionId)

Modify a stored chat completion. Only Chat Completions that have been created with the &#x60;store&#x60; parameter set to &#x60;true&#x60; can be modified. Currently, the only supported modification is to update the &#x60;metadata&#x60; field. 

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.ChatApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChatApi apiInstance = new ChatApi();
CompletionsCompletionIdBody body = new CompletionsCompletionIdBody(); // CompletionsCompletionIdBody | 
String completionId = "completionId_example"; // String | The ID of the chat completion to update.
try {
    CreateChatCompletionResponse result = apiInstance.updateChatCompletion(body, completionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatApi#updateChatCompletion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CompletionsCompletionIdBody**](CompletionsCompletionIdBody.md)|  |
 **completionId** | **String**| The ID of the chat completion to update. |

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

