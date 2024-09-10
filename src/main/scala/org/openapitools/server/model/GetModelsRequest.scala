package org.openapitools.server.model


/**
 * Запрос информации о моделях.
 *
 * @param models Список моделей. for example: ''null''
*/
final case class GetModelsRequest (
  models: Seq[Long]
)

