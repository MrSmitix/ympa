package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GoodsFeedbackIdentifiersDTO._

case class GoodsFeedbackIdentifiersDTO (
  /* Идентификатор заказа на Маркете. */
  orderId: Long,
/* Идентификатор модели товара. */
  modelId: Long)

object GoodsFeedbackIdentifiersDTO {
  import DateTimeCodecs._

  implicit val GoodsFeedbackIdentifiersDTOCodecJson: CodecJson[GoodsFeedbackIdentifiersDTO] = CodecJson.derive[GoodsFeedbackIdentifiersDTO]
  implicit val GoodsFeedbackIdentifiersDTODecoder: EntityDecoder[GoodsFeedbackIdentifiersDTO] = jsonOf[GoodsFeedbackIdentifiersDTO]
  implicit val GoodsFeedbackIdentifiersDTOEncoder: EntityEncoder[GoodsFeedbackIdentifiersDTO] = jsonEncoderOf[GoodsFeedbackIdentifiersDTO]
}
