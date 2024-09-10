

# FeedIndexLogsErrorDTO

Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (`index-log-record status=ERROR`). 

The class is defined in **[FeedIndexLogsErrorDTO.java](../../src/main/java/org/openapitools/model/FeedIndexLogsErrorDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**httpStatusCode** | `Integer` | HTTP-код ошибки индексации прайс-листа.  Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;.  |  [optional property]
**type** | `FeedIndexLogsErrorType` |  |  [optional property]
**description** | `String` | Описание ошибки.  Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;.  |  [optional property]





