package model

import play.api.libs.json._

/**
  * Информация об индексе качества магазинов.
  * @param campaignRatings Список магазинов c информацией об их индексе качества.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CampaignsQualityRatingDTO(
  campaignRatings: List[CampaignQualityRatingDTO]
)

object CampaignsQualityRatingDTO {
  implicit lazy val campaignsQualityRatingDTOJsonFormat: Format[CampaignsQualityRatingDTO] = Json.format[CampaignsQualityRatingDTO]
}

