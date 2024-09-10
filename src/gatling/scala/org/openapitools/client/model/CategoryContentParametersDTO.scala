
package org.openapitools.client.model


case class CategoryContentParametersDTO (
    /* Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). */
    _categoryId: Integer,
    /* Список характеристик. */
    _parameters: Option[List[CategoryParameterDTO]]
)
object CategoryContentParametersDTO {
    def toStringBody(var_categoryId: Object, var_parameters: Object) =
        s"""
        | {
        | "categoryId":$var_categoryId,"parameters":$var_parameters
        | }
        """.stripMargin
}
