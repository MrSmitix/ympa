package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о курьере.
 * @param fullName Полное имя курьера.
 * @param phone Номер телефона курьера.
 * @param phoneExtension Добавочный номер телефона.
 * @param vehicleNumber Номер транспортного средства.
 * @param vehicleDescription Описание машины. Например, модель и цвет.
 */
case class OrderCourierDTO(fullName: Option[String],
                phone: Option[String],
                phoneExtension: Option[String],
                vehicleNumber: Option[String],
                vehicleDescription: Option[String]
                )

object OrderCourierDTO {
    /**
     * Creates the codec for converting OrderCourierDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderCourierDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderCourierDTO] = deriveEncoder
}
