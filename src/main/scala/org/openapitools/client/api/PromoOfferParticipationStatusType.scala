package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PromoOfferParticipationStatusType._

case class PromoOfferParticipationStatusType (
  
object PromoOfferParticipationStatusType {
  import DateTimeCodecs._

  implicit val PromoOfferParticipationStatusTypeCodecJson: CodecJson[PromoOfferParticipationStatusType] = CodecJson.derive[PromoOfferParticipationStatusType]
  implicit val PromoOfferParticipationStatusTypeDecoder: EntityDecoder[PromoOfferParticipationStatusType] = jsonOf[PromoOfferParticipationStatusType]
  implicit val PromoOfferParticipationStatusTypeEncoder: EntityEncoder[PromoOfferParticipationStatusType] = jsonEncoderOf[PromoOfferParticipationStatusType]
}
