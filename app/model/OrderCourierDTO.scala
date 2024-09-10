package model

import play.api.libs.json._

/**
  * Информация о курьере.
  * @param fullName Полное имя курьера.
  * @param phone Номер телефона курьера.
  * @param phoneExtension Добавочный номер телефона.
  * @param vehicleNumber Номер транспортного средства.
  * @param vehicleDescription Описание машины. Например, модель и цвет.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderCourierDTO(
  fullName: Option[String],
  phone: Option[String],
  phoneExtension: Option[String],
  vehicleNumber: Option[String],
  vehicleDescription: Option[String]
)

object OrderCourierDTO {
  implicit lazy val orderCourierDTOJsonFormat: Format[OrderCourierDTO] = Json.format[OrderCourierDTO]
}

