
# Table `OrderStatusChangeDTO`
(mapped from: OrderStatusChangeDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**status** | status | long NOT NULL |  | [**OrderStatusType**](OrderStatusType.md) |  |  [foreignkey]
**substatus** | substatus | long |  | [**OrderSubstatusType**](OrderSubstatusType.md) |  |  [optional] [foreignkey]
**delivery** | delivery | long |  | [**OrderStatusChangeDeliveryDTO**](OrderStatusChangeDeliveryDTO.md) |  |  [optional] [foreignkey]





