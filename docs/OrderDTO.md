# OrderDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор заказа. | [optional] 
**Status** | [**OrderStatusType**](OrderStatusType.md) |  | [optional] 
**Substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 
**CreationDate** | **String** |  | [optional] 
**UpdatedAt** | **String** |  | [optional] 
**Currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] 
**ItemsTotal** | **Decimal** | Платеж покупателя.  | [optional] 
**DeliveryTotal** | **Decimal** | Стоимость доставки.  | [optional] 
**BuyerItemsTotal** | **Decimal** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  | [optional] 
**BuyerTotal** | **Decimal** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  | [optional] 
**BuyerItemsTotalBeforeDiscount** | **Decimal** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] 
**BuyerTotalBeforeDiscount** | **Decimal** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).  | [optional] 
**PaymentType** | [**OrderPaymentType**](OrderPaymentType.md) |  | [optional] 
**PaymentMethod** | [**OrderPaymentMethodType**](OrderPaymentMethodType.md) |  | [optional] 
**Fake** | **Boolean** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] 
**Items** | [**OrderItemDTO[]**](OrderItemDTO.md) | Список товаров в заказе. | 
**Subsidies** | [**OrderSubsidyDTO[]**](OrderSubsidyDTO.md) | Список субсидий по типам. | [optional] 
**Delivery** | [**OrderDeliveryDTO**](OrderDeliveryDTO.md) |  | [optional] 
**Buyer** | [**OrderBuyerDTO**](OrderBuyerDTO.md) |  | [optional] 
**Notes** | **String** | Комментарий к заказу. | [optional] 
**TaxSystem** | [**OrderTaxSystemType**](OrderTaxSystemType.md) |  | [optional] 
**CancelRequested** | **Boolean** | **Только для модели DBS**  Запрошена ли отмена.  | [optional] 
**ExpiryDate** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderDTO = Initialize-ympa_powershell_clientOrderDTO  -Id null `
 -Status null `
 -Substatus null `
 -CreationDate 23-09-2022 09:12:41 `
 -UpdatedAt 23-09-2022 09:12:41 `
 -Currency null `
 -ItemsTotal null `
 -DeliveryTotal null `
 -BuyerItemsTotal null `
 -BuyerTotal null `
 -BuyerItemsTotalBeforeDiscount null `
 -BuyerTotalBeforeDiscount null `
 -PaymentType null `
 -PaymentMethod null `
 -Fake null `
 -Items null `
 -Subsidies null `
 -Delivery null `
 -Buyer null `
 -Notes null `
 -TaxSystem null `
 -CancelRequested null `
 -ExpiryDate 23-09-2022 09:12:41
```

- Convert the resource to JSON
```powershell
$OrderDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

