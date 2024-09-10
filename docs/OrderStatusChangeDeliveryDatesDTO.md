# OrderStatusChangeDeliveryDatesDTO

Диапазон дат доставки.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**real_delivery_date** | **date** | **Только для модели DBS**  Фактическая дата доставки. &lt;br&gt;&lt;br&gt; Когда передавать параметр &#x60;realDeliveryDate&#x60;:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60;;   * меняете статус заказа на &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60; в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60; не в день доставки. Нельзя указывать дату доставки в будущем.    {% note warning \&quot;Индекс качества\&quot; %}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {% endnote %}       | [optional] 

## Example

```python
from ympa_python_client.models.order_status_change_delivery_dates_dto import OrderStatusChangeDeliveryDatesDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderStatusChangeDeliveryDatesDTO from a JSON string
order_status_change_delivery_dates_dto_instance = OrderStatusChangeDeliveryDatesDTO.from_json(json)
# print the JSON string representation of the object
print(OrderStatusChangeDeliveryDatesDTO.to_json())

# convert the object into a dict
order_status_change_delivery_dates_dto_dict = order_status_change_delivery_dates_dto_instance.to_dict()
# create an instance of OrderStatusChangeDeliveryDatesDTO from a dict
order_status_change_delivery_dates_dto_from_dict = OrderStatusChangeDeliveryDatesDTO.from_dict(order_status_change_delivery_dates_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


