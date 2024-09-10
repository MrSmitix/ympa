
# Table `GenerateShelfsStatisticsRequest`
(mapped from: GenerateShelfsStatisticsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**businessId** | businessId | long NOT NULL |  | **kotlin.Long** | Идентификатор бизнеса. | 
**dateFrom** | dateFrom | date NOT NULL |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Начало периода, включительно. | 
**dateTo** | dateTo | date NOT NULL |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Конец периода, включительно. | 
**attributionType** | attributionType | long NOT NULL |  | [**ShelfsStatisticsAttributionType**](ShelfsStatisticsAttributionType.md) |  |  [foreignkey]






