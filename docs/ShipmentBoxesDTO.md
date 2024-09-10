# ShipmentBoxesDTO

В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**boxes** | [**List[ParcelBoxDTO]**](ParcelBoxDTO.md) | Список грузовых мест. Маркет определил количество мест по длине этого списка.  | 

## Example

```python
from ympa_python_client.models.shipment_boxes_dto import ShipmentBoxesDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ShipmentBoxesDTO from a JSON string
shipment_boxes_dto_instance = ShipmentBoxesDTO.from_json(json)
# print the JSON string representation of the object
print(ShipmentBoxesDTO.to_json())

# convert the object into a dict
shipment_boxes_dto_dict = shipment_boxes_dto_instance.to_dict()
# create an instance of ShipmentBoxesDTO from a dict
shipment_boxes_dto_from_dict = ShipmentBoxesDTO.from_dict(shipment_boxes_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


