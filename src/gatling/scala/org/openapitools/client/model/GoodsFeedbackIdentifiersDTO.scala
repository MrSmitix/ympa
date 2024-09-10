
package org.openapitools.client.model


case class GoodsFeedbackIdentifiersDTO (
    /* Идентификатор заказа на Маркете. */
    _orderId: Long,
    /* Идентификатор модели товара. */
    _modelId: Long
)
object GoodsFeedbackIdentifiersDTO {
    def toStringBody(var_orderId: Object, var_modelId: Object) =
        s"""
        | {
        | "orderId":$var_orderId,"modelId":$var_modelId
        | }
        """.stripMargin
}
