package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RegionDTO._

case class RegionDTO (
  /* Идентификатор региона. */
  id: Option[Long],
/* Название региона. */
  name: String,
`type`: RegionType,
parent: Option[RegionDTO],
/* Дочерние регионы. */
  children: Option[List[RegionDTO]])

object RegionDTO {
  import DateTimeCodecs._

  implicit val RegionDTOCodecJson: CodecJson[RegionDTO] = CodecJson.derive[RegionDTO]
  implicit val RegionDTODecoder: EntityDecoder[RegionDTO] = jsonOf[RegionDTO]
  implicit val RegionDTOEncoder: EntityEncoder[RegionDTO] = jsonEncoderOf[RegionDTO]
}
