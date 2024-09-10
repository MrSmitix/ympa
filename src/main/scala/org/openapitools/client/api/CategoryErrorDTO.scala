package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CategoryErrorDTO._

case class CategoryErrorDTO (
  /* Идентификатор категории. */
  categoryId: Option[Long],
`type`: Option[CategoryErrorType])

object CategoryErrorDTO {
  import DateTimeCodecs._

  implicit val CategoryErrorDTOCodecJson: CodecJson[CategoryErrorDTO] = CodecJson.derive[CategoryErrorDTO]
  implicit val CategoryErrorDTODecoder: EntityDecoder[CategoryErrorDTO] = jsonOf[CategoryErrorDTO]
  implicit val CategoryErrorDTOEncoder: EntityEncoder[CategoryErrorDTO] = jsonEncoderOf[CategoryErrorDTO]
}
