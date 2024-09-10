
package org.openapitools.client.model


case class GetCategoriesMaxSaleQuantumRequest (
    /* Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий. */
    _marketCategoryIds: Set[Long]
)
object GetCategoriesMaxSaleQuantumRequest {
    def toStringBody(var_marketCategoryIds: Object) =
        s"""
        | {
        | "marketCategoryIds":$var_marketCategoryIds
        | }
        """.stripMargin
}
