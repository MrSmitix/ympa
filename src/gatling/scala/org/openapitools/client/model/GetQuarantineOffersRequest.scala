
package org.openapitools.client.model


case class GetQuarantineOffersRequest (
    /* Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  */
    _offerIds: Option[List[String]],
    /* Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  */
    _cardStatuses: Option[List[OfferCardStatusType]],
    /* Фильтр по категориям на Маркете. */
    _categoryIds: Option[List[Integer]],
    /* Фильтр по брендам. */
    _vendorNames: Option[List[String]],
    /* Фильтр по тегам. */
    _tags: Option[List[String]]
)
object GetQuarantineOffersRequest {
    def toStringBody(var_offerIds: Object, var_cardStatuses: Object, var_categoryIds: Object, var_vendorNames: Object, var_tags: Object) =
        s"""
        | {
        | "offerIds":$var_offerIds,"cardStatuses":$var_cardStatuses,"categoryIds":$var_categoryIds,"vendorNames":$var_vendorNames,"tags":$var_tags
        | }
        """.stripMargin
}
