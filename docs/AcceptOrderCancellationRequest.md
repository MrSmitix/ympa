# AcceptOrderCancellationRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Accepted** | **Boolean** | Решение об отмене заказа:  * &#x60;true&#x60; — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * &#x60;false&#x60; — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов.  | 
**Reason** | [**OrderCancellationReasonType**](OrderCancellationReasonType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AcceptOrderCancellationRequest = Initialize-ympa_powershell_clientAcceptOrderCancellationRequest  -Accepted null `
 -Reason null
```

- Convert the resource to JSON
```powershell
$AcceptOrderCancellationRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

