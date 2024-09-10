
# Table `OrderShipmentDTO`
(mapped from: OrderShipmentDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор посылки, присвоенный Маркетом. |  [optional]
**shipmentDate** | shipmentDate | text |  | **kotlin.String** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  |  [optional]
**shipmentTime** | shipmentTime | text |  | **kotlin.String** | **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус &#x60;READY_TO_SHIP&#x60;. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, &#x60;ЧЧ:ММ&#x60;.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки.  |  [optional]
**tracks** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderTrackDTO&gt;**](OrderTrackDTO.md) | **Только для модели DBS**  Информация для отслеживания перемещений посылки.  |  [optional]
**boxes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderParcelBoxDTO&gt;**](OrderParcelBoxDTO.md) | Список грузовых мест. |  [optional]





# **Table `OrderShipmentDTOOrderTrackDTO`**
(mapped from: OrderShipmentDTOOrderTrackDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderShipmentDTO | orderShipmentDTO | long | | kotlin.Long | Primary Key | *one*
orderTrackDTO | orderTrackDTO | long | | kotlin.Long | Foreign Key | *many*



# **Table `OrderShipmentDTOOrderParcelBoxDTO`**
(mapped from: OrderShipmentDTOOrderParcelBoxDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderShipmentDTO | orderShipmentDTO | long | | kotlin.Long | Primary Key | *one*
orderParcelBoxDTO | orderParcelBoxDTO | long | | kotlin.Long | Foreign Key | *many*



