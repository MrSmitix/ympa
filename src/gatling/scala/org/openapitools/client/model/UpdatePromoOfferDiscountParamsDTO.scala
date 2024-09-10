
package org.openapitools.client.model


case class UpdatePromoOfferDiscountParamsDTO (
    /* Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым.  */
    _price: Option[Long],
    /* Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым.  */
    _promoPrice: Option[Long]
)
object UpdatePromoOfferDiscountParamsDTO {
    def toStringBody(var_price: Object, var_promoPrice: Object) =
        s"""
        | {
        | "price":$var_price,"promoPrice":$var_promoPrice
        | }
        """.stripMargin
}
