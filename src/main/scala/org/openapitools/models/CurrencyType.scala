package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Коды валют. Возможные значения: * `BYR` — белорусский рубль. * `KZT` — казахстанский тенге. * `RUR` — российский рубль. * `UAH` — украинская гривна. 
 */
case class CurrencyType()

object CurrencyType {
    /**
     * Creates the codec for converting CurrencyType from and to JSON.
     */
    implicit val decoder: Decoder[CurrencyType] = deriveDecoder
    implicit val encoder: ObjectEncoder[CurrencyType] = deriveEncoder
}
