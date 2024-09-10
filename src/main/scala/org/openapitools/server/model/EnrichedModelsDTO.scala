package org.openapitools.server.model


/**
 * Список моделей товаров.
 *
 * @param models Список моделей товаров. for example: ''null''
*/
final case class EnrichedModelsDTO (
  models: Seq[EnrichedModelDTO]
)

