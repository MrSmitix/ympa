# SetOrderDeliveryTrackCodeRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**track_code** | **str** | Трек‑номер посылки. | 
**delivery_service_id** | **int** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | 

## Example

```python
from ympa_python_client.models.set_order_delivery_track_code_request import SetOrderDeliveryTrackCodeRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SetOrderDeliveryTrackCodeRequest from a JSON string
set_order_delivery_track_code_request_instance = SetOrderDeliveryTrackCodeRequest.from_json(json)
# print the JSON string representation of the object
print(SetOrderDeliveryTrackCodeRequest.to_json())

# convert the object into a dict
set_order_delivery_track_code_request_dict = set_order_delivery_track_code_request_instance.to_dict()
# create an instance of SetOrderDeliveryTrackCodeRequest from a dict
set_order_delivery_track_code_request_from_dict = SetOrderDeliveryTrackCodeRequest.from_dict(set_order_delivery_track_code_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


