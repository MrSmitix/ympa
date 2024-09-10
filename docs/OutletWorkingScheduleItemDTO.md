# OutletWorkingScheduleItemDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartDay** | [**DayOfWeekType**](DayOfWeekType.md) |  | 
**EndDay** | [**DayOfWeekType**](DayOfWeekType.md) |  | 
**StartTime** | **String** | Точка продаж работает c указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;.  | 
**EndTime** | **String** | Точка продаж работает до указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;.  | 

## Examples

- Prepare the resource
```powershell
$OutletWorkingScheduleItemDTO = Initialize-ympa_powershell_clientOutletWorkingScheduleItemDTO  -StartDay null `
 -EndDay null `
 -StartTime null `
 -EndTime null
```

- Convert the resource to JSON
```powershell
$OutletWorkingScheduleItemDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

