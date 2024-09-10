
package org.openapitools.client.model


case class GetCampaignOfferDTO (
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _offerId: String,
    _quantum: Option[QuantumDTO],
    /* Есть ли товар в продаже.  */
    _available: Option[Boolean],
    _basicPrice: Option[GetPriceWithDiscountDTO],
    _campaignPrice: Option[GetPriceWithVatDTO],
    _status: Option[OfferCampaignStatusType],
    /* Ошибки, препятствующие размещению товара на витрине.  */
    _errors: Option[List[OfferErrorDTO]],
    /* Предупреждения, не препятствующие размещению товара на витрине.  */
    _warnings: Option[List[OfferErrorDTO]]
)
object GetCampaignOfferDTO {
    def toStringBody(var_offerId: Object, var_quantum: Object, var_available: Object, var_basicPrice: Object, var_campaignPrice: Object, var_status: Object, var_errors: Object, var_warnings: Object) =
        s"""
        | {
        | "offerId":$var_offerId,"quantum":$var_quantum,"available":$var_available,"basicPrice":$var_basicPrice,"campaignPrice":$var_campaignPrice,"status":$var_status,"errors":$var_errors,"warnings":$var_warnings
        | }
        """.stripMargin
}
