
# Table `AcceptOrderCancellationRequest`
(mapped from: AcceptOrderCancellationRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**accepted** | accepted | boolean NOT NULL |  | **kotlin.Boolean** | Решение об отмене заказа:  * &#x60;true&#x60; — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * &#x60;false&#x60; — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов.  | 
**reason** | reason | long |  | [**OrderCancellationReasonType**](OrderCancellationReasonType.md) |  |  [optional] [foreignkey]




