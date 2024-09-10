# openapi.model.OrderShipmentDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор посылки, присвоенный Маркетом. | [optional] 
**shipmentDate** | **String** | Формат даты: `ДД-ММ-ГГГГ`.  | [optional] 
**shipmentTime** | **String** | **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.  | [optional] 
**tracks** | [**List<OrderTrackDTO>**](OrderTrackDTO.md) | **Только для модели DBS**  Информация для отслеживания перемещений посылки.  | [optional] [default to const []]
**boxes** | [**List<OrderParcelBoxDTO>**](OrderParcelBoxDTO.md) | Список грузовых мест. | [optional] [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


