# ModelOfferDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Discount** | **Int32** | Скидка на предложение в процентах. | [optional] 
**Name** | **String** | Наименование предложения. | [optional] 
**Pos** | **Int32** | Позиция предложения в выдаче Маркета на карточке модели. | [optional] 
**PreDiscountPrice** | **Decimal** | Цена предложения без скидки магазина. | [optional] 
**Price** | **Decimal** | Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay. | [optional] 
**RegionId** | **Int64** | Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре &#x60;regionId&#x60;. Предложения, доставляемые из других регионов, показываются после них.  | [optional] 
**ShippingCost** | **Decimal** | Стоимость доставки товара в регион:  * &#x60;0&#x60; — доставка осуществляется бесплатно. * &#x60;-1&#x60; — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится.  | [optional] 
**ShopName** | **String** | Название магазина (в том виде, в котором отображается на Маркете). | [optional] 
**ShopRating** | **Int32** | Рейтинг магазина.  Возможные значения: * &#x60;-1&#x60; — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение &#x60;-1&#x60;. * &#x60;1&#x60;. * &#x60;2&#x60;. * &#x60;3&#x60;. * &#x60;4&#x60;. * &#x60;5&#x60;.  | [optional] 
**InStock** | **Int32** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  | [optional] 

## Examples

- Prepare the resource
```powershell
$ModelOfferDTO = Initialize-ympa_powershell_clientModelOfferDTO  -Discount null `
 -Name null `
 -Pos null `
 -PreDiscountPrice null `
 -Price null `
 -RegionId null `
 -ShippingCost null `
 -ShopName null `
 -ShopRating null `
 -InStock null
```

- Convert the resource to JSON
```powershell
$ModelOfferDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

