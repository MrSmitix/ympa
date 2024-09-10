package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderBuyerType

/**
 * Информация о покупателе с базовыми полями.
 * @param id Идентификатор покупателя.
 * @param lastName Фамилия покупателя.
 * @param firstName Имя покупателя.
 * @param middleName Отчество покупателя.
 * @param _type 
 */
case class OrderBuyerBasicInfoDTO(id: Option[String],
                lastName: Option[String],
                firstName: Option[String],
                middleName: Option[String],
                _type: Option[OrderBuyerType]
                )

object OrderBuyerBasicInfoDTO {
    /**
     * Creates the codec for converting OrderBuyerBasicInfoDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderBuyerBasicInfoDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderBuyerBasicInfoDTO] = deriveEncoder
}
