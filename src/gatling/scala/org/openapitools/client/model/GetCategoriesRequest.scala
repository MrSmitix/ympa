
package org.openapitools.client.model


case class GetCategoriesRequest (
    _language: Option[LanguageType]
)
object GetCategoriesRequest {
    def toStringBody(var_language: Object) =
        s"""
        | {
        | "language":$var_language
        | }
        """.stripMargin
}
