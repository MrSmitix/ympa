
package org.openapitools.client.model


case class SetReturnDecisionRequest (
    /* Идентификатор товара в возврате. */
    _returnItemId: Long,
    _decisionType: ReturnRequestDecisionType,
    /* Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете.  */
    _comment: Option[String]
)
object SetReturnDecisionRequest {
    def toStringBody(var_returnItemId: Object, var_decisionType: Object, var_comment: Object) =
        s"""
        | {
        | "returnItemId":$var_returnItemId,"decisionType":$var_decisionType,"comment":$var_comment
        | }
        """.stripMargin
}
