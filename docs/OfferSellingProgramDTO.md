# OfferSellingProgramDTO

Информация о том, по каким моделям можно продавать товар, а по каким нельзя.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**selling_program** | [**SellingProgramType**](SellingProgramType.md) |  | 
**status** | [**OfferSellingProgramStatusType**](OfferSellingProgramStatusType.md) |  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.offer_selling_program_dto import OfferSellingProgramDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferSellingProgramDTO from a JSON string
offer_selling_program_dto_instance = OfferSellingProgramDTO.from_json(json)
# print the JSON string representation of the object
print OfferSellingProgramDTO.to_json()

# convert the object into a dict
offer_selling_program_dto_dict = offer_selling_program_dto_instance.to_dict()
# create an instance of OfferSellingProgramDTO from a dict
offer_selling_program_dto_from_dict = OfferSellingProgramDTO.from_dict(offer_selling_program_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


