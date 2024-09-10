package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Формат страницы: * `A4` — формат страницы A4. * `A8` — формат страницы A8. 
 */
case class ShipmentPalletLabelPageFormatType()

object ShipmentPalletLabelPageFormatType {
    /**
     * Creates the codec for converting ShipmentPalletLabelPageFormatType from and to JSON.
     */
    implicit val decoder: Decoder[ShipmentPalletLabelPageFormatType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ShipmentPalletLabelPageFormatType] = deriveEncoder
}
