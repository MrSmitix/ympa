package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import QualityRatingAffectedOrderDTO._

case class QualityRatingAffectedOrderDTO (
  /* Идентификатор заказа. */
  orderId: Long,
/* Описание проблемы. */
  description: String,
componentType: AffectedOrderQualityRatingComponentType)

object QualityRatingAffectedOrderDTO {
  import DateTimeCodecs._

  implicit val QualityRatingAffectedOrderDTOCodecJson: CodecJson[QualityRatingAffectedOrderDTO] = CodecJson.derive[QualityRatingAffectedOrderDTO]
  implicit val QualityRatingAffectedOrderDTODecoder: EntityDecoder[QualityRatingAffectedOrderDTO] = jsonOf[QualityRatingAffectedOrderDTO]
  implicit val QualityRatingAffectedOrderDTOEncoder: EntityEncoder[QualityRatingAffectedOrderDTO] = jsonEncoderOf[QualityRatingAffectedOrderDTO]
}
