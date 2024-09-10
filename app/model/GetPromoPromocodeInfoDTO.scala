package model

import play.api.libs.json._

/**
  * Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции. 
  * @param promocode Промокод.
  * @param discount Процент скидки по промокоду.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetPromoPromocodeInfoDTO(
  promocode: String,
  discount: Int
)

object GetPromoPromocodeInfoDTO {
  implicit lazy val getPromoPromocodeInfoDTOJsonFormat: Format[GetPromoPromocodeInfoDTO] = Json.format[GetPromoPromocodeInfoDTO]
}

