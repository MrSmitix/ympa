package org.openapitools.server.model


/**
 * Результат выполнения запроса. Выводится, если `status=\"OK\"`. 
 *
 * @param id Идентификатор точки продаж, присвоенный Маркетом. for example: ''null''
*/
final case class OutletResponseDTO (
  id: Option[Long] = None
)

