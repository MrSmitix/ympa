package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Запрос на подтверждение цены. 
 * @param offerIds Идентификаторы товаров, у которых подтверждается цена.
 */
case class ConfirmPricesRequest(offerIds: Seq[String]
                )

object ConfirmPricesRequest {
    /**
     * Creates the codec for converting ConfirmPricesRequest from and to JSON.
     */
    implicit val decoder: Decoder[ConfirmPricesRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConfirmPricesRequest] = deriveEncoder
}
