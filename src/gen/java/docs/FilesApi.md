# FilesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFile**](FilesApi.md#createFile) | **POST** /files | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**deleteFile**](FilesApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**downloadFile**](FilesApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**listFiles**](FilesApi.md#listFiles) | **GET** /files | Returns a list of files that belong to the user&#x27;s organization.
[**retrieveFile**](FilesApi.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.

<a name="createFile"></a>
# **createFile**
> OpenAIFile createFile(file, purpose)

Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilesApi apiInstance = new FilesApi();
File file = new File("file_example"); // File | 
String purpose = "purpose_example"; // String | 
try {
    OpenAIFile result = apiInstance.createFile(file, purpose);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#createFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |
 **purpose** | **String**|  | [enum: fine-tune, assistants]

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="deleteFile"></a>
# **deleteFile**
> DeleteFileResponse deleteFile(fileId)

Delete a file.

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilesApi apiInstance = new FilesApi();
String fileId = "fileId_example"; // String | The ID of the file to use for this request.
try {
    DeleteFileResponse result = apiInstance.deleteFile(fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#deleteFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to use for this request. |

### Return type

[**DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="downloadFile"></a>
# **downloadFile**
> String downloadFile(fileId)

Returns the contents of the specified file.

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilesApi apiInstance = new FilesApi();
String fileId = "fileId_example"; // String | The ID of the file to use for this request.
try {
    String result = apiInstance.downloadFile(fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#downloadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to use for this request. |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFiles"></a>
# **listFiles**
> ListFilesResponse listFiles(purpose)

Returns a list of files that belong to the user&#x27;s organization.

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilesApi apiInstance = new FilesApi();
String purpose = "purpose_example"; // String | Only return files with the given purpose.
try {
    ListFilesResponse result = apiInstance.listFiles(purpose);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#listFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purpose** | **String**| Only return files with the given purpose. | [optional]

### Return type

[**ListFilesResponse**](ListFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveFile"></a>
# **retrieveFile**
> OpenAIFile retrieveFile(fileId)

Returns information about a specific file.

### Example
```java
// Import classes:
//import com.openapi.ApiClient;
//import com.openapi.ApiException;
//import com.openapi.Configuration;
//import com.openapi.auth.*;
//import com.openapi.client.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilesApi apiInstance = new FilesApi();
String fileId = "fileId_example"; // String | The ID of the file to use for this request.
try {
    OpenAIFile result = apiInstance.retrieveFile(fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#retrieveFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to use for this request. |

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

