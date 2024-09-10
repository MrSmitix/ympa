
package org.openapitools.client.model


case class PromoOfferDiscountParamsDTO (
    /* Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  */
    _price: Option[Long],
    /* Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  */
    _promoPrice: Option[Long],
    /* Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.  */
    _maxPromoPrice: Long
)
object PromoOfferDiscountParamsDTO {
    def toStringBody(var_price: Object, var_promoPrice: Object, var_maxPromoPrice: Object) =
        s"""
        | {
        | "price":$var_price,"promoPrice":$var_promoPrice,"maxPromoPrice":$var_maxPromoPrice
        | }
        """.stripMargin
}
