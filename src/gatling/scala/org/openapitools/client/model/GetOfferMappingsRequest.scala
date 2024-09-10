
package org.openapitools.client.model


case class GetOfferMappingsRequest (
    /* Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}     */
    _offerIds: Option[List[String]],
    /* Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  */
    _cardStatuses: Option[List[OfferCardStatusType]],
    /* Фильтр по категориям на Маркете. */
    _categoryIds: Option[List[Integer]],
    /* Фильтр по брендам. */
    _vendorNames: Option[List[String]],
    /* Фильтр по тегам. */
    _tags: Option[List[String]],
    /* Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве.  */
    _archived: Option[Boolean]
)
object GetOfferMappingsRequest {
    def toStringBody(var_offerIds: Object, var_cardStatuses: Object, var_categoryIds: Object, var_vendorNames: Object, var_tags: Object, var_archived: Object) =
        s"""
        | {
        | "offerIds":$var_offerIds,"cardStatuses":$var_cardStatuses,"categoryIds":$var_categoryIds,"vendorNames":$var_vendorNames,"tags":$var_tags,"archived":$var_archived
        | }
        """.stripMargin
}
