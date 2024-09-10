# OpenapiClient::CalculateTariffsOfferDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **category_id** | **Integer** | Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  |  |
| **price** | **Float** | Цена на товар в рублях. |  |
| **length** | **Float** | Длина товара в сантиметрах. |  |
| **width** | **Float** | Ширина товара в сантиметрах. |  |
| **height** | **Float** | Высота товара в сантиметрах. |  |
| **weight** | **Float** | Вес товара в килограммах. |  |
| **quantity** | **Integer** | Квант продажи — количество единиц товара в одном товарном предложении. | [optional][default to 1] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::CalculateTariffsOfferDTO.new(
  category_id: null,
  price: null,
  length: null,
  width: null,
  height: null,
  weight: null,
  quantity: null
)
```

