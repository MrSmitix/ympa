package org.openapitools.server.model


/**
 * Количество палет в отгрузке.
 *
 * @param planned Количество палет, которое заявил продавец. for example: ''null''
 * @param fact Количество палет, которое приняли в сортировочном центре. for example: ''null''
*/
final case class PalletsCountDTO (
  planned: Option[Int] = None,
  fact: Option[Int] = None
)

