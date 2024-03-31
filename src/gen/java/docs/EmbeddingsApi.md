# EmbeddingsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmbedding**](EmbeddingsApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.

<a name="createEmbedding"></a>
# **createEmbedding**
> CreateEmbeddingResponse createEmbedding(body)

Creates an embedding vector representing the input text.

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.EmbeddingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EmbeddingsApi apiInstance = new EmbeddingsApi();
CreateEmbeddingRequest body = new CreateEmbeddingRequest(); // CreateEmbeddingRequest | 
try {
    CreateEmbeddingResponse result = apiInstance.createEmbedding(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmbeddingsApi#createEmbedding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  |

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

