
package org.openapitools.client.model


case class CalculatedTariffDTO (
    _type: CalculatedTariffType,
    /* Стоимость услуги в рублях. */
    _amount: Option[Number],
    /* Параметры расчета тарифа. */
    _parameters: List[TariffParameterDTO]
)
object CalculatedTariffDTO {
    def toStringBody(var_type: Object, var_amount: Object, var_parameters: Object) =
        s"""
        | {
        | "type":$var_type,"amount":$var_amount,"parameters":$var_parameters
        | }
        """.stripMargin
}
