
package org.openapitools.client.model


case class QualityRatingAffectedOrderDTO (
    /* Идентификатор заказа. */
    _orderId: Long,
    /* Описание проблемы. */
    _description: String,
    _componentType: AffectedOrderQualityRatingComponentType
)
object QualityRatingAffectedOrderDTO {
    def toStringBody(var_orderId: Object, var_description: Object, var_componentType: Object) =
        s"""
        | {
        | "orderId":$var_orderId,"description":$var_description,"componentType":$var_componentType
        | }
        """.stripMargin
}
