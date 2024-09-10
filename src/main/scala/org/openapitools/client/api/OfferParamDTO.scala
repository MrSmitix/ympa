package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferParamDTO._

case class OfferParamDTO (
  /* Название.  Должно совпадать с названием характеристики на Маркете. Узнать его можно из Excel-шаблона категории или через запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  */
  name: String,
/* Значение.  */
  value: String)

object OfferParamDTO {
  import DateTimeCodecs._

  implicit val OfferParamDTOCodecJson: CodecJson[OfferParamDTO] = CodecJson.derive[OfferParamDTO]
  implicit val OfferParamDTODecoder: EntityDecoder[OfferParamDTO] = jsonOf[OfferParamDTO]
  implicit val OfferParamDTOEncoder: EntityEncoder[OfferParamDTO] = jsonEncoderOf[OfferParamDTO]
}
