# OrderDeliveryDTO

Информация о доставке.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).  | [optional] 
**type** | [**OrderDeliveryType**](OrderDeliveryType.md) |  | [optional] 
**service_name** | **str** | Наименование службы доставки. | [optional] 
**price** | **float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.  | [optional] 
**delivery_partner_type** | [**OrderDeliveryPartnerType**](OrderDeliveryPartnerType.md) |  | [optional] 
**courier** | [**OrderCourierDTO**](OrderCourierDTO.md) |  | [optional] 
**dates** | [**OrderDeliveryDatesDTO**](OrderDeliveryDatesDTO.md) |  | [optional] 
**region** | [**RegionDTO**](RegionDTO.md) |  | [optional] 
**address** | [**OrderDeliveryAddressDTO**](OrderDeliveryAddressDTO.md) |  | [optional] 
**vat** | [**OrderVatType**](OrderVatType.md) |  | [optional] 
**delivery_service_id** | **int** | Идентификатор службы доставки. | [optional] 
**lift_type** | [**OrderLiftType**](OrderLiftType.md) |  | [optional] 
**lift_price** | **float** | Стоимость подъема на этаж. | [optional] 
**outlet_code** | **str** | Идентификатор пункта самовывоза, присвоенный магазином. | [optional] 
**outlet_storage_limit_date** | **str** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**dispatch_type** | [**OrderDeliveryDispatchType**](OrderDeliveryDispatchType.md) |  | [optional] 
**tracks** | [**List[OrderTrackDTO]**](OrderTrackDTO.md) | Информация для отслеживания перемещений посылки. | [optional] 
**shipments** | [**List[OrderShipmentDTO]**](OrderShipmentDTO.md) | Информация о посылках. | [optional] 
**estimated** | **bool** | Приблизительная ли дата доставки. | [optional] 
**eac_type** | [**OrderDeliveryEacType**](OrderDeliveryEacType.md) |  | [optional] 
**eac_code** | **str** | Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.order_delivery_dto import OrderDeliveryDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderDeliveryDTO from a JSON string
order_delivery_dto_instance = OrderDeliveryDTO.from_json(json)
# print the JSON string representation of the object
print OrderDeliveryDTO.to_json()

# convert the object into a dict
order_delivery_dto_dict = order_delivery_dto_instance.to_dict()
# create an instance of OrderDeliveryDTO from a dict
order_delivery_dto_from_dict = OrderDeliveryDTO.from_dict(order_delivery_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


