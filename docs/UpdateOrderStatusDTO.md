

# UpdateOrderStatusDTO

Список заказов.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Идентификатор заказа. |  [optional]
**status** | **OrderStatusType** |  |  [optional]
**substatus** | **OrderSubstatusType** |  |  [optional]
**updateStatus** | **OrderUpdateStatusType** |  |  [optional]
**errorDetails** | **String** | Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;.  |  [optional]



