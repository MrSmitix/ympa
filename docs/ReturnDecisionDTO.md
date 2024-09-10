# ReturnDecisionDTO

Решения по возвратам.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**return_item_id** | **int** | Идентификатор товара в возврате. | [optional] 
**count** | **int** | Количество единиц товара. | [optional] 
**comment** | **str** | Комментарий. | [optional] 
**reason_type** | [**ReturnDecisionReasonType**](ReturnDecisionReasonType.md) |  | [optional] 
**subreason_type** | [**ReturnDecisionSubreasonType**](ReturnDecisionSubreasonType.md) |  | [optional] 
**decision_type** | [**ReturnDecisionType**](ReturnDecisionType.md) |  | [optional] 
**refund_amount** | **int** | Сумма возврата. | [optional] 
**partner_compensation** | **int** | Компенсация за обратную доставку. | [optional] 
**images** | **List[str]** | Список хеш-кодов фотографий товара от покупателя. | [optional] 

## Example

```python
from ympa_python_client.models.return_decision_dto import ReturnDecisionDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ReturnDecisionDTO from a JSON string
return_decision_dto_instance = ReturnDecisionDTO.from_json(json)
# print the JSON string representation of the object
print(ReturnDecisionDTO.to_json())

# convert the object into a dict
return_decision_dto_dict = return_decision_dto_instance.to_dict()
# create an instance of ReturnDecisionDTO from a dict
return_decision_dto_from_dict = ReturnDecisionDTO.from_dict(return_decision_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


