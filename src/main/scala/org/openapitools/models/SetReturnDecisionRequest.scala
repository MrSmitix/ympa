package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ReturnRequestDecisionType

/**
 * Решения по позиции в возврате.
 * @param returnItemId Идентификатор товара в возврате.
 * @param decisionType 
 * @param comment Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете. 
 */
case class SetReturnDecisionRequest(returnItemId: Long,
                decisionType: ReturnRequestDecisionType,
                comment: Option[String]
                )

object SetReturnDecisionRequest {
    /**
     * Creates the codec for converting SetReturnDecisionRequest from and to JSON.
     */
    implicit val decoder: Decoder[SetReturnDecisionRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[SetReturnDecisionRequest] = deriveEncoder
}
