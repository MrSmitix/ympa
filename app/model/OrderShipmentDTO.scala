package model

import play.api.libs.json._

/**
  * Список посылок.  В параметре может указываться несколько посылок. 
  * @param id Идентификатор посылки, присвоенный Маркетом.
  * @param shipmentDate Формат даты: `ДД-ММ-ГГГГ`. 
  * @param shipmentTime **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
  * @param tracks **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
  * @param boxes Список грузовых мест.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderShipmentDTO(
  id: Option[Long],
  shipmentDate: Option[String],
  shipmentTime: Option[String],
  tracks: Option[List[OrderTrackDTO]],
  boxes: Option[List[OrderParcelBoxDTO]]
)

object OrderShipmentDTO {
  implicit lazy val orderShipmentDTOJsonFormat: Format[OrderShipmentDTO] = Json.format[OrderShipmentDTO]
}

