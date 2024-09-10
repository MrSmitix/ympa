
package org.openapitools.client.model


case class OptionValuesLimitedDTO (
    /* Идентификатор значения ограничивающей характеристики. */
    _limitingOptionValueId: Long,
    /* Идентификаторы допустимых значений ограничиваемой характеристики.  */
    _optionValueIds: List[Long]
)
object OptionValuesLimitedDTO {
    def toStringBody(var_limitingOptionValueId: Object, var_optionValueIds: Object) =
        s"""
        | {
        | "limitingOptionValueId":$var_limitingOptionValueId,"optionValueIds":$var_optionValueIds
        | }
        """.stripMargin
}
