package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PromoParticipationType._

case class PromoParticipationType (
  
object PromoParticipationType {
  import DateTimeCodecs._

  implicit val PromoParticipationTypeCodecJson: CodecJson[PromoParticipationType] = CodecJson.derive[PromoParticipationType]
  implicit val PromoParticipationTypeDecoder: EntityDecoder[PromoParticipationType] = jsonOf[PromoParticipationType]
  implicit val PromoParticipationTypeEncoder: EntityEncoder[PromoParticipationType] = jsonEncoderOf[PromoParticipationType]
}
