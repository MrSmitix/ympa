# ParcelBoxLabelDTO

Информация о ярлыке для коробки.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** | Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).  | 
**supplier_name** | **str** | Юридическое название магазина. | 
**delivery_service_name** | **str** | Юридическое название службы доставки. | 
**order_id** | **int** | Идентификатор заказа в системе Маркета. | 
**order_num** | **str** | Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина.  | 
**recipient_name** | **str** | Фамилия и инициалы получателя заказа. | 
**box_id** | **int** | Идентификатор коробки. | 
**fulfilment_id** | **str** | Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д.  | 
**place** | **str** | Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;.  | 
**weight** | **str** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;.  | 
**delivery_service_id** | **str** | Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). | 
**delivery_address** | **str** | Адрес получателя. | [optional] 
**shipment_date** | **str** | Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;. | [optional] 

## Example

```python
from ympa_python_client.models.parcel_box_label_dto import ParcelBoxLabelDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ParcelBoxLabelDTO from a JSON string
parcel_box_label_dto_instance = ParcelBoxLabelDTO.from_json(json)
# print the JSON string representation of the object
print(ParcelBoxLabelDTO.to_json())

# convert the object into a dict
parcel_box_label_dto_dict = parcel_box_label_dto_instance.to_dict()
# create an instance of ParcelBoxLabelDTO from a dict
parcel_box_label_dto_from_dict = ParcelBoxLabelDTO.from_dict(parcel_box_label_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


