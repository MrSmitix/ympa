package org.openapitools.server.model


/**
 * Запрос списка цен.
 *
 * @param offerIds Список SKU.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}     for example: ''null''
*/
final case class GetPricesByOfferIdsRequest (
  offerIds: Option[Seq[String]] = None
)

