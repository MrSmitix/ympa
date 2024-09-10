# AcceptOrderCancellationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accepted** | **bool** | Решение об отмене заказа:  * &#x60;true&#x60; — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * &#x60;false&#x60; — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов.  | 
**reason** | [**OrderCancellationReasonType**](OrderCancellationReasonType.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.accept_order_cancellation_request import AcceptOrderCancellationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AcceptOrderCancellationRequest from a JSON string
accept_order_cancellation_request_instance = AcceptOrderCancellationRequest.from_json(json)
# print the JSON string representation of the object
print(AcceptOrderCancellationRequest.to_json())

# convert the object into a dict
accept_order_cancellation_request_dict = accept_order_cancellation_request_instance.to_dict()
# create an instance of AcceptOrderCancellationRequest from a dict
accept_order_cancellation_request_from_dict = AcceptOrderCancellationRequest.from_dict(accept_order_cancellation_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


