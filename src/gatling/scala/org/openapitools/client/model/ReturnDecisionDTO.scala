
package org.openapitools.client.model


case class ReturnDecisionDTO (
    /* Идентификатор товара в возврате. */
    _returnItemId: Option[Long],
    /* Количество единиц товара. */
    _count: Option[Integer],
    /* Комментарий. */
    _comment: Option[String],
    _reasonType: Option[ReturnDecisionReasonType],
    _subreasonType: Option[ReturnDecisionSubreasonType],
    _decisionType: Option[ReturnDecisionType],
    /* Сумма возврата. */
    _refundAmount: Option[Long],
    /* Компенсация за обратную доставку. */
    _partnerCompensation: Option[Long],
    /* Список хеш-кодов фотографий товара от покупателя. */
    _images: Option[List[String]]
)
object ReturnDecisionDTO {
    def toStringBody(var_returnItemId: Object, var_count: Object, var_comment: Object, var_reasonType: Object, var_subreasonType: Object, var_decisionType: Object, var_refundAmount: Object, var_partnerCompensation: Object, var_images: Object) =
        s"""
        | {
        | "returnItemId":$var_returnItemId,"count":$var_count,"comment":$var_comment,"reasonType":$var_reasonType,"subreasonType":$var_subreasonType,"decisionType":$var_decisionType,"refundAmount":$var_refundAmount,"partnerCompensation":$var_partnerCompensation,"images":$var_images
        | }
        """.stripMargin
}
