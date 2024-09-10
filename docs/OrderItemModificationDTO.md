# OrderItemModificationDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр.  | 
**Count** | **Int32** | Новое количество товара. | 
**Instances** | [**BriefOrderItemInstanceDTO[]**](BriefOrderItemInstanceDTO.md) | Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderItemModificationDTO = Initialize-ympa_powershell_clientOrderItemModificationDTO  -Id null `
 -Count null `
 -Instances null
```

- Convert the resource to JSON
```powershell
$OrderItemModificationDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

