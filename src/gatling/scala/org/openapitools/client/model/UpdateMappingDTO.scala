
package org.openapitools.client.model


case class UpdateMappingDTO (
    /* SKU на Маркете. */
    _marketSku: Option[Long]
)
object UpdateMappingDTO {
    def toStringBody(var_marketSku: Object) =
        s"""
        | {
        | "marketSku":$var_marketSku
        | }
        """.stripMargin
}
