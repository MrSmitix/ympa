# OrderItemPromoDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**OrderPromoType**](OrderPromoType.md) |  | 
**Discount** | **Decimal** | Размер пользовательской скидки в валюте покупателя.  | [optional] 
**Subsidy** | **Decimal** | Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  | [optional] 
**ShopPromoId** | **String** | Идентификатор акции поставщика.  | [optional] 
**MarketPromoId** | **String** | Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;.  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderItemPromoDTO = Initialize-ympa_powershell_clientOrderItemPromoDTO  -Type null `
 -Discount null `
 -Subsidy null `
 -ShopPromoId null `
 -MarketPromoId null
```

- Convert the resource to JSON
```powershell
$OrderItemPromoDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

