package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GetSuggestedOfferMappingsRequest.
  * @param offers Список товаров.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetSuggestedOfferMappingsRequest(
  offers: Option[List[SuggestedOfferDTO]]
)

object GetSuggestedOfferMappingsRequest {
  implicit lazy val getSuggestedOfferMappingsRequestJsonFormat: Format[GetSuggestedOfferMappingsRequest] = Json.format[GetSuggestedOfferMappingsRequest]
}

