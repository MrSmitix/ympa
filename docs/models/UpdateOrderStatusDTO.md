

# UpdateOrderStatusDTO

Список заказов.

The class is defined in **[UpdateOrderStatusDTO.java](../../src/main/java/org/openapitools/model/UpdateOrderStatusDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Long` | Идентификатор заказа. |  [optional property]
**status** | `OrderStatusType` |  |  [optional property]
**substatus** | `OrderSubstatusType` |  |  [optional property]
**updateStatus** | `OrderUpdateStatusType` |  |  [optional property]
**errorDetails** | `String` | Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;.  |  [optional property]







