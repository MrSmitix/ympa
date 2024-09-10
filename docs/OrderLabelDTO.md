# OrderLabelDTO

Данные для печати ярлыка.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order_id** | **int** | Идентификатор заказа. | 
**places_number** | **int** | Количество коробок в заказе. | 
**url** | **str** | URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).  | 
**parcel_box_labels** | [**List[ParcelBoxLabelDTO]**](ParcelBoxLabelDTO.md) | Информация на ярлыке. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.order_label_dto import OrderLabelDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderLabelDTO from a JSON string
order_label_dto_instance = OrderLabelDTO.from_json(json)
# print the JSON string representation of the object
print OrderLabelDTO.to_json()

# convert the object into a dict
order_label_dto_dict = order_label_dto_instance.to_dict()
# create an instance of OrderLabelDTO from a dict
order_label_dto_from_dict = OrderLabelDTO.from_dict(order_label_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


