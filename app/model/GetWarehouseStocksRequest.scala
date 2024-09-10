package model

import play.api.libs.json._
import scala.collection.immutable.Set

/**
  * Фильтры для запроса остатков. 
  * @param withTurnover **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`. 
  * @param archived Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве. 
  * @param offerIds Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}    
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetWarehouseStocksRequest(
  withTurnover: Option[Boolean],
  archived: Option[Boolean],
  offerIds: Option[Set[String]]
)

object GetWarehouseStocksRequest {
  implicit lazy val getWarehouseStocksRequestJsonFormat: Format[GetWarehouseStocksRequest] = Json.format[GetWarehouseStocksRequest]
}

