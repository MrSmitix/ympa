package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateOfferMappingsRequest.
  * @param offerMappings Перечень товаров, которые нужно добавить или обновить.
  * @param onlyPartnerMediaContent Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateOfferMappingsRequest(
  offerMappings: List[UpdateOfferMappingDTO],
  onlyPartnerMediaContent: Option[Boolean]
)

object UpdateOfferMappingsRequest {
  implicit lazy val updateOfferMappingsRequestJsonFormat: Format[UpdateOfferMappingsRequest] = Json.format[UpdateOfferMappingsRequest]
}

