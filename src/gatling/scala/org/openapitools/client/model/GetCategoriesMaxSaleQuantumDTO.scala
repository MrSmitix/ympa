
package org.openapitools.client.model


case class GetCategoriesMaxSaleQuantumDTO (
    /* Категории и лимит на установку кванта и минимального количества товаров. */
    _results: List[MaxSaleQuantumDTO],
    /* Ошибки, которые появились из-за переданных категорий. */
    _errors: Option[List[CategoryErrorDTO]]
)
object GetCategoriesMaxSaleQuantumDTO {
    def toStringBody(var_results: Object, var_errors: Object) =
        s"""
        | {
        | "results":$var_results,"errors":$var_errors
        | }
        """.stripMargin
}
