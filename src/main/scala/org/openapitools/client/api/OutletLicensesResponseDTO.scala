package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OutletLicensesResponseDTO._

case class OutletLicensesResponseDTO (
  /* Список лицензий. */
  licenses: List[FullOutletLicenseDTO])

object OutletLicensesResponseDTO {
  import DateTimeCodecs._

  implicit val OutletLicensesResponseDTOCodecJson: CodecJson[OutletLicensesResponseDTO] = CodecJson.derive[OutletLicensesResponseDTO]
  implicit val OutletLicensesResponseDTODecoder: EntityDecoder[OutletLicensesResponseDTO] = jsonOf[OutletLicensesResponseDTO]
  implicit val OutletLicensesResponseDTOEncoder: EntityEncoder[OutletLicensesResponseDTO] = jsonEncoderOf[OutletLicensesResponseDTO]
}
