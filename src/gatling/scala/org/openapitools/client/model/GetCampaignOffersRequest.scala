
package org.openapitools.client.model


case class GetCampaignOffersRequest (
    /* Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}     */
    _offerIds: Option[List[String]],
    /* Фильтр по статусам товаров.  */
    _statuses: Option[List[OfferCampaignStatusType]],
    /* Фильтр по категориям на Маркете. */
    _categoryIds: Option[List[Integer]],
    /* Фильтр по брендам. */
    _vendorNames: Option[List[String]],
    /* Фильтр по тегам. */
    _tags: Option[List[String]]
)
object GetCampaignOffersRequest {
    def toStringBody(var_offerIds: Object, var_statuses: Object, var_categoryIds: Object, var_vendorNames: Object, var_tags: Object) =
        s"""
        | {
        | "offerIds":$var_offerIds,"statuses":$var_statuses,"categoryIds":$var_categoryIds,"vendorNames":$var_vendorNames,"tags":$var_tags
        | }
        """.stripMargin
}
