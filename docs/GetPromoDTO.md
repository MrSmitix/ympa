# OpenapiClient::GetPromoDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Идентификатор акции. |  |
| **name** | **String** | Название акции. |  |
| **period** | [**PromoPeriodDTO**](PromoPeriodDTO.md) |  |  |
| **participating** | **Boolean** | Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  |  |
| **assortment_info** | [**GetPromoAssortmentInfoDTO**](GetPromoAssortmentInfoDTO.md) |  |  |
| **mechanics_info** | [**GetPromoMechanicsInfoDTO**](GetPromoMechanicsInfoDTO.md) |  |  |
| **bestseller_info** | [**GetPromoBestsellerInfoDTO**](GetPromoBestsellerInfoDTO.md) |  |  |
| **channels** | [**Array&lt;ChannelType&gt;**](ChannelType.md) | Список каналов продвижения товаров. | [optional] |
| **constraints** | [**GetPromoConstraintsDTO**](GetPromoConstraintsDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetPromoDTO.new(
  id: null,
  name: null,
  period: null,
  participating: null,
  assortment_info: null,
  mechanics_info: null,
  bestseller_info: null,
  channels: null,
  constraints: null
)
```

