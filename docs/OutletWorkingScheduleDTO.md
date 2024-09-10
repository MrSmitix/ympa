# OutletWorkingScheduleDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**WorkInHoliday** | **Boolean** | Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * &#x60;false&#x60; — точка продаж не работает в дни государственных праздников. * &#x60;true&#x60; — точка продаж работает в дни государственных праздников.  | [optional] 
**ScheduleItems** | [**OutletWorkingScheduleItemDTO[]**](OutletWorkingScheduleItemDTO.md) | Список расписаний работы точки продаж.  | 

## Examples

- Prepare the resource
```powershell
$OutletWorkingScheduleDTO = Initialize-ympa_powershell_clientOutletWorkingScheduleDTO  -WorkInHoliday null `
 -ScheduleItems null
```

- Convert the resource to JSON
```powershell
$OutletWorkingScheduleDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

