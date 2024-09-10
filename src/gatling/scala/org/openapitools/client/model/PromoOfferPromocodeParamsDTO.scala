
package org.openapitools.client.model


case class PromoOfferPromocodeParamsDTO (
    /* Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров.  */
    _maxPrice: Long
)
object PromoOfferPromocodeParamsDTO {
    def toStringBody(var_maxPrice: Object) =
        s"""
        | {
        | "maxPrice":$var_maxPrice
        | }
        """.stripMargin
}
