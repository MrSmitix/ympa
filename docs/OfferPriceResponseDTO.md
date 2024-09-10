# OfferPriceResponseDTO

Информация об установленной цене на товар.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Идентификатор предложения из прайс-листа. | [optional] 
**price** | [**PriceDTO**](PriceDTO.md) |  | [optional] 
**market_sku** | **int** | SKU на Маркете. | [optional] 
**updated_at** | **datetime** | Дата и время последнего обновления цены на товар. | [optional] 

## Example

```python
from ympa_python_client.models.offer_price_response_dto import OfferPriceResponseDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferPriceResponseDTO from a JSON string
offer_price_response_dto_instance = OfferPriceResponseDTO.from_json(json)
# print the JSON string representation of the object
print(OfferPriceResponseDTO.to_json())

# convert the object into a dict
offer_price_response_dto_dict = offer_price_response_dto_instance.to_dict()
# create an instance of OfferPriceResponseDTO from a dict
offer_price_response_dto_from_dict = OfferPriceResponseDTO.from_dict(offer_price_response_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


