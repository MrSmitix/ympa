# OrderShipmentDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i64** | Идентификатор посылки, присвоенный Маркетом. | [optional] [default to None]
**shipment_date** | **String** | Формат даты: `ДД-ММ-ГГГГ`.  | [optional] [default to None]
**shipment_time** | **String** | **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.  | [optional] [default to None]
**tracks** | [**Vec<models::OrderTrackDto>**](OrderTrackDTO.md) | **Только для модели DBS**  Информация для отслеживания перемещений посылки.  | [optional] [default to None]
**boxes** | [**Vec<models::OrderParcelBoxDto>**](OrderParcelBoxDTO.md) | Список грузовых мест. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


