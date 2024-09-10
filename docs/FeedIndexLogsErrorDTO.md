# ympa_r_client::FeedIndexLogsErrorDTO

Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (`index-log-record status=ERROR`). 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**httpStatusCode** | **integer** | HTTP-код ошибки индексации прайс-листа.  Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;.  | [optional] 
**type** | [**FeedIndexLogsErrorType**](FeedIndexLogsErrorType.md) |  | [optional] [Enum: ] 
**description** | **character** | Описание ошибки.  Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;.  | [optional] 


