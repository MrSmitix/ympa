package model

import play.api.libs.json._
import scala.collection.immutable.Set

/**
  * Запрос на изменение информации по остаткам товаров.
  * @param skus Данные об остатках товаров. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateStocksRequest(
  skus: Set[UpdateStockDTO]
)

object UpdateStocksRequest {
  implicit lazy val updateStocksRequestJsonFormat: Format[UpdateStocksRequest] = Json.format[UpdateStocksRequest]
}

