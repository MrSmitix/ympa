
# OrderShipmentDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.Long** | Идентификатор посылки, присвоенный Маркетом. |  [optional] |
| **shipmentDate** | **kotlin.String** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  [optional] |
| **shipmentTime** | **kotlin.String** | **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус &#x60;READY_TO_SHIP&#x60;. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.  |  [optional] |
| **tracks** | [**kotlin.collections.List&lt;OrderTrackDTO&gt;**](OrderTrackDTO.md) | **Только для модели DBS**  Информация для отслеживания перемещений посылки.  |  [optional] |
| **boxes** | [**kotlin.collections.List&lt;OrderParcelBoxDTO&gt;**](OrderParcelBoxDTO.md) | Список грузовых мест. |  [optional] |



