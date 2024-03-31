# FineTuningApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelFineTuningJob**](FineTuningApi.md#cancelFineTuningJob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
[**createFineTuningJob**](FineTuningApi.md#createFineTuningJob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
[**listFineTuningEvents**](FineTuningApi.md#listFineTuningEvents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
[**listPaginatedFineTuningJobs**](FineTuningApi.md#listPaginatedFineTuningJobs) | **GET** /fine_tuning/jobs | List your organization&#x27;s fine-tuning jobs 
[**retrieveFineTuningJob**](FineTuningApi.md#retrieveFineTuningJob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

<a name="cancelFineTuningJob"></a>
# **cancelFineTuningJob**
> FineTuningJob cancelFineTuningJob(fineTuningJobId)

Immediately cancel a fine-tune job. 

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.FineTuningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FineTuningApi apiInstance = new FineTuningApi();
String fineTuningJobId = "fineTuningJobId_example"; // String | The ID of the fine-tuning job to cancel. 
try {
    FineTuningJob result = apiInstance.cancelFineTuningJob(fineTuningJobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FineTuningApi#cancelFineTuningJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **String**| The ID of the fine-tuning job to cancel.  |

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFineTuningJob"></a>
# **createFineTuningJob**
> FineTuningJob createFineTuningJob(body)

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.FineTuningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FineTuningApi apiInstance = new FineTuningApi();
CreateFineTuningJobRequest body = new CreateFineTuningJobRequest(); // CreateFineTuningJobRequest | 
try {
    FineTuningJob result = apiInstance.createFineTuningJob(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FineTuningApi#createFineTuningJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateFineTuningJobRequest**](CreateFineTuningJobRequest.md)|  |

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFineTuningEvents"></a>
# **listFineTuningEvents**
> ListFineTuningJobEventsResponse listFineTuningEvents(fineTuningJobId, after, limit)

Get status updates for a fine-tuning job. 

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.FineTuningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FineTuningApi apiInstance = new FineTuningApi();
String fineTuningJobId = "fineTuningJobId_example"; // String | The ID of the fine-tuning job to get events for. 
String after = "after_example"; // String | Identifier for the last event from the previous pagination request.
Integer limit = 20; // Integer | Number of events to retrieve.
try {
    ListFineTuningJobEventsResponse result = apiInstance.listFineTuningEvents(fineTuningJobId, after, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FineTuningApi#listFineTuningEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **String**| The ID of the fine-tuning job to get events for.  |
 **after** | **String**| Identifier for the last event from the previous pagination request. | [optional]
 **limit** | **Integer**| Number of events to retrieve. | [optional] [default to 20]

### Return type

[**ListFineTuningJobEventsResponse**](ListFineTuningJobEventsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPaginatedFineTuningJobs"></a>
# **listPaginatedFineTuningJobs**
> ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobs(after, limit)

List your organization&#x27;s fine-tuning jobs 

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.FineTuningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FineTuningApi apiInstance = new FineTuningApi();
String after = "after_example"; // String | Identifier for the last job from the previous pagination request.
Integer limit = 20; // Integer | Number of fine-tuning jobs to retrieve.
try {
    ListPaginatedFineTuningJobsResponse result = apiInstance.listPaginatedFineTuningJobs(after, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FineTuningApi#listPaginatedFineTuningJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **String**| Identifier for the last job from the previous pagination request. | [optional]
 **limit** | **Integer**| Number of fine-tuning jobs to retrieve. | [optional] [default to 20]

### Return type

[**ListPaginatedFineTuningJobsResponse**](ListPaginatedFineTuningJobsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveFineTuningJob"></a>
# **retrieveFineTuningJob**
> FineTuningJob retrieveFineTuningJob(fineTuningJobId)

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.FineTuningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FineTuningApi apiInstance = new FineTuningApi();
String fineTuningJobId = "fineTuningJobId_example"; // String | The ID of the fine-tuning job. 
try {
    FineTuningJob result = apiInstance.retrieveFineTuningJob(fineTuningJobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FineTuningApi#retrieveFineTuningJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **String**| The ID of the fine-tuning job.  |

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

