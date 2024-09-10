package org.openapitools.server.model


/**
 * Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
 *
 * @param id Идентификатор категории. for example: ''null''
 * @param name Название категории. for example: ''null''
 * @param children Дочерние категории. for example: ''null''
*/
final case class CategoryDTO (
  id: Long,
  name: String,
  children: Option[Seq[CategoryDTO]] = None
)

