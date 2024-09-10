
# Table `TimePeriodDTO`
(mapped from: TimePeriodDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**timePeriod** | timePeriod | int NOT NULL |  | **kotlin.Int** | Продолжительность в указанных единицах. | 
**timeUnit** | timeUnit | long NOT NULL |  | [**TimeUnitType**](TimeUnitType.md) |  |  [foreignkey]
**comment** | comment | text |  | **kotlin.String** | Комментарий. |  [optional]





