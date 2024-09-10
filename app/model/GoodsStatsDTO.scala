package model

import play.api.libs.json._

/**
  * Отчет по товарам.
  * @param shopSkus Список товаров.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GoodsStatsDTO(
  shopSkus: List[GoodsStatsGoodsDTO]
)

object GoodsStatsDTO {
  implicit lazy val goodsStatsDTOJsonFormat: Format[GoodsStatsDTO] = Json.format[GoodsStatsDTO]
}

