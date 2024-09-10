package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteOffersDTO._

case class DeleteOffersDTO (
  /* Список SKU товаров, которые не удалось удалить. */
  notDeletedOfferIds: Option[List[String]])

object DeleteOffersDTO {
  import DateTimeCodecs._

  implicit val DeleteOffersDTOCodecJson: CodecJson[DeleteOffersDTO] = CodecJson.derive[DeleteOffersDTO]
  implicit val DeleteOffersDTODecoder: EntityDecoder[DeleteOffersDTO] = jsonOf[DeleteOffersDTO]
  implicit val DeleteOffersDTOEncoder: EntityEncoder[DeleteOffersDTO] = jsonEncoderOf[DeleteOffersDTO]
}
