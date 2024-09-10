# SetReturnDecisionRequest

Решения по позиции в возврате.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**return_item_id** | **int** | Идентификатор товара в возврате. | 
**decision_type** | [**ReturnRequestDecisionType**](ReturnRequestDecisionType.md) |  | 
**comment** | **str** | Комментарий к решению. Укажите:  * для &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60;— стоимость обратной пересылки;  * для &#x60;REPAIR&#x60; — когда вы устраните недостатки товара;  * для &#x60;DECLINE_REFUND&#x60; — причину отказа;  * для &#x60;OTHER_DECISION&#x60; — какое решение вы предлагаете.  | [optional] 

## Example

```python
from ympa_python_client.models.set_return_decision_request import SetReturnDecisionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SetReturnDecisionRequest from a JSON string
set_return_decision_request_instance = SetReturnDecisionRequest.from_json(json)
# print the JSON string representation of the object
print(SetReturnDecisionRequest.to_json())

# convert the object into a dict
set_return_decision_request_dict = set_return_decision_request_instance.to_dict()
# create an instance of SetReturnDecisionRequest from a dict
set_return_decision_request_from_dict = SetReturnDecisionRequest.from_dict(set_return_decision_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


