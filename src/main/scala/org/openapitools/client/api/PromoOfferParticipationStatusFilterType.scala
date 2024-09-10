package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PromoOfferParticipationStatusFilterType._

case class PromoOfferParticipationStatusFilterType (
  
object PromoOfferParticipationStatusFilterType {
  import DateTimeCodecs._

  implicit val PromoOfferParticipationStatusFilterTypeCodecJson: CodecJson[PromoOfferParticipationStatusFilterType] = CodecJson.derive[PromoOfferParticipationStatusFilterType]
  implicit val PromoOfferParticipationStatusFilterTypeDecoder: EntityDecoder[PromoOfferParticipationStatusFilterType] = jsonOf[PromoOfferParticipationStatusFilterType]
  implicit val PromoOfferParticipationStatusFilterTypeEncoder: EntityEncoder[PromoOfferParticipationStatusFilterType] = jsonEncoderOf[PromoOfferParticipationStatusFilterType]
}
