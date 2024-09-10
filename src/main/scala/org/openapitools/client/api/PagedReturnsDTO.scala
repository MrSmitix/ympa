package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PagedReturnsDTO._

case class PagedReturnsDTO (
  paging: Option[ForwardScrollingPagerDTO],
/* Список возвратов. */
  returns: List[ReturnDTO])

object PagedReturnsDTO {
  import DateTimeCodecs._

  implicit val PagedReturnsDTOCodecJson: CodecJson[PagedReturnsDTO] = CodecJson.derive[PagedReturnsDTO]
  implicit val PagedReturnsDTODecoder: EntityDecoder[PagedReturnsDTO] = jsonOf[PagedReturnsDTO]
  implicit val PagedReturnsDTOEncoder: EntityEncoder[PagedReturnsDTO] = jsonEncoderOf[PagedReturnsDTO]
}
