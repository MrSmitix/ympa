package org.openapitools.server.model


/**
 * @param offerIds Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  for example: ''null''
 * @param cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  for example: ''null''
 * @param categoryIds Фильтр по категориям на Маркете. for example: ''null''
*/
final case class GetOfferCardsContentStatusRequest (
  offerIds: Option[Set[String]] = None,
  cardStatuses: Option[Set[OfferCardStatusType]] = None,
  categoryIds: Option[Set[Int]] = None
)

