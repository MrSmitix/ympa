# SetReturnDecisionRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReturnItemId** | **Int64** | Идентификатор товара в возврате. | 
**DecisionType** | [**ReturnRequestDecisionType**](ReturnRequestDecisionType.md) |  | 
**Comment** | **String** | Комментарий к решению. Укажите:  * для &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60;— стоимость обратной пересылки;  * для &#x60;REPAIR&#x60; — когда вы устраните недостатки товара;  * для &#x60;DECLINE_REFUND&#x60; — причину отказа;  * для &#x60;OTHER_DECISION&#x60; — какое решение вы предлагаете.  | [optional] 

## Examples

- Prepare the resource
```powershell
$SetReturnDecisionRequest = Initialize-ympa_powershell_clientSetReturnDecisionRequest  -ReturnItemId null `
 -DecisionType null `
 -Comment null
```

- Convert the resource to JSON
```powershell
$SetReturnDecisionRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

