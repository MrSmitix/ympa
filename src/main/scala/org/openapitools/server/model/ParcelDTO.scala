package org.openapitools.server.model


/**
 * Информация о грузовых местах в заказе.
 *
 * @param boxes Список грузовых мест. Маркет определяет количество мест по длине этого списка. for example: ''null''
*/
final case class ParcelDTO (
  boxes: Seq[ParcelBoxDTO]
)

