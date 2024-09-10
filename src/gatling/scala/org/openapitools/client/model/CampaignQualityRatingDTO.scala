
package org.openapitools.client.model


case class CampaignQualityRatingDTO (
    /* Идентификатор магазина. */
    _campaignId: Long,
    /* Список значений индекса качества. */
    _ratings: List[QualityRatingDTO]
)
object CampaignQualityRatingDTO {
    def toStringBody(var_campaignId: Object, var_ratings: Object) =
        s"""
        | {
        | "campaignId":$var_campaignId,"ratings":$var_ratings
        | }
        """.stripMargin
}
