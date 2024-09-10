package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RejectedPromoOfferUpdateReasonType._

case class RejectedPromoOfferUpdateReasonType (
  
object RejectedPromoOfferUpdateReasonType {
  import DateTimeCodecs._

  implicit val RejectedPromoOfferUpdateReasonTypeCodecJson: CodecJson[RejectedPromoOfferUpdateReasonType] = CodecJson.derive[RejectedPromoOfferUpdateReasonType]
  implicit val RejectedPromoOfferUpdateReasonTypeDecoder: EntityDecoder[RejectedPromoOfferUpdateReasonType] = jsonOf[RejectedPromoOfferUpdateReasonType]
  implicit val RejectedPromoOfferUpdateReasonTypeEncoder: EntityEncoder[RejectedPromoOfferUpdateReasonType] = jsonEncoderOf[RejectedPromoOfferUpdateReasonType]
}
