
package org.openapitools.client.model


case class GetOfferCardsContentStatusRequest (
    /* Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  */
    _offerIds: Option[Set[String]],
    /* Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  */
    _cardStatuses: Option[Set[OfferCardStatusType]],
    /* Фильтр по категориям на Маркете. */
    _categoryIds: Option[Set[Integer]]
)
object GetOfferCardsContentStatusRequest {
    def toStringBody(var_offerIds: Object, var_cardStatuses: Object, var_categoryIds: Object) =
        s"""
        | {
        | "offerIds":$var_offerIds,"cardStatuses":$var_cardStatuses,"categoryIds":$var_categoryIds
        | }
        """.stripMargin
}
