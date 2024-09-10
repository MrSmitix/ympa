# OrderDeliveryDateDTO

Информация о новой дате доставки заказа.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**to_date** | **date** | Новая дата доставки заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.order_delivery_date_dto import OrderDeliveryDateDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderDeliveryDateDTO from a JSON string
order_delivery_date_dto_instance = OrderDeliveryDateDTO.from_json(json)
# print the JSON string representation of the object
print OrderDeliveryDateDTO.to_json()

# convert the object into a dict
order_delivery_date_dto_dict = order_delivery_date_dto_instance.to_dict()
# create an instance of OrderDeliveryDateDTO from a dict
order_delivery_date_dto_from_dict = OrderDeliveryDateDTO.from_dict(order_delivery_date_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


