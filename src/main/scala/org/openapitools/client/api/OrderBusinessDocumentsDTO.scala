package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderBusinessDocumentsDTO._

case class OrderBusinessDocumentsDTO (
  upd: Option[DocumentDTO],
ukd: Option[DocumentDTO],
torgTwelve: Option[DocumentDTO],
sf: Option[DocumentDTO],
ksf: Option[DocumentDTO])

object OrderBusinessDocumentsDTO {
  import DateTimeCodecs._

  implicit val OrderBusinessDocumentsDTOCodecJson: CodecJson[OrderBusinessDocumentsDTO] = CodecJson.derive[OrderBusinessDocumentsDTO]
  implicit val OrderBusinessDocumentsDTODecoder: EntityDecoder[OrderBusinessDocumentsDTO] = jsonOf[OrderBusinessDocumentsDTO]
  implicit val OrderBusinessDocumentsDTOEncoder: EntityEncoder[OrderBusinessDocumentsDTO] = jsonEncoderOf[OrderBusinessDocumentsDTO]
}
