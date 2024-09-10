
package org.openapitools.client.model


case class GetPricesByOfferIdsRequest (
    /* Список SKU.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}     */
    _offerIds: Option[List[String]]
)
object GetPricesByOfferIdsRequest {
    def toStringBody(var_offerIds: Object) =
        s"""
        | {
        | "offerIds":$var_offerIds
        | }
        """.stripMargin
}
