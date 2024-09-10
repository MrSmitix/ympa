package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetRegionsResponse._

case class GetRegionsResponse (
  /* Регион доставки. */
  regions: List[RegionDTO],
paging: Option[ForwardScrollingPagerDTO])

object GetRegionsResponse {
  import DateTimeCodecs._

  implicit val GetRegionsResponseCodecJson: CodecJson[GetRegionsResponse] = CodecJson.derive[GetRegionsResponse]
  implicit val GetRegionsResponseDecoder: EntityDecoder[GetRegionsResponse] = jsonOf[GetRegionsResponse]
  implicit val GetRegionsResponseEncoder: EntityEncoder[GetRegionsResponse] = jsonEncoderOf[GetRegionsResponse]
}
