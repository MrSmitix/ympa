# AcceptOrderCancellationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accepted** | **bool** | Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов.  | 
**reason** | [***models::OrderCancellationReasonType**](OrderCancellationReasonType.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


