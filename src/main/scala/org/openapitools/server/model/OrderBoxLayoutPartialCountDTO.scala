package org.openapitools.server.model


/**
 * Информация о части товара в коробке.
 *
 * @param current Номер части, начиная с 1. for example: ''null''
 * @param total На сколько всего частей разделен товар. for example: ''null''
*/
final case class OrderBoxLayoutPartialCountDTO (
  current: Int,
  total: Int
)

