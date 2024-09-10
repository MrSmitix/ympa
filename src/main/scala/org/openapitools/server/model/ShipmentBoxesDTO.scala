package org.openapitools.server.model


/**
 * В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
 *
 * @param boxes Список грузовых мест. Маркет определил количество мест по длине этого списка.  for example: ''null''
*/
final case class ShipmentBoxesDTO (
  boxes: Seq[ParcelBoxDTO]
)

