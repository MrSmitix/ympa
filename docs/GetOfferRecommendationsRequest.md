# GetOfferRecommendationsRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **List[str]** | Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. | [optional] 
**cofinance_price_filter** | [**FieldStateType**](FieldStateType.md) |  | [optional] 
**recommended_cofinance_price_filter** | [**FieldStateType**](FieldStateType.md) |  | [optional] 
**competitiveness_filter** | [**PriceCompetitivenessType**](PriceCompetitivenessType.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_offer_recommendations_request import GetOfferRecommendationsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetOfferRecommendationsRequest from a JSON string
get_offer_recommendations_request_instance = GetOfferRecommendationsRequest.from_json(json)
# print the JSON string representation of the object
print GetOfferRecommendationsRequest.to_json()

# convert the object into a dict
get_offer_recommendations_request_dict = get_offer_recommendations_request_instance.to_dict()
# create an instance of GetOfferRecommendationsRequest from a dict
get_offer_recommendations_request_from_dict = GetOfferRecommendationsRequest.from_dict(get_offer_recommendations_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


