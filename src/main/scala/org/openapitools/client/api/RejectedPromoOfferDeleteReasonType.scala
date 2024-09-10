package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RejectedPromoOfferDeleteReasonType._

case class RejectedPromoOfferDeleteReasonType (
  
object RejectedPromoOfferDeleteReasonType {
  import DateTimeCodecs._

  implicit val RejectedPromoOfferDeleteReasonTypeCodecJson: CodecJson[RejectedPromoOfferDeleteReasonType] = CodecJson.derive[RejectedPromoOfferDeleteReasonType]
  implicit val RejectedPromoOfferDeleteReasonTypeDecoder: EntityDecoder[RejectedPromoOfferDeleteReasonType] = jsonOf[RejectedPromoOfferDeleteReasonType]
  implicit val RejectedPromoOfferDeleteReasonTypeEncoder: EntityEncoder[RejectedPromoOfferDeleteReasonType] = jsonEncoderOf[RejectedPromoOfferDeleteReasonType]
}
