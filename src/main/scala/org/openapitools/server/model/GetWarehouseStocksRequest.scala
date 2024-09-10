package org.openapitools.server.model


/**
 * Фильтры для запроса остатков. 
 *
 * @param withTurnover **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`.  for example: ''null''
 * @param archived Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве.  for example: ''null''
 * @param offerIds Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}     for example: ''null''
*/
final case class GetWarehouseStocksRequest (
  withTurnover: Option[Boolean] = None,
  archived: Option[Boolean] = None,
  offerIds: Option[Set[String]] = None
)

