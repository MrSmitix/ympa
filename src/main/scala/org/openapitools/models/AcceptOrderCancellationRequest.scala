package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderCancellationReasonType

/**
 * 
 * @param accepted Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. 
 * @param reason 
 */
case class AcceptOrderCancellationRequest(accepted: Boolean,
                reason: Option[OrderCancellationReasonType]
                )

object AcceptOrderCancellationRequest {
    /**
     * Creates the codec for converting AcceptOrderCancellationRequest from and to JSON.
     */
    implicit val decoder: Decoder[AcceptOrderCancellationRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AcceptOrderCancellationRequest] = deriveEncoder
}
