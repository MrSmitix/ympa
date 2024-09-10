package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetWarehouseStocksRequest._

case class GetWarehouseStocksRequest (
  /* **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`.  */
  withTurnover: Option[Boolean],
/* Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве.  */
  archived: Option[Boolean],
/* Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}     */
  offerIds: Option[Set[String]])

object GetWarehouseStocksRequest {
  import DateTimeCodecs._

  implicit val GetWarehouseStocksRequestCodecJson: CodecJson[GetWarehouseStocksRequest] = CodecJson.derive[GetWarehouseStocksRequest]
  implicit val GetWarehouseStocksRequestDecoder: EntityDecoder[GetWarehouseStocksRequest] = jsonOf[GetWarehouseStocksRequest]
  implicit val GetWarehouseStocksRequestEncoder: EntityEncoder[GetWarehouseStocksRequest] = jsonEncoderOf[GetWarehouseStocksRequest]
}
