package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ReturnDecisionDTO._

case class ReturnDecisionDTO (
  /* Идентификатор товара в возврате. */
  returnItemId: Option[Long],
/* Количество единиц товара. */
  count: Option[Integer],
/* Комментарий. */
  comment: Option[String],
reasonType: Option[ReturnDecisionReasonType],
subreasonType: Option[ReturnDecisionSubreasonType],
decisionType: Option[ReturnDecisionType],
/* Сумма возврата. */
  refundAmount: Option[Long],
/* Компенсация за обратную доставку. */
  partnerCompensation: Option[Long],
/* Список хеш-кодов фотографий товара от покупателя. */
  images: Option[List[String]])

object ReturnDecisionDTO {
  import DateTimeCodecs._

  implicit val ReturnDecisionDTOCodecJson: CodecJson[ReturnDecisionDTO] = CodecJson.derive[ReturnDecisionDTO]
  implicit val ReturnDecisionDTODecoder: EntityDecoder[ReturnDecisionDTO] = jsonOf[ReturnDecisionDTO]
  implicit val ReturnDecisionDTOEncoder: EntityEncoder[ReturnDecisionDTO] = jsonEncoderOf[ReturnDecisionDTO]
}
