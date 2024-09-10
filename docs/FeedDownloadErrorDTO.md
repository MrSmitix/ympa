# OpenapiClient::FeedDownloadErrorDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **http_status_code** | **Integer** | HTTP-код ошибки индексации прайс-листа. Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;.  | [optional] |
| **type** | [**FeedDownloadErrorType**](FeedDownloadErrorType.md) |  | [optional] |
| **description** | **String** | Описание ошибки. Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::FeedDownloadErrorDTO.new(
  http_status_code: null,
  type: null,
  description: null
)
```

