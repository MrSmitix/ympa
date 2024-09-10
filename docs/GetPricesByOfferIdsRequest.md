# GetPricesByOfferIdsRequest

Запрос списка цен.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **List[str]** | Список SKU.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}     | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_prices_by_offer_ids_request import GetPricesByOfferIdsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetPricesByOfferIdsRequest from a JSON string
get_prices_by_offer_ids_request_instance = GetPricesByOfferIdsRequest.from_json(json)
# print the JSON string representation of the object
print GetPricesByOfferIdsRequest.to_json()

# convert the object into a dict
get_prices_by_offer_ids_request_dict = get_prices_by_offer_ids_request_instance.to_dict()
# create an instance of GetPricesByOfferIdsRequest from a dict
get_prices_by_offer_ids_request_from_dict = GetPricesByOfferIdsRequest.from_dict(get_prices_by_offer_ids_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


