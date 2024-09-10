
package org.openapitools.client.model


case class CalculateTariffsParametersDTO (
    /* Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке.  */
    _campaignId: Option[Long],
    _sellingProgram: Option[SellingProgramType],
    _frequency: Option[PaymentFrequencyType]
)
object CalculateTariffsParametersDTO {
    def toStringBody(var_campaignId: Object, var_sellingProgram: Object, var_frequency: Object) =
        s"""
        | {
        | "campaignId":$var_campaignId,"sellingProgram":$var_sellingProgram,"frequency":$var_frequency
        | }
        """.stripMargin
}
