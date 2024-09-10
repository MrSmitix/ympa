package org.openapitools.server.model


/**
 * Лимит на установку кванта и минимального количества товаров по категориям. 
 *
 * @param id Идентификатор категории. for example: ''null''
 * @param name Название категории. for example: ''null''
 * @param maxSaleQuantum Лимит на установку кванта и минимального количества товаров. for example: ''null''
*/
final case class MaxSaleQuantumDTO (
  id: Long,
  name: Option[String] = None,
  maxSaleQuantum: Option[Int] = None
)

