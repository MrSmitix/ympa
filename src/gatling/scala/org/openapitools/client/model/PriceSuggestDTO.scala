
package org.openapitools.client.model


case class PriceSuggestDTO (
    _type: Option[PriceSuggestType],
    /* Цена в рублях. */
    _price: Option[Number]
)
object PriceSuggestDTO {
    def toStringBody(var_type: Object, var_price: Object) =
        s"""
        | {
        | "type":$var_type,"price":$var_price
        | }
        """.stripMargin
}
