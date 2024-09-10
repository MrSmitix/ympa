# OrderDeliveryDatesDTO

Диапазон дат доставки.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from_date** | **str** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**to_date** | **str** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**from_time** | **str** | Начало интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Минимальное значение: &#x60;00:00&#x60;.  | [optional] 
**to_time** | **str** | Конец интервала времени доставки.  Передается только совместно с параметром &#x60;type&#x3D;DELIVERY&#x60;.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;. В качестве минут всегда должно быть указано &#x60;00&#x60; (исключение — &#x60;23:59&#x60;).  Максимальное значение: &#x60;23:59&#x60;.  | [optional] 
**real_delivery_date** | **str** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 

## Example

```python
from ympa_python_client.models.order_delivery_dates_dto import OrderDeliveryDatesDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderDeliveryDatesDTO from a JSON string
order_delivery_dates_dto_instance = OrderDeliveryDatesDTO.from_json(json)
# print the JSON string representation of the object
print(OrderDeliveryDatesDTO.to_json())

# convert the object into a dict
order_delivery_dates_dto_dict = order_delivery_dates_dto_instance.to_dict()
# create an instance of OrderDeliveryDatesDTO from a dict
order_delivery_dates_dto_from_dict = OrderDeliveryDatesDTO.from_dict(order_delivery_dates_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


