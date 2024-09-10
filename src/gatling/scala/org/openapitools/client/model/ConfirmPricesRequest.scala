
package org.openapitools.client.model


case class ConfirmPricesRequest (
    /* Идентификаторы товаров, у которых подтверждается цена. */
    _offerIds: List[String]
)
object ConfirmPricesRequest {
    def toStringBody(var_offerIds: Object) =
        s"""
        | {
        | "offerIds":$var_offerIds
        | }
        """.stripMargin
}
