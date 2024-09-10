package org.openapitools.server.model


/**
 * Информация о параметрах категории.
 *
 * @param categoryId Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). for example: ''null''
 * @param parameters Список характеристик. for example: ''null''
*/
final case class CategoryContentParametersDTO (
  categoryId: Int,
  parameters: Option[Seq[CategoryParameterDTO]] = None
)

