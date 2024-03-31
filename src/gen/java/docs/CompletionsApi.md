# CompletionsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompletion**](CompletionsApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.

<a name="createCompletion"></a>
# **createCompletion**
> CreateCompletionResponse createCompletion(body)

Creates a completion for the provided prompt and parameters.

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.CompletionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CompletionsApi apiInstance = new CompletionsApi();
CreateCompletionRequest body = new CreateCompletionRequest(); // CreateCompletionRequest | 
try {
    CreateCompletionResponse result = apiInstance.createCompletion(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompletionsApi#createCompletion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateCompletionRequest**](CreateCompletionRequest.md)|  |

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

