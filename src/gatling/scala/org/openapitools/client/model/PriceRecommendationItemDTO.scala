
package org.openapitools.client.model


case class PriceRecommendationItemDTO (
    /* Идентификатор кампании. */
    _campaignId: Long,
    /* Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices)  */
    _price: Number
)
object PriceRecommendationItemDTO {
    def toStringBody(var_campaignId: Object, var_price: Object) =
        s"""
        | {
        | "campaignId":$var_campaignId,"price":$var_price
        | }
        """.stripMargin
}
