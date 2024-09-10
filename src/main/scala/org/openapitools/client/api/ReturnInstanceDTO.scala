package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReturnInstanceDTO._

case class ReturnInstanceDTO (
  stockType: Option[ReturnInstanceStockType],
status: Option[ReturnInstanceStatusType],
/* Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). */
  cis: Option[String],
/* Международный идентификатор мобильного оборудования. */
  imei: Option[String])

object ReturnInstanceDTO {
  import DateTimeCodecs._

  implicit val ReturnInstanceDTOCodecJson: CodecJson[ReturnInstanceDTO] = CodecJson.derive[ReturnInstanceDTO]
  implicit val ReturnInstanceDTODecoder: EntityDecoder[ReturnInstanceDTO] = jsonOf[ReturnInstanceDTO]
  implicit val ReturnInstanceDTOEncoder: EntityEncoder[ReturnInstanceDTO] = jsonEncoderOf[ReturnInstanceDTO]
}
