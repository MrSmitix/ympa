
package org.openapitools.client.model


case class BusinessSettingsDTO (
    /* Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену.  */
    _onlyDefaultPrice: Option[Boolean],
    _currency: Option[CurrencyType]
)
object BusinessSettingsDTO {
    def toStringBody(var_onlyDefaultPrice: Object, var_currency: Object) =
        s"""
        | {
        | "onlyDefaultPrice":$var_onlyDefaultPrice,"currency":$var_currency
        | }
        """.stripMargin
}
