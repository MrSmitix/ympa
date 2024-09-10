package org.openapitools.server.model


/**
 * Категории и лимит на установку кванта и минимального количества товаров.
 *
 * @param results Категории и лимит на установку кванта и минимального количества товаров. for example: ''null''
 * @param errors Ошибки, которые появились из-за переданных категорий. for example: ''null''
*/
final case class GetCategoriesMaxSaleQuantumDTO (
  results: Seq[MaxSaleQuantumDTO],
  errors: Option[Seq[CategoryErrorDTO]] = None
)

