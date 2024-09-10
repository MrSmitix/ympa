
package org.openapitools.client.model


case class FeedbackOrderDTO (
    /* Номер заказа, указанный в отзыве. */
    _shopOrderId: Option[String],
    _delivery: Option[FeedbackDeliveryType]
)
object FeedbackOrderDTO {
    def toStringBody(var_shopOrderId: Object, var_delivery: Object) =
        s"""
        | {
        | "shopOrderId":$var_shopOrderId,"delivery":$var_delivery
        | }
        """.stripMargin
}
