# OpenapiClient::FeedPublicationFullDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file_time** | **Time** | Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] |
| **published_time** | **Time** | Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::FeedPublicationFullDTO.new(
  file_time: null,
  published_time: null
)
```

