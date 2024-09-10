
package org.openapitools.client.model


case class GetWarehouseStocksRequest (
    /* **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`.  */
    _withTurnover: Option[Boolean],
    /* Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве.  */
    _archived: Option[Boolean],
    /* Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}     */
    _offerIds: Option[Set[String]]
)
object GetWarehouseStocksRequest {
    def toStringBody(var_withTurnover: Object, var_archived: Object, var_offerIds: Object) =
        s"""
        | {
        | "withTurnover":$var_withTurnover,"archived":$var_archived,"offerIds":$var_offerIds
        | }
        """.stripMargin
}
