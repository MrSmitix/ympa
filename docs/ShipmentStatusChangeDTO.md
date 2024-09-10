
# Table `ShipmentStatusChangeDTO`
(mapped from: ShipmentStatusChangeDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**status** | status | long |  | [**ShipmentStatusType**](ShipmentStatusType.md) |  |  [optional] [foreignkey]
**description** | description | text |  | **kotlin.String** | Описание статуса отгрузки. |  [optional]
**updateTime** | updateTime | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Время последнего изменения статуса отгрузки. |  [optional]





