package model

import play.api.libs.json._

/**
  * Информация о текущей карточке товара на Маркете.
  * @param marketSku SKU на Маркете.
  * @param modelId Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. 
  * @param categoryId Идентификатор категории для текущей карточки товара на Маркете.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferMappingDTO(
  marketSku: Option[Long],
  modelId: Option[Long],
  categoryId: Option[Long]
)

object OfferMappingDTO {
  implicit lazy val offerMappingDTOJsonFormat: Format[OfferMappingDTO] = Json.format[OfferMappingDTO]
}

