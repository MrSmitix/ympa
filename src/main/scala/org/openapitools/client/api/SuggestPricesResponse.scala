package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SuggestPricesResponse._

case class SuggestPricesResponse (
  status: Option[ApiResponseStatusType],
result: Option[SuggestPricesResultDTO])

object SuggestPricesResponse {
  import DateTimeCodecs._

  implicit val SuggestPricesResponseCodecJson: CodecJson[SuggestPricesResponse] = CodecJson.derive[SuggestPricesResponse]
  implicit val SuggestPricesResponseDecoder: EntityDecoder[SuggestPricesResponse] = jsonOf[SuggestPricesResponse]
  implicit val SuggestPricesResponseEncoder: EntityEncoder[SuggestPricesResponse] = jsonEncoderOf[SuggestPricesResponse]
}
