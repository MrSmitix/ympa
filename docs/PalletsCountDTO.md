# OpenapiClient::PalletsCountDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **planned** | **Integer** | Количество палет, которое заявил продавец. | [optional] |
| **fact** | **Integer** | Количество палет, которое приняли в сортировочном центре. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::PalletsCountDTO.new(
  planned: null,
  fact: null
)
```

