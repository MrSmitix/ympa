package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GetOfferRecommendationsRequest.
  * @param offerIds Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetOfferRecommendationsRequest(
  offerIds: Option[List[String]],
  cofinancePriceFilter: Option[FieldStateType],
  recommendedCofinancePriceFilter: Option[FieldStateType],
  competitivenessFilter: Option[PriceCompetitivenessType]
)

object GetOfferRecommendationsRequest {
  implicit lazy val getOfferRecommendationsRequestJsonFormat: Format[GetOfferRecommendationsRequest] = Json.format[GetOfferRecommendationsRequest]
}

