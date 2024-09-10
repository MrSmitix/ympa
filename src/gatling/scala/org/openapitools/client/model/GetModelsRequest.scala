
package org.openapitools.client.model


case class GetModelsRequest (
    /* Список моделей. */
    _models: List[Long]
)
object GetModelsRequest {
    def toStringBody(var_models: Object) =
        s"""
        | {
        | "models":$var_models
        | }
        """.stripMargin
}
