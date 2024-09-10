
# Table `UpdateOrderStatusDTO`
(mapped from: UpdateOrderStatusDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор заказа. |  [optional]
**status** | status | long |  | [**OrderStatusType**](OrderStatusType.md) |  |  [optional] [foreignkey]
**substatus** | substatus | long |  | [**OrderSubstatusType**](OrderSubstatusType.md) |  |  [optional] [foreignkey]
**updateStatus** | updateStatus | long |  | [**OrderUpdateStatusType**](OrderUpdateStatusType.md) |  |  [optional] [foreignkey]
**errorDetails** | errorDetails | text |  | **kotlin.String** | Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;.  |  [optional]







