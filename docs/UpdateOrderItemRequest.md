# UpdateOrderItemRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**OrderItemModificationDTO[]**](OrderItemModificationDTO.md) | Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр.  | 
**Reason** | [**OrderItemsModificationRequestReasonType**](OrderItemsModificationRequestReasonType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateOrderItemRequest = Initialize-ympa_powershell_clientUpdateOrderItemRequest  -Items null `
 -Reason null
```

- Convert the resource to JSON
```powershell
$UpdateOrderItemRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

