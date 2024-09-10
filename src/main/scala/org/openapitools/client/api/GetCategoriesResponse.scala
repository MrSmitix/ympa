package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetCategoriesResponse._

case class GetCategoriesResponse (
  status: Option[ApiResponseStatusType],
result: Option[CategoryDTO])

object GetCategoriesResponse {
  import DateTimeCodecs._

  implicit val GetCategoriesResponseCodecJson: CodecJson[GetCategoriesResponse] = CodecJson.derive[GetCategoriesResponse]
  implicit val GetCategoriesResponseDecoder: EntityDecoder[GetCategoriesResponse] = jsonOf[GetCategoriesResponse]
  implicit val GetCategoriesResponseEncoder: EntityEncoder[GetCategoriesResponse] = jsonEncoderOf[GetCategoriesResponse]
}
