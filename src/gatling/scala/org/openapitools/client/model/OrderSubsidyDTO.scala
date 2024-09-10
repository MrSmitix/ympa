
package org.openapitools.client.model


case class OrderSubsidyDTO (
    _type: Option[OrderSubsidyType],
    /* Сумма субсидии. */
    _amount: Option[Number]
)
object OrderSubsidyDTO {
    def toStringBody(var_type: Object, var_amount: Object) =
        s"""
        | {
        | "type":$var_type,"amount":$var_amount
        | }
        """.stripMargin
}
