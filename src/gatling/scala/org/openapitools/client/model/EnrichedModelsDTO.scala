
package org.openapitools.client.model


case class EnrichedModelsDTO (
    /* Список моделей товаров. */
    _models: List[EnrichedModelDTO]
)
object EnrichedModelsDTO {
    def toStringBody(var_models: Object) =
        s"""
        | {
        | "models":$var_models
        | }
        """.stripMargin
}
