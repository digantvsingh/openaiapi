# ModerationsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createModeration**](ModerationsApi.md#createModeration) | **POST** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 

<a name="createModeration"></a>
# **createModeration**
> CreateModerationResponse createModeration(body)

Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.ModerationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ModerationsApi apiInstance = new ModerationsApi();
CreateModerationRequest body = new CreateModerationRequest(); // CreateModerationRequest | 
try {
    CreateModerationResponse result = apiInstance.createModeration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModerationsApi#createModeration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateModerationRequest**](CreateModerationRequest.md)|  |

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

