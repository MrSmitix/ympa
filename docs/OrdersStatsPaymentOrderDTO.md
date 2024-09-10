# OrdersStatsPaymentOrderDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Номер платежного поручения. | [optional] 
**Date** | **System.DateTime** | Дата платежного поручения.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrdersStatsPaymentOrderDTO = Initialize-ympa_powershell_clientOrdersStatsPaymentOrderDTO  -Id null `
 -Date null
```

- Convert the resource to JSON
```powershell
$OrdersStatsPaymentOrderDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

