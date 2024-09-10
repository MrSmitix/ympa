package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AddOffersToArchiveDTO._

case class AddOffersToArchiveDTO (
  /* Список товаров, которые не удалось поместить в архив. */
  notArchivedOffers: Option[List[AddOffersToArchiveErrorDTO]])

object AddOffersToArchiveDTO {
  import DateTimeCodecs._

  implicit val AddOffersToArchiveDTOCodecJson: CodecJson[AddOffersToArchiveDTO] = CodecJson.derive[AddOffersToArchiveDTO]
  implicit val AddOffersToArchiveDTODecoder: EntityDecoder[AddOffersToArchiveDTO] = jsonOf[AddOffersToArchiveDTO]
  implicit val AddOffersToArchiveDTOEncoder: EntityEncoder[AddOffersToArchiveDTO] = jsonEncoderOf[AddOffersToArchiveDTO]
}
