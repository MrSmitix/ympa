# ympa_r_client::FeedDownloadErrorDTO

Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**httpStatusCode** | **integer** | HTTP-код ошибки индексации прайс-листа. Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;.  | [optional] 
**type** | [**FeedDownloadErrorType**](FeedDownloadErrorType.md) |  | [optional] [Enum: ] 
**description** | **character** | Описание ошибки. Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;.  | [optional] 


