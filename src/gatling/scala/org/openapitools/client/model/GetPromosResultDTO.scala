
package org.openapitools.client.model


case class GetPromosResultDTO (
    /* Акции Маркета. */
    _promos: List[GetPromoDTO]
)
object GetPromosResultDTO {
    def toStringBody(var_promos: Object) =
        s"""
        | {
        | "promos":$var_promos
        | }
        """.stripMargin
}
