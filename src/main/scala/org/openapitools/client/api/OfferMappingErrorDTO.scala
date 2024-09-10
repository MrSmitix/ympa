package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferMappingErrorDTO._

case class OfferMappingErrorDTO (
  `type`: OfferMappingErrorType,
/* Идентификатор характеристики, с которой связана ошибка. */
  parameterId: Option[Long],
/* Текст ошибки. */
  message: String)

object OfferMappingErrorDTO {
  import DateTimeCodecs._

  implicit val OfferMappingErrorDTOCodecJson: CodecJson[OfferMappingErrorDTO] = CodecJson.derive[OfferMappingErrorDTO]
  implicit val OfferMappingErrorDTODecoder: EntityDecoder[OfferMappingErrorDTO] = jsonOf[OfferMappingErrorDTO]
  implicit val OfferMappingErrorDTOEncoder: EntityEncoder[OfferMappingErrorDTO] = jsonEncoderOf[OfferMappingErrorDTO]
}
