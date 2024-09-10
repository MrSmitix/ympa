
# Table `OrderStateDTO`
(mapped from: OrderStateDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор заказа. | 
**status** | status | long NOT NULL |  | [**OrderStatusType**](OrderStatusType.md) |  |  [foreignkey]
**substatus** | substatus | long |  | [**OrderSubstatusType**](OrderSubstatusType.md) |  |  [optional] [foreignkey]





