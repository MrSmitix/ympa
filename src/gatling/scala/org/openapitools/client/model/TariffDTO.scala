
package org.openapitools.client.model


case class TariffDTO (
    _type: TariffType,
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.  */
    _percent: Option[Number],
    /* Значение тарифа в рублях. */
    _amount: Number,
    /* Параметры расчета тарифа. */
    _parameters: List[TariffParameterDTO]
)
object TariffDTO {
    def toStringBody(var_type: Object, var_percent: Object, var_amount: Object, var_parameters: Object) =
        s"""
        | {
        | "type":$var_type,"percent":$var_percent,"amount":$var_amount,"parameters":$var_parameters
        | }
        """.stripMargin
}
