package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PromoOfferUpdateWarningCodeType._

case class PromoOfferUpdateWarningCodeType (
  
object PromoOfferUpdateWarningCodeType {
  import DateTimeCodecs._

  implicit val PromoOfferUpdateWarningCodeTypeCodecJson: CodecJson[PromoOfferUpdateWarningCodeType] = CodecJson.derive[PromoOfferUpdateWarningCodeType]
  implicit val PromoOfferUpdateWarningCodeTypeDecoder: EntityDecoder[PromoOfferUpdateWarningCodeType] = jsonOf[PromoOfferUpdateWarningCodeType]
  implicit val PromoOfferUpdateWarningCodeTypeEncoder: EntityEncoder[PromoOfferUpdateWarningCodeType] = jsonEncoderOf[PromoOfferUpdateWarningCodeType]
}
