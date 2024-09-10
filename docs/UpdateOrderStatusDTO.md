# UpdateOrderStatusDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор заказа. | [optional] 
**Status** | [**OrderStatusType**](OrderStatusType.md) |  | [optional] 
**Substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 
**UpdateStatus** | [**OrderUpdateStatusType**](OrderUpdateStatusType.md) |  | [optional] 
**ErrorDetails** | **String** | Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;.  | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateOrderStatusDTO = Initialize-ympa_powershell_clientUpdateOrderStatusDTO  -Id null `
 -Status null `
 -Substatus null `
 -UpdateStatus null `
 -ErrorDetails null
```

- Convert the resource to JSON
```powershell
$UpdateOrderStatusDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

