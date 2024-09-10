package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateOutletLicenseRequest._

case class UpdateOutletLicenseRequest (
  /* Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии.  */
  licenses: List[OutletLicenseDTO])

object UpdateOutletLicenseRequest {
  import DateTimeCodecs._

  implicit val UpdateOutletLicenseRequestCodecJson: CodecJson[UpdateOutletLicenseRequest] = CodecJson.derive[UpdateOutletLicenseRequest]
  implicit val UpdateOutletLicenseRequestDecoder: EntityDecoder[UpdateOutletLicenseRequest] = jsonOf[UpdateOutletLicenseRequest]
  implicit val UpdateOutletLicenseRequestEncoder: EntityEncoder[UpdateOutletLicenseRequest] = jsonEncoderOf[UpdateOutletLicenseRequest]
}
