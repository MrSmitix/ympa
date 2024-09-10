# OpenapiClient::LogisticPickupPointDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор пункта вывоза. | [optional] |
| **name** | **String** | Название пункта вывоза. | [optional] |
| **address** | [**PickupAddressDTO**](PickupAddressDTO.md) |  | [optional] |
| **instruction** | **String** | Дополнительные инструкции к вывозу. | [optional] |
| **type** | [**LogisticPointType**](LogisticPointType.md) |  | [optional] |
| **logistic_partner_id** | **Integer** | Идентификатор логистического партнера, к которому относится логистическая точка. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::LogisticPickupPointDTO.new(
  id: null,
  name: null,
  address: null,
  instruction: null,
  type: null,
  logistic_partner_id: null
)
```

