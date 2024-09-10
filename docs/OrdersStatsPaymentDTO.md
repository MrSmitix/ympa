# OrdersStatsPaymentDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Идентификатор денежного перевода. | [optional] 
**Date** | **System.DateTime** | Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**Type** | [**OrdersStatsPaymentType**](OrdersStatsPaymentType.md) |  | [optional] 
**Source** | [**OrdersStatsPaymentSourceType**](OrdersStatsPaymentSourceType.md) |  | [optional] 
**Total** | **Decimal** | Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  | [optional] 
**PaymentOrder** | [**OrdersStatsPaymentOrderDTO**](OrdersStatsPaymentOrderDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrdersStatsPaymentDTO = Initialize-ympa_powershell_clientOrdersStatsPaymentDTO  -Id null `
 -Date null `
 -Type null `
 -Source null `
 -Total null `
 -PaymentOrder null
```

- Convert the resource to JSON
```powershell
$OrdersStatsPaymentDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

