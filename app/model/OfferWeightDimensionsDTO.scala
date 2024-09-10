package model

import play.api.libs.json._

/**
  * Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
  * @param length Длина упаковки в см. 
  * @param width Ширина упаковки в см. 
  * @param height Высота упаковки в см. 
  * @param weight Вес товара в кг с учетом упаковки (брутто). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferWeightDimensionsDTO(
  length: BigDecimal,
  width: BigDecimal,
  height: BigDecimal,
  weight: BigDecimal
)

object OfferWeightDimensionsDTO {
  implicit lazy val offerWeightDimensionsDTOJsonFormat: Format[OfferWeightDimensionsDTO] = Json.format[OfferWeightDimensionsDTO]
}

