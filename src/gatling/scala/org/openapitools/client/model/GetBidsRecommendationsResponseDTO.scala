
package org.openapitools.client.model


case class GetBidsRecommendationsResponseDTO (
    /* Список товаров с рекомендованными ставками. */
    _recommendations: List[SkuBidRecommendationItemDTO]
)
object GetBidsRecommendationsResponseDTO {
    def toStringBody(var_recommendations: Object) =
        s"""
        | {
        | "recommendations":$var_recommendations
        | }
        """.stripMargin
}
