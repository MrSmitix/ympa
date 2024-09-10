package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SetReturnDecisionRequest._

case class SetReturnDecisionRequest (
  /* Идентификатор товара в возврате. */
  returnItemId: Long,
decisionType: ReturnRequestDecisionType,
/* Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете.  */
  comment: Option[String])

object SetReturnDecisionRequest {
  import DateTimeCodecs._

  implicit val SetReturnDecisionRequestCodecJson: CodecJson[SetReturnDecisionRequest] = CodecJson.derive[SetReturnDecisionRequest]
  implicit val SetReturnDecisionRequestDecoder: EntityDecoder[SetReturnDecisionRequest] = jsonOf[SetReturnDecisionRequest]
  implicit val SetReturnDecisionRequestEncoder: EntityEncoder[SetReturnDecisionRequest] = jsonEncoderOf[SetReturnDecisionRequest]
}
