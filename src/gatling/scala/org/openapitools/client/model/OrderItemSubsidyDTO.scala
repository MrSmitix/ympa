
package org.openapitools.client.model


case class OrderItemSubsidyDTO (
    _type: Option[OrderItemSubsidyType],
    /* Сумма субсидии. */
    _amount: Option[Number]
)
object OrderItemSubsidyDTO {
    def toStringBody(var_type: Object, var_amount: Object) =
        s"""
        | {
        | "type":$var_type,"amount":$var_amount
        | }
        """.stripMargin
}
