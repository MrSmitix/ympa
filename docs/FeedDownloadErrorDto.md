# FeedDownloadErrorDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**http_status_code** | Option<**i32**> | HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`.  | [optional]
**r#type** | Option<[**models::FeedDownloadErrorType**](FeedDownloadErrorType.md)> |  | [optional]
**description** | Option<**String**> | Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`.  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


