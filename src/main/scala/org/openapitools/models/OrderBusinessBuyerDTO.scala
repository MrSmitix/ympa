package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о покупателе. 
 * @param inn ИНН.
 * @param kpp КПП.
 * @param organizationName Наименование юридического лица.
 * @param organizationJurAddress Юридический адрес.
 */
case class OrderBusinessBuyerDTO(inn: Option[String],
                kpp: Option[String],
                organizationName: Option[String],
                organizationJurAddress: Option[String]
                )

object OrderBusinessBuyerDTO {
    /**
     * Creates the codec for converting OrderBusinessBuyerDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderBusinessBuyerDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderBusinessBuyerDTO] = deriveEncoder
}
