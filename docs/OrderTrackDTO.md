# OrderTrackDTO

Информация о трек-номере посылки (DBS).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**track_code** | **str** | Трек‑номер посылки. | [optional] 
**delivery_service_id** | **int** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | [optional] 

## Example

```python
from ympa_python_client.models.order_track_dto import OrderTrackDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderTrackDTO from a JSON string
order_track_dto_instance = OrderTrackDTO.from_json(json)
# print the JSON string representation of the object
print(OrderTrackDTO.to_json())

# convert the object into a dict
order_track_dto_dict = order_track_dto_instance.to_dict()
# create an instance of OrderTrackDTO from a dict
order_track_dto_from_dict = OrderTrackDTO.from_dict(order_track_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


