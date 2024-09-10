package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetOfferCardsContentStatusResponse._

case class GetOfferCardsContentStatusResponse (
  status: Option[ApiResponseStatusType],
result: Option[OfferCardsContentStatusDTO])

object GetOfferCardsContentStatusResponse {
  import DateTimeCodecs._

  implicit val GetOfferCardsContentStatusResponseCodecJson: CodecJson[GetOfferCardsContentStatusResponse] = CodecJson.derive[GetOfferCardsContentStatusResponse]
  implicit val GetOfferCardsContentStatusResponseDecoder: EntityDecoder[GetOfferCardsContentStatusResponse] = jsonOf[GetOfferCardsContentStatusResponse]
  implicit val GetOfferCardsContentStatusResponseEncoder: EntityEncoder[GetOfferCardsContentStatusResponse] = jsonEncoderOf[GetOfferCardsContentStatusResponse]
}
