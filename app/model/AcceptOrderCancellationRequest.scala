package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AcceptOrderCancellationRequest.
  * @param accepted Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class AcceptOrderCancellationRequest(
  accepted: Boolean,
  reason: Option[OrderCancellationReasonType]
)

object AcceptOrderCancellationRequest {
  implicit lazy val acceptOrderCancellationRequestJsonFormat: Format[AcceptOrderCancellationRequest] = Json.format[AcceptOrderCancellationRequest]
}

