package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferConditionDTO._

case class OfferConditionDTO (
  `type`: Option[OfferConditionType],
quality: Option[OfferConditionQualityType],
/* Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать.  */
  reason: Option[String])

object OfferConditionDTO {
  import DateTimeCodecs._

  implicit val OfferConditionDTOCodecJson: CodecJson[OfferConditionDTO] = CodecJson.derive[OfferConditionDTO]
  implicit val OfferConditionDTODecoder: EntityDecoder[OfferConditionDTO] = jsonOf[OfferConditionDTO]
  implicit val OfferConditionDTOEncoder: EntityEncoder[OfferConditionDTO] = jsonEncoderOf[OfferConditionDTO]
}
