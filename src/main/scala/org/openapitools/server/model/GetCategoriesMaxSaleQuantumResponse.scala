package org.openapitools.server.model


/**
 * @param status  for example: ''null''
 * @param results Категории и лимит на установку кванта и минимального количества товаров. for example: ''null''
 * @param errors Ошибки, которые появились из-за переданных категорий. for example: ''null''
*/
final case class GetCategoriesMaxSaleQuantumResponse (
  status: Option[ApiResponseStatusType] = None,
  results: Seq[MaxSaleQuantumDTO],
  errors: Option[Seq[CategoryErrorDTO]] = None
)

