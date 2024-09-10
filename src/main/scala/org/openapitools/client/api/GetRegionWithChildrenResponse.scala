package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetRegionWithChildrenResponse._

case class GetRegionWithChildrenResponse (
  pager: Option[FlippingPagerDTO],
regions: Option[RegionDTO])

object GetRegionWithChildrenResponse {
  import DateTimeCodecs._

  implicit val GetRegionWithChildrenResponseCodecJson: CodecJson[GetRegionWithChildrenResponse] = CodecJson.derive[GetRegionWithChildrenResponse]
  implicit val GetRegionWithChildrenResponseDecoder: EntityDecoder[GetRegionWithChildrenResponse] = jsonOf[GetRegionWithChildrenResponse]
  implicit val GetRegionWithChildrenResponseEncoder: EntityEncoder[GetRegionWithChildrenResponse] = jsonEncoderOf[GetRegionWithChildrenResponse]
}
