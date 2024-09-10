# OpenapiClient::WarehouseAddressDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **city** | **String** | Город. |  |
| **street** | **String** | Улица. | [optional] |
| **number** | **String** | Номер дома. | [optional] |
| **building** | **String** | Номер строения. | [optional] |
| **block** | **String** | Номер корпуса. | [optional] |
| **gps** | [**GpsDTO**](GpsDTO.md) |  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::WarehouseAddressDTO.new(
  city: null,
  street: null,
  number: null,
  building: null,
  block: null,
  gps: null
)
```

