package model

import play.api.libs.json._

/**
  * Информация об индексе качества магазина.
  * @param campaignId Идентификатор магазина.
  * @param ratings Список значений индекса качества.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CampaignQualityRatingDTO(
  campaignId: Long,
  ratings: List[QualityRatingDTO]
)

object CampaignQualityRatingDTO {
  implicit lazy val campaignQualityRatingDTOJsonFormat: Format[CampaignQualityRatingDTO] = Json.format[CampaignQualityRatingDTO]
}

