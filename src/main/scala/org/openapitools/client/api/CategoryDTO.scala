package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CategoryDTO._

case class CategoryDTO (
  /* Идентификатор категории. */
  id: Long,
/* Название категории. */
  name: String,
/* Дочерние категории. */
  children: Option[List[CategoryDTO]])

object CategoryDTO {
  import DateTimeCodecs._

  implicit val CategoryDTOCodecJson: CodecJson[CategoryDTO] = CodecJson.derive[CategoryDTO]
  implicit val CategoryDTODecoder: EntityDecoder[CategoryDTO] = jsonOf[CategoryDTO]
  implicit val CategoryDTOEncoder: EntityEncoder[CategoryDTO] = jsonEncoderOf[CategoryDTO]
}
