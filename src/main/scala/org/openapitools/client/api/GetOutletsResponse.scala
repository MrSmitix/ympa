package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetOutletsResponse._

case class GetOutletsResponse (
  /* Информация о точках продаж. */
  outlets: List[FullOutletDTO],
paging: Option[ScrollingPagerDTO],
pager: Option[FlippingPagerDTO])

object GetOutletsResponse {
  import DateTimeCodecs._

  implicit val GetOutletsResponseCodecJson: CodecJson[GetOutletsResponse] = CodecJson.derive[GetOutletsResponse]
  implicit val GetOutletsResponseDecoder: EntityDecoder[GetOutletsResponse] = jsonOf[GetOutletsResponse]
  implicit val GetOutletsResponseEncoder: EntityEncoder[GetOutletsResponse] = jsonEncoderOf[GetOutletsResponse]
}
