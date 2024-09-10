package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime
import org.openapitools.models.LogisticPickupPointDTO
import org.openapitools.models.RecipientType
import org.openapitools.models.RefundStatusType
import org.openapitools.models.ReturnItemDTO
import org.openapitools.models.ReturnShipmentStatusType
import org.openapitools.models.ReturnType
import scala.collection.immutable.Seq

/**
 * Возврат заказа.
 * @param id Идентификатор возврата.
 * @param orderId Номер заказа.
 * @param creationDate Дата создания возврата клиентом.
 * @param updateDate Дата обновления возврата.
 * @param refundStatus 
 * @param logisticPickupPoint 
 * @param shipmentRecipientType 
 * @param shipmentStatus 
 * @param refundAmount Сумма возврата.
 * @param items Список товаров в возврате.
 * @param returnType 
 * @param fastReturn Используется ли опция **Быстрый возврат денег за дешевый брак**. 
 */
case class ReturnDTO(id: Option[Long],
                orderId: Option[Long],
                creationDate: Option[ZonedDateTime],
                updateDate: Option[ZonedDateTime],
                refundStatus: Option[RefundStatusType],
                logisticPickupPoint: Option[LogisticPickupPointDTO],
                shipmentRecipientType: Option[RecipientType],
                shipmentStatus: Option[ReturnShipmentStatusType],
                refundAmount: Option[Long],
                items: Seq[ReturnItemDTO],
                returnType: Option[ReturnType],
                fastReturn: Option[Boolean]
                )

object ReturnDTO {
    /**
     * Creates the codec for converting ReturnDTO from and to JSON.
     */
    implicit val decoder: Decoder[ReturnDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReturnDTO] = deriveEncoder
}
