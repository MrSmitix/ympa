package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import DocumentDTO._

case class DocumentDTO (
  status: Option[OrderDocumentStatusType],
/* Номер документа. */
  number: Option[String],
/* Дата создания документа. */
  date: Option[LocalDate])

object DocumentDTO {
  import DateTimeCodecs._

  implicit val DocumentDTOCodecJson: CodecJson[DocumentDTO] = CodecJson.derive[DocumentDTO]
  implicit val DocumentDTODecoder: EntityDecoder[DocumentDTO] = jsonOf[DocumentDTO]
  implicit val DocumentDTOEncoder: EntityEncoder[DocumentDTO] = jsonEncoderOf[DocumentDTO]
}
