package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PaymentFrequencyType._

case class PaymentFrequencyType (
  
object PaymentFrequencyType {
  import DateTimeCodecs._

  implicit val PaymentFrequencyTypeCodecJson: CodecJson[PaymentFrequencyType] = CodecJson.derive[PaymentFrequencyType]
  implicit val PaymentFrequencyTypeDecoder: EntityDecoder[PaymentFrequencyType] = jsonOf[PaymentFrequencyType]
  implicit val PaymentFrequencyTypeEncoder: EntityEncoder[PaymentFrequencyType] = jsonEncoderOf[PaymentFrequencyType]
}
