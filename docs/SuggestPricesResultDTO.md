# SuggestPricesResultDTO

Результат запроса цен для продвижения.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offers** | [**List[PriceSuggestOfferDTO]**](PriceSuggestOfferDTO.md) | Список товаров с ценами для продвижения. | 

## Example

```python
from ympa_python_client.models.suggest_prices_result_dto import SuggestPricesResultDTO

# TODO update the JSON string below
json = "{}"
# create an instance of SuggestPricesResultDTO from a JSON string
suggest_prices_result_dto_instance = SuggestPricesResultDTO.from_json(json)
# print the JSON string representation of the object
print(SuggestPricesResultDTO.to_json())

# convert the object into a dict
suggest_prices_result_dto_dict = suggest_prices_result_dto_instance.to_dict()
# create an instance of SuggestPricesResultDTO from a dict
suggest_prices_result_dto_from_dict = SuggestPricesResultDTO.from_dict(suggest_prices_result_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


