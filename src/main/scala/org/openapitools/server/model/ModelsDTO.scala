package org.openapitools.server.model


/**
 * Список моделей товаров.
 *
 * @param models Список моделей товаров. for example: ''null''
*/
final case class ModelsDTO (
  models: Seq[ModelDTO]
)

