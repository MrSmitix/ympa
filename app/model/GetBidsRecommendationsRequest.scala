package model

import play.api.libs.json._

/**
  * description.
  * @param skus Список товаров, для которых нужно получить рекомендации по ставкам. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetBidsRecommendationsRequest(
  skus: List[String]
)

object GetBidsRecommendationsRequest {
  implicit lazy val getBidsRecommendationsRequestJsonFormat: Format[GetBidsRecommendationsRequest] = Json.format[GetBidsRecommendationsRequest]
}

