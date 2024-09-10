package org.openapitools.server.model


/**
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 *
 * @param offerIds Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}     for example: ''null''
 * @param statuses Фильтр по статусам товаров.  for example: ''null''
 * @param categoryIds Фильтр по категориям на Маркете. for example: ''null''
 * @param vendorNames Фильтр по брендам. for example: ''null''
 * @param tags Фильтр по тегам. for example: ''null''
*/
final case class GetCampaignOffersRequest (
  offerIds: Option[Seq[String]] = None,
  statuses: Option[Seq[OfferCampaignStatusType]] = None,
  categoryIds: Option[Seq[Int]] = None,
  vendorNames: Option[Seq[String]] = None,
  tags: Option[Seq[String]] = None
)

