# OrderItemDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  | [optional] 
**OfferId** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**OfferName** | **String** | Название товара. | [optional] 
**Price** | **Decimal** | Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр &#x60;subsidies&#x60;).  | [optional] 
**BuyerPrice** | **Decimal** | Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам.  | [optional] 
**BuyerPriceBeforeDiscount** | **Decimal** | Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] 
**PriceBeforeDiscount** | **Decimal** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок.  | [optional] 
**Count** | **Int32** | Количество единиц товара. | [optional] 
**Vat** | [**OrderVatType**](OrderVatType.md) |  | [optional] 
**ShopSku** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**Subsidy** | **Decimal** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;subsidies&#x60;.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа.  | [optional] 
**PartnerWarehouseId** | **String** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ.  | [optional] 
**Promos** | [**OrderItemPromoDTO[]**](OrderItemPromoDTO.md) | Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям. | [optional] 
**Instances** | [**OrderItemInstanceDTO[]**](OrderItemInstanceDTO.md) | Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, &#x60;instances&#x60; отсутствует.  | [optional] 
**Details** | [**OrderItemDetailDTO[]**](OrderItemDetailDTO.md) | Информация об удалении товара из заказа.  | [optional] 
**Subsidies** | [**OrderItemSubsidyDTO[]**](OrderItemSubsidyDTO.md) | Список субсидий по типам. | [optional] 
**RequiredInstanceTypes** | [**OrderItemInstanceType[]**](OrderItemInstanceType.md) | Список необходимых маркировок товара. | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderItemDTO = Initialize-ympa_powershell_clientOrderItemDTO  -Id null `
 -OfferId null `
 -OfferName null `
 -Price null `
 -BuyerPrice null `
 -BuyerPriceBeforeDiscount null `
 -PriceBeforeDiscount null `
 -Count null `
 -Vat null `
 -ShopSku null `
 -Subsidy null `
 -PartnerWarehouseId null `
 -Promos null `
 -Instances null `
 -Details null `
 -Subsidies null `
 -RequiredInstanceTypes null
```

- Convert the resource to JSON
```powershell
$OrderItemDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

