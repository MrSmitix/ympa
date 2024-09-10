package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetBusinessDocumentsInfoResponse._

case class GetBusinessDocumentsInfoResponse (
  status: Option[ApiResponseStatusType],
result: Option[OrderBusinessDocumentsDTO])

object GetBusinessDocumentsInfoResponse {
  import DateTimeCodecs._

  implicit val GetBusinessDocumentsInfoResponseCodecJson: CodecJson[GetBusinessDocumentsInfoResponse] = CodecJson.derive[GetBusinessDocumentsInfoResponse]
  implicit val GetBusinessDocumentsInfoResponseDecoder: EntityDecoder[GetBusinessDocumentsInfoResponse] = jsonOf[GetBusinessDocumentsInfoResponse]
  implicit val GetBusinessDocumentsInfoResponseEncoder: EntityEncoder[GetBusinessDocumentsInfoResponse] = jsonEncoderOf[GetBusinessDocumentsInfoResponse]
}
