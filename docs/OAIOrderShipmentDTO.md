# OAIOrderShipmentDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | Идентификатор посылки, присвоенный Маркетом. | [optional] 
**shipmentDate** | **NSString*** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**shipmentTime** | **NSString*** | **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус &#x60;READY_TO_SHIP&#x60;. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.  | [optional] 
**tracks** | [**NSArray&lt;OAIOrderTrackDTO&gt;***](OAIOrderTrackDTO.md) | **Только для модели DBS**  Информация для отслеживания перемещений посылки.  | [optional] 
**boxes** | [**NSArray&lt;OAIOrderParcelBoxDTO&gt;***](OAIOrderParcelBoxDTO.md) | Список грузовых мест. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


