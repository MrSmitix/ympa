# TurnoverDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Turnover** | [**TurnoverType**](TurnoverType.md) |  | 
**TurnoverDays** | **Double** | Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html) | [optional] 

## Examples

- Prepare the resource
```powershell
$TurnoverDTO = Initialize-ympa_powershell_clientTurnoverDTO  -Turnover null `
 -TurnoverDays null
```

- Convert the resource to JSON
```powershell
$TurnoverDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

