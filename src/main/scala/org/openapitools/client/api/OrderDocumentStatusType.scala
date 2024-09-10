package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderDocumentStatusType._

case class OrderDocumentStatusType (
  
object OrderDocumentStatusType {
  import DateTimeCodecs._

  implicit val OrderDocumentStatusTypeCodecJson: CodecJson[OrderDocumentStatusType] = CodecJson.derive[OrderDocumentStatusType]
  implicit val OrderDocumentStatusTypeDecoder: EntityDecoder[OrderDocumentStatusType] = jsonOf[OrderDocumentStatusType]
  implicit val OrderDocumentStatusTypeEncoder: EntityEncoder[OrderDocumentStatusType] = jsonEncoderOf[OrderDocumentStatusType]
}
