# OpenapiClient::OrderCourierDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **full_name** | **String** | Полное имя курьера. | [optional] |
| **phone** | **String** | Номер телефона курьера. | [optional] |
| **phone_extension** | **String** | Добавочный номер телефона. | [optional] |
| **vehicle_number** | **String** | Номер транспортного средства. | [optional] |
| **vehicle_description** | **String** | Описание машины. Например, модель и цвет. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderCourierDTO.new(
  full_name: null,
  phone: null,
  phone_extension: null,
  vehicle_number: null,
  vehicle_description: null
)
```

