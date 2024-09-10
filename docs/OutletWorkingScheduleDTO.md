
# Table `OutletWorkingScheduleDTO`
(mapped from: OutletWorkingScheduleDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**scheduleItems** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OutletWorkingScheduleItemDTO&gt;**](OutletWorkingScheduleItemDTO.md) | Список расписаний работы точки продаж.  | 
**workInHoliday** | workInHoliday | boolean |  | **kotlin.Boolean** | Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * &#x60;false&#x60; — точка продаж не работает в дни государственных праздников. * &#x60;true&#x60; — точка продаж работает в дни государственных праздников.  |  [optional]


# **Table `OutletWorkingScheduleDTOOutletWorkingScheduleItemDTO`**
(mapped from: OutletWorkingScheduleDTOOutletWorkingScheduleItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
outletWorkingScheduleDTO | outletWorkingScheduleDTO | long | | kotlin.Long | Primary Key | *one*
outletWorkingScheduleItemDTO | outletWorkingScheduleItemDTO | long | | kotlin.Long | Foreign Key | *many*




