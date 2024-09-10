package model

import play.api.libs.json._

/**
  * Решения по позиции в возврате.
  * @param returnItemId Идентификатор товара в возврате.
  * @param comment Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class SetReturnDecisionRequest(
  returnItemId: Long,
  decisionType: ReturnRequestDecisionType,
  comment: Option[String]
)

object SetReturnDecisionRequest {
  implicit lazy val setReturnDecisionRequestJsonFormat: Format[SetReturnDecisionRequest] = Json.format[SetReturnDecisionRequest]
}

