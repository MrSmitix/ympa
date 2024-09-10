package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetCategoryContentParametersResponse._

case class GetCategoryContentParametersResponse (
  status: Option[ApiResponseStatusType],
result: Option[CategoryContentParametersDTO])

object GetCategoryContentParametersResponse {
  import DateTimeCodecs._

  implicit val GetCategoryContentParametersResponseCodecJson: CodecJson[GetCategoryContentParametersResponse] = CodecJson.derive[GetCategoryContentParametersResponse]
  implicit val GetCategoryContentParametersResponseDecoder: EntityDecoder[GetCategoryContentParametersResponse] = jsonOf[GetCategoryContentParametersResponse]
  implicit val GetCategoryContentParametersResponseEncoder: EntityEncoder[GetCategoryContentParametersResponse] = jsonEncoderOf[GetCategoryContentParametersResponse]
}
