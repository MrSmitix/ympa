package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Способ возврата товара покупателем:  * `SHOP` — в точку возврата магазина.  * `DELIVERY_SERVICE` — отправить курьером.  * `POST` — почта. 
 */
case class RecipientType()

object RecipientType {
    /**
     * Creates the codec for converting RecipientType from and to JSON.
     */
    implicit val decoder: Decoder[RecipientType] = deriveDecoder
    implicit val encoder: ObjectEncoder[RecipientType] = deriveEncoder
}
