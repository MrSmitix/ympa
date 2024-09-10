# WWW::OpenAPIClient::Object::FeedIndexLogsErrorDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::FeedIndexLogsErrorDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**http_status_code** | **int** | HTTP-код ошибки индексации прайс-листа.  Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;.  | [optional] 
**type** | [**FeedIndexLogsErrorType**](FeedIndexLogsErrorType.md) |  | [optional] 
**description** | **string** | Описание ошибки.  Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


