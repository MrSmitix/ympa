package org.openapitools.server.model


/**
 * @param offerIds Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}     for example: ''null''
 * @param cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  for example: ''null''
 * @param categoryIds Фильтр по категориям на Маркете. for example: ''null''
 * @param vendorNames Фильтр по брендам. for example: ''null''
 * @param tags Фильтр по тегам. for example: ''null''
 * @param archived Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве.  for example: ''null''
*/
final case class GetOfferMappingsRequest (
  offerIds: Option[Seq[String]] = None,
  cardStatuses: Option[Seq[OfferCardStatusType]] = None,
  categoryIds: Option[Seq[Int]] = None,
  vendorNames: Option[Seq[String]] = None,
  tags: Option[Seq[String]] = None,
  archived: Option[Boolean] = None
)

