
# Table `FeedDownloadErrorDTO`
(mapped from: FeedDownloadErrorDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**httpStatusCode** | httpStatusCode | int |  | **kotlin.Int** | HTTP-код ошибки индексации прайс-листа. Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;.  |  [optional]
**type** | type | long |  | [**FeedDownloadErrorType**](FeedDownloadErrorType.md) |  |  [optional] [foreignkey]
**description** | description | text |  | **kotlin.String** | Описание ошибки. Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;.  |  [optional]





