# OrderDeliveryAddressDTO

Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **str** | Страна.  Обязательный параметр.  | [optional] 
**postcode** | **str** | Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;).  | [optional] 
**city** | **str** | Город или населенный пункт.  Обязательный параметр.  | [optional] 
**district** | **str** | Район. | [optional] 
**subway** | **str** | Станция метро. | [optional] 
**street** | **str** | Улица.  Обязательный параметр.  | [optional] 
**house** | **str** | Дом или владение.  Обязательный параметр.  | [optional] 
**block** | **str** | Корпус или строение. | [optional] 
**entrance** | **str** | Подъезд. | [optional] 
**entryphone** | **str** | Код домофона. | [optional] 
**floor** | **str** | Этаж. | [optional] 
**apartment** | **str** | Квартира или офис. | [optional] 
**phone** | **str** | Телефон получателя заказа.  Обязательный параметр.  | [optional] 
**recipient** | **str** | Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  | [optional] 
**gps** | [**GpsDTO**](GpsDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.order_delivery_address_dto import OrderDeliveryAddressDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderDeliveryAddressDTO from a JSON string
order_delivery_address_dto_instance = OrderDeliveryAddressDTO.from_json(json)
# print the JSON string representation of the object
print OrderDeliveryAddressDTO.to_json()

# convert the object into a dict
order_delivery_address_dto_dict = order_delivery_address_dto_instance.to_dict()
# create an instance of OrderDeliveryAddressDTO from a dict
order_delivery_address_dto_from_dict = OrderDeliveryAddressDTO.from_dict(order_delivery_address_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


