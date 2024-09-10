package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferMappingDTO._

case class OfferMappingDTO (
  /* SKU на Маркете. */
  marketSku: Option[Long],
/* Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара.  */
  modelId: Option[Long],
/* Идентификатор категории для текущей карточки товара на Маркете. */
  categoryId: Option[Long])

object OfferMappingDTO {
  import DateTimeCodecs._

  implicit val OfferMappingDTOCodecJson: CodecJson[OfferMappingDTO] = CodecJson.derive[OfferMappingDTO]
  implicit val OfferMappingDTODecoder: EntityDecoder[OfferMappingDTO] = jsonOf[OfferMappingDTO]
  implicit val OfferMappingDTOEncoder: EntityEncoder[OfferMappingDTO] = jsonEncoderOf[OfferMappingDTO]
}
