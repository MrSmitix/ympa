package org.openapitools.server.model


/**
 * @param boxes Список грузовых мест. Маркет определяет количество мест по длине этого списка. for example: ''null''
*/
final case class SetOrderShipmentBoxesRequest (
  boxes: Seq[ParcelBoxDTO]
)

