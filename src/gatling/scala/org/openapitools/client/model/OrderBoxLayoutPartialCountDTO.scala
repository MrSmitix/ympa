
package org.openapitools.client.model


case class OrderBoxLayoutPartialCountDTO (
    /* Номер части, начиная с 1. */
    _current: Integer,
    /* На сколько всего частей разделен товар. */
    _total: Integer
)
object OrderBoxLayoutPartialCountDTO {
    def toStringBody(var_current: Object, var_total: Object) =
        s"""
        | {
        | "current":$var_current,"total":$var_total
        | }
        """.stripMargin
}
