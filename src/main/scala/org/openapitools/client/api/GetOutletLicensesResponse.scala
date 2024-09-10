package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetOutletLicensesResponse._

case class GetOutletLicensesResponse (
  status: Option[ApiResponseStatusType],
result: Option[OutletLicensesResponseDTO])

object GetOutletLicensesResponse {
  import DateTimeCodecs._

  implicit val GetOutletLicensesResponseCodecJson: CodecJson[GetOutletLicensesResponse] = CodecJson.derive[GetOutletLicensesResponse]
  implicit val GetOutletLicensesResponseDecoder: EntityDecoder[GetOutletLicensesResponse] = jsonOf[GetOutletLicensesResponse]
  implicit val GetOutletLicensesResponseEncoder: EntityEncoder[GetOutletLicensesResponse] = jsonEncoderOf[GetOutletLicensesResponse]
}
