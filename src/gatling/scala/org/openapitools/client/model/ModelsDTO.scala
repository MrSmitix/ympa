
package org.openapitools.client.model


case class ModelsDTO (
    /* Список моделей товаров. */
    _models: List[ModelDTO]
)
object ModelsDTO {
    def toStringBody(var_models: Object) =
        s"""
        | {
        | "models":$var_models
        | }
        """.stripMargin
}
