# ORDER_SHIPMENT_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_64** | Идентификатор посылки, присвоенный Маркетом. | [optional] [default to null]
**shipment_date** | [**STRING_32**](STRING_32.md) | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] [default to null]
**shipment_time** | [**STRING_32**](STRING_32.md) | **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус &#x60;READY_TO_SHIP&#x60;. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.  | [optional] [default to null]
**tracks** | [**LIST [ORDER_TRACK_DTO]**](OrderTrackDTO.md) | **Только для модели DBS**  Информация для отслеживания перемещений посылки.  | [optional] [default to null]
**boxes** | [**LIST [ORDER_PARCEL_BOX_DTO]**](OrderParcelBoxDTO.md) | Список грузовых мест. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


