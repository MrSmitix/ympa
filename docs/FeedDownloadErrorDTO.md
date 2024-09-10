

# FeedDownloadErrorDTO

Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**httpStatusCode** | **Integer** | HTTP-код ошибки индексации прайс-листа. Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;.  |  [optional] |
|**type** | **FeedDownloadErrorType** |  |  [optional] |
|**description** | **String** | Описание ошибки. Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;.  |  [optional] |



