
package org.openapitools.client.model


case class CampaignsQualityRatingDTO (
    /* Список магазинов c информацией об их индексе качества. */
    _campaignRatings: List[CampaignQualityRatingDTO]
)
object CampaignsQualityRatingDTO {
    def toStringBody(var_campaignRatings: Object) =
        s"""
        | {
        | "campaignRatings":$var_campaignRatings
        | }
        """.stripMargin
}
