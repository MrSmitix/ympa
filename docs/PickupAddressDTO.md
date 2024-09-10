# OpenapiClient::PickupAddressDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | **String** | Страна. | [optional] |
| **city** | **String** | Город. | [optional] |
| **street** | **String** | Улица. | [optional] |
| **house** | **String** | Номер дома. | [optional] |
| **postcode** | **String** | Почтовый индекс. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::PickupAddressDTO.new(
  country: Россия,
  city: Москва,
  street: Стрелецкая улица,
  house: 9к2,
  postcode: 123518
)
```

