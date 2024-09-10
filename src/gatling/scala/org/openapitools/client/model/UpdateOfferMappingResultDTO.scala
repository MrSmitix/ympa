
package org.openapitools.client.model


case class UpdateOfferMappingResultDTO (
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _offerId: String,
    /* Ошибки — информация в каталоге не обновится. */
    _errors: Option[List[OfferMappingErrorDTO]],
    /* Предупреждения — информация в каталоге обновится. */
    _warnings: Option[List[OfferMappingErrorDTO]]
)
object UpdateOfferMappingResultDTO {
    def toStringBody(var_offerId: Object, var_errors: Object, var_warnings: Object) =
        s"""
        | {
        | "offerId":$var_offerId,"errors":$var_errors,"warnings":$var_warnings
        | }
        """.stripMargin
}
