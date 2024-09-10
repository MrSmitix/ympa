package org.openapitools.server.model


/**
 * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 *
 * @param marketCategoryIds Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий. for example: ''null''
*/
final case class GetCategoriesMaxSaleQuantumRequest (
  marketCategoryIds: Set[Long]
)

