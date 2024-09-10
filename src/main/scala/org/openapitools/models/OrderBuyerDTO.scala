package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderBuyerType

/**
 * Информация о покупателе.  Параметры `id`, `lastName`, `firstName` и `middleName` возвращаются, только если вы работаете по модели DBS. 
 * @param id Идентификатор покупателя.
 * @param lastName Фамилия покупателя.
 * @param firstName Имя покупателя.
 * @param middleName Отчество покупателя.
 * @param _type 
 */
case class OrderBuyerDTO(id: Option[String],
                lastName: Option[String],
                firstName: Option[String],
                middleName: Option[String],
                _type: Option[OrderBuyerType]
                )

object OrderBuyerDTO {
    /**
     * Creates the codec for converting OrderBuyerDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderBuyerDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderBuyerDTO] = deriveEncoder
}
