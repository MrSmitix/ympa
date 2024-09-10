
# Table `OutletWorkingScheduleItemDTO`
(mapped from: OutletWorkingScheduleItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**startDay** | startDay | long NOT NULL |  | [**DayOfWeekType**](DayOfWeekType.md) |  |  [foreignkey]
**endDay** | endDay | long NOT NULL |  | [**DayOfWeekType**](DayOfWeekType.md) |  |  [foreignkey]
**startTime** | startTime | text NOT NULL |  | **kotlin.String** | Точка продаж работает c указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;.  | 
**endTime** | endTime | text NOT NULL |  | **kotlin.String** | Точка продаж работает до указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;.  | 






