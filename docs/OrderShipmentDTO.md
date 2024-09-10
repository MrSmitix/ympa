# OpenapiClient::OrderShipmentDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор посылки, присвоенный Маркетом. | [optional] |
| **shipment_date** | **String** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] |
| **shipment_time** | **String** | **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус &#x60;READY_TO_SHIP&#x60;. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.  | [optional] |
| **tracks** | [**Array&lt;OrderTrackDTO&gt;**](OrderTrackDTO.md) | **Только для модели DBS**  Информация для отслеживания перемещений посылки.  | [optional] |
| **boxes** | [**Array&lt;OrderParcelBoxDTO&gt;**](OrderParcelBoxDTO.md) | Список грузовых мест. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderShipmentDTO.new(
  id: null,
  shipment_date: 23-09-2022,
  shipment_time: null,
  tracks: null,
  boxes: null
)
```

