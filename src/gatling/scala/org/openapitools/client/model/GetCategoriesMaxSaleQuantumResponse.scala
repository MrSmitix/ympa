
package org.openapitools.client.model


case class GetCategoriesMaxSaleQuantumResponse (
    _status: Option[ApiResponseStatusType],
    /* Категории и лимит на установку кванта и минимального количества товаров. */
    _results: List[MaxSaleQuantumDTO],
    /* Ошибки, которые появились из-за переданных категорий. */
    _errors: Option[List[CategoryErrorDTO]]
)
object GetCategoriesMaxSaleQuantumResponse {
    def toStringBody(var_status: Object, var_results: Object, var_errors: Object) =
        s"""
        | {
        | "status":$var_status,"results":$var_results,"errors":$var_errors
        | }
        """.stripMargin
}
