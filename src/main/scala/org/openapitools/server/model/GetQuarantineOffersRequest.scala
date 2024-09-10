package org.openapitools.server.model


/**
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 *
 * @param offerIds Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  for example: ''null''
 * @param cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  for example: ''null''
 * @param categoryIds Фильтр по категориям на Маркете. for example: ''null''
 * @param vendorNames Фильтр по брендам. for example: ''null''
 * @param tags Фильтр по тегам. for example: ''null''
*/
final case class GetQuarantineOffersRequest (
  offerIds: Option[Seq[String]] = None,
  cardStatuses: Option[Seq[OfferCardStatusType]] = None,
  categoryIds: Option[Seq[Int]] = None,
  vendorNames: Option[Seq[String]] = None,
  tags: Option[Seq[String]] = None
)

