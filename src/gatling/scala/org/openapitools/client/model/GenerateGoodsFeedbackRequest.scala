
package org.openapitools.client.model


case class GenerateGoodsFeedbackRequest (
    /* Идентификатор бизнеса. */
    _businessId: Long
)
object GenerateGoodsFeedbackRequest {
    def toStringBody(var_businessId: Object) =
        s"""
        | {
        | "businessId":$var_businessId
        | }
        """.stripMargin
}
