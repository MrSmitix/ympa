package model

import play.api.libs.json._
import scala.collection.immutable.Set

/**
  * Запрос отчета по товарам.
  * @param shopSkus Список ваших идентификаторов SKU. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetGoodsStatsRequest(
  shopSkus: Set[String]
)

object GetGoodsStatsRequest {
  implicit lazy val getGoodsStatsRequestJsonFormat: Format[GetGoodsStatsRequest] = Json.format[GetGoodsStatsRequest]
}

