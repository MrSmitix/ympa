# OpenapiClient::OfferWeightDimensionsDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **length** | **Float** | Длина упаковки в см.  |  |
| **width** | **Float** | Ширина упаковки в см.  |  |
| **height** | **Float** | Высота упаковки в см.  |  |
| **weight** | **Float** | Вес товара в кг с учетом упаковки (брутто).  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OfferWeightDimensionsDTO.new(
  length: 65.55,
  width: 50.7,
  height: 20,
  weight: 1.001
)
```

