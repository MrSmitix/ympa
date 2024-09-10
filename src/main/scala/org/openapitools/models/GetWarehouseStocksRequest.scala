package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Фильтры для запроса остатков. 
 * @param withTurnover **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`. 
 * @param archived Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве. 
 * @param offerIds Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}    
 */
case class GetWarehouseStocksRequest(withTurnover: Option[Boolean],
                archived: Option[Boolean],
                offerIds: Option[Set[String]]
                )

object GetWarehouseStocksRequest {
    /**
     * Creates the codec for converting GetWarehouseStocksRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetWarehouseStocksRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetWarehouseStocksRequest] = deriveEncoder
}
