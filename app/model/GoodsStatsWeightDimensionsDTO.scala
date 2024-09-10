package model

import play.api.libs.json._

/**
  * Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
  * @param length Длина товара в сантиметрах.
  * @param width Ширина товара в сантиметрах.
  * @param height Высота товара в сантиметрах.
  * @param weight Вес товара в килограммах.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GoodsStatsWeightDimensionsDTO(
  length: Option[BigDecimal],
  width: Option[BigDecimal],
  height: Option[BigDecimal],
  weight: Option[BigDecimal]
)

object GoodsStatsWeightDimensionsDTO {
  implicit lazy val goodsStatsWeightDimensionsDTOJsonFormat: Format[GoodsStatsWeightDimensionsDTO] = Json.format[GoodsStatsWeightDimensionsDTO]
}

