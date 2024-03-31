# ChatApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChatCompletion**](ChatApi.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.

<a name="createChatCompletion"></a>
# **createChatCompletion**
> CreateChatCompletionResponse createChatCompletion(body)

Creates a model response for the given chat conversation.

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
 - **Accept**: application/json

