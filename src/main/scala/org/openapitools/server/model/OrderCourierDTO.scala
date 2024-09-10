package org.openapitools.server.model


/**
 * Информация о курьере.
 *
 * @param fullName Полное имя курьера. for example: ''null''
 * @param phone Номер телефона курьера. for example: ''null''
 * @param phoneExtension Добавочный номер телефона. for example: ''null''
 * @param vehicleNumber Номер транспортного средства. for example: ''null''
 * @param vehicleDescription Описание машины. Например, модель и цвет. for example: ''null''
*/
final case class OrderCourierDTO (
  fullName: Option[String] = None,
  phone: Option[String] = None,
  phoneExtension: Option[String] = None,
  vehicleNumber: Option[String] = None,
  vehicleDescription: Option[String] = None
)

