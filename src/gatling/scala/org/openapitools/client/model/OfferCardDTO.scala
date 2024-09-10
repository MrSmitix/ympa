
package org.openapitools.client.model


case class OfferCardDTO (
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _offerId: String,
    _mapping: Option[GetMappingDTO],
    /* Список характеристик с их значениями.  */
    _parameterValues: Option[List[ParameterValueDTO]],
    _cardStatus: Option[OfferCardStatusType],
    /* Процент заполненности карточки. */
    _contentRating: Option[Integer],
    /* Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.  */
    _recommendations: Option[List[OfferCardRecommendationDTO]],
    /* Ошибки в контенте, препятствующие размещению товара на витрине. */
    _errors: Option[List[OfferErrorDTO]],
    /* Связанные с контентом предупреждения, не препятствующие размещению товара на витрине. */
    _warnings: Option[List[OfferErrorDTO]]
)
object OfferCardDTO {
    def toStringBody(var_offerId: Object, var_mapping: Object, var_parameterValues: Object, var_cardStatus: Object, var_contentRating: Object, var_recommendations: Object, var_errors: Object, var_warnings: Object) =
        s"""
        | {
        | "offerId":$var_offerId,"mapping":$var_mapping,"parameterValues":$var_parameterValues,"cardStatus":$var_cardStatus,"contentRating":$var_contentRating,"recommendations":$var_recommendations,"errors":$var_errors,"warnings":$var_warnings
        | }
        """.stripMargin
}
