# FeedIndexLogsErrorDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**http_status_code** | **i32** | HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`.  | [optional] [default to None]
**r#type** | [***models::FeedIndexLogsErrorType**](FeedIndexLogsErrorType.md) |  | [optional] [default to None]
**description** | **String** | Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


