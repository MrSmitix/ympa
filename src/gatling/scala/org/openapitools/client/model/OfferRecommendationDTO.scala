
package org.openapitools.client.model


case class OfferRecommendationDTO (
    _offer: Option[OfferForRecommendationDTO],
    _recommendation: Option[OfferRecommendationInfoDTO]
)
object OfferRecommendationDTO {
    def toStringBody(var_offer: Object, var_recommendation: Object) =
        s"""
        | {
        | "offer":$var_offer,"recommendation":$var_recommendation
        | }
        """.stripMargin
}
