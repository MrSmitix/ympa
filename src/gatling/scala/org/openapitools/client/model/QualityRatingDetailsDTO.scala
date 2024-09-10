
package org.openapitools.client.model


case class QualityRatingDetailsDTO (
    /* Список заказов, которые повлияли на индекс качества. */
    _affectedOrders: List[QualityRatingAffectedOrderDTO]
)
object QualityRatingDetailsDTO {
    def toStringBody(var_affectedOrders: Object) =
        s"""
        | {
        | "affectedOrders":$var_affectedOrders
        | }
        """.stripMargin
}
