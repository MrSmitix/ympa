package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderBusinessBuyerDTO._

case class OrderBusinessBuyerDTO (
  /* ИНН. */
  inn: Option[String],
/* КПП. */
  kpp: Option[String],
/* Наименование юридического лица. */
  organizationName: Option[String],
/* Юридический адрес. */
  organizationJurAddress: Option[String])

object OrderBusinessBuyerDTO {
  import DateTimeCodecs._

  implicit val OrderBusinessBuyerDTOCodecJson: CodecJson[OrderBusinessBuyerDTO] = CodecJson.derive[OrderBusinessBuyerDTO]
  implicit val OrderBusinessBuyerDTODecoder: EntityDecoder[OrderBusinessBuyerDTO] = jsonOf[OrderBusinessBuyerDTO]
  implicit val OrderBusinessBuyerDTOEncoder: EntityEncoder[OrderBusinessBuyerDTO] = jsonEncoderOf[OrderBusinessBuyerDTO]
}
