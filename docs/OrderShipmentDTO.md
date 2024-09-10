# OrderShipmentDTO

Список посылок.  В параметре может указываться несколько посылок. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор посылки, присвоенный Маркетом. | [optional] 
**shipment_date** | **str** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**shipment_time** | **str** | **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус &#x60;READY_TO_SHIP&#x60;. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.  | [optional] 
**tracks** | [**List[OrderTrackDTO]**](OrderTrackDTO.md) | **Только для модели DBS**  Информация для отслеживания перемещений посылки.  | [optional] 
**boxes** | [**List[OrderParcelBoxDTO]**](OrderParcelBoxDTO.md) | Список грузовых мест. | [optional] 

## Example

```python
from ympa_python_client.models.order_shipment_dto import OrderShipmentDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderShipmentDTO from a JSON string
order_shipment_dto_instance = OrderShipmentDTO.from_json(json)
# print the JSON string representation of the object
print(OrderShipmentDTO.to_json())

# convert the object into a dict
order_shipment_dto_dict = order_shipment_dto_instance.to_dict()
# create an instance of OrderShipmentDTO from a dict
order_shipment_dto_from_dict = OrderShipmentDTO.from_dict(order_shipment_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


