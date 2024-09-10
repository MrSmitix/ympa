package model

import play.api.libs.json._

/**
  * Ограничения в акции.
  * @param warehouseIds Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetPromoConstraintsDTO(
  warehouseIds: Option[List[Long]]
)

object GetPromoConstraintsDTO {
  implicit lazy val getPromoConstraintsDTOJsonFormat: Format[GetPromoConstraintsDTO] = Json.format[GetPromoConstraintsDTO]
}

