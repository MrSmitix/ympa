package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderParcelBoxDTO
import org.openapitools.models.OrderTrackDTO
import scala.collection.immutable.Seq

/**
 * Список посылок.  В параметре может указываться несколько посылок. 
 * @param id Идентификатор посылки, присвоенный Маркетом.
 * @param shipmentDate Формат даты: `ДД-ММ-ГГГГ`. 
 * @param shipmentTime **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
 * @param tracks **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
 * @param boxes Список грузовых мест.
 */
case class OrderShipmentDTO(id: Option[Long],
                shipmentDate: Option[String],
                shipmentTime: Option[String],
                tracks: Option[Seq[OrderTrackDTO]],
                boxes: Option[Seq[OrderParcelBoxDTO]]
                )

object OrderShipmentDTO {
    /**
     * Creates the codec for converting OrderShipmentDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderShipmentDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderShipmentDTO] = deriveEncoder
}
