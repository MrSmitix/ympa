# OpenapiClient::GenerateGoodsTurnoverRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании. |  |
| **date** | **Date** | Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GenerateGoodsTurnoverRequest.new(
  campaign_id: null,
  date: null
)
```

