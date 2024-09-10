package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ReturnInstanceStatusType
import org.openapitools.models.ReturnInstanceStockType

/**
 * Логистическая информация по возврату.
 * @param stockType 
 * @param status 
 * @param cis Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
 * @param imei Международный идентификатор мобильного оборудования.
 */
case class ReturnInstanceDTO(stockType: Option[ReturnInstanceStockType],
                status: Option[ReturnInstanceStatusType],
                cis: Option[String],
                imei: Option[String]
                )

object ReturnInstanceDTO {
    /**
     * Creates the codec for converting ReturnInstanceDTO from and to JSON.
     */
    implicit val decoder: Decoder[ReturnInstanceDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReturnInstanceDTO] = deriveEncoder
}
