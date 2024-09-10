package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteOffersFromArchiveDTO._

case class DeleteOffersFromArchiveDTO (
  /* Список товаров, которые не удалось восстановить из архива. */
  notUnarchivedOfferIds: Option[List[String]])

object DeleteOffersFromArchiveDTO {
  import DateTimeCodecs._

  implicit val DeleteOffersFromArchiveDTOCodecJson: CodecJson[DeleteOffersFromArchiveDTO] = CodecJson.derive[DeleteOffersFromArchiveDTO]
  implicit val DeleteOffersFromArchiveDTODecoder: EntityDecoder[DeleteOffersFromArchiveDTO] = jsonOf[DeleteOffersFromArchiveDTO]
  implicit val DeleteOffersFromArchiveDTOEncoder: EntityEncoder[DeleteOffersFromArchiveDTO] = jsonEncoderOf[DeleteOffersFromArchiveDTO]
}
