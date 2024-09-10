package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ParcelBoxLabelDTO
import scala.collection.immutable.Seq

/**
 * Данные для печати ярлыка.
 * @param orderId Идентификатор заказа.
 * @param placesNumber Количество коробок в заказе.
 * @param url URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). 
 * @param parcelBoxLabels Информация на ярлыке.
 */
case class OrderLabelDTO(orderId: Long,
                placesNumber: Int,
                url: String,
                parcelBoxLabels: Seq[ParcelBoxLabelDTO]
                )

object OrderLabelDTO {
    /**
     * Creates the codec for converting OrderLabelDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderLabelDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderLabelDTO] = deriveEncoder
}
