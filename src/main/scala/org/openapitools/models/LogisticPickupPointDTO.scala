package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.LogisticPointType
import org.openapitools.models.PickupAddressDTO

/**
 * Описание пункта вывоза для возврата.
 * @param id Идентификатор пункта вывоза.
 * @param name Название пункта вывоза.
 * @param address 
 * @param instruction Дополнительные инструкции к вывозу.
 * @param _type 
 * @param logisticPartnerId Идентификатор логистического партнера, к которому относится логистическая точка.
 */
case class LogisticPickupPointDTO(id: Option[Long],
                name: Option[String],
                address: Option[PickupAddressDTO],
                instruction: Option[String],
                _type: Option[LogisticPointType],
                logisticPartnerId: Option[Long]
                )

object LogisticPickupPointDTO {
    /**
     * Creates the codec for converting LogisticPickupPointDTO from and to JSON.
     */
    implicit val decoder: Decoder[LogisticPickupPointDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[LogisticPickupPointDTO] = deriveEncoder
}
