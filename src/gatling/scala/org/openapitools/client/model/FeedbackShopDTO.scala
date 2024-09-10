
package org.openapitools.client.model


case class FeedbackShopDTO (
    /* Название магазина. */
    _name: Option[String]
)
object FeedbackShopDTO {
    def toStringBody(var_name: Object) =
        s"""
        | {
        | "name":$var_name
        | }
        """.stripMargin
}
