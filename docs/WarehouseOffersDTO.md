# WarehouseOffersDTO

Информация об остатках товаров на складе.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**warehouse_id** | **int** | Идентификатор склада. | 
**offers** | [**List[WarehouseOfferDTO]**](WarehouseOfferDTO.md) | Информация об остатках. | 

## Example

```python
from ympa_python_client.models.warehouse_offers_dto import WarehouseOffersDTO

# TODO update the JSON string below
json = "{}"
# create an instance of WarehouseOffersDTO from a JSON string
warehouse_offers_dto_instance = WarehouseOffersDTO.from_json(json)
# print the JSON string representation of the object
print(WarehouseOffersDTO.to_json())

# convert the object into a dict
warehouse_offers_dto_dict = warehouse_offers_dto_instance.to_dict()
# create an instance of WarehouseOffersDTO from a dict
warehouse_offers_dto_from_dict = WarehouseOffersDTO.from_dict(warehouse_offers_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


