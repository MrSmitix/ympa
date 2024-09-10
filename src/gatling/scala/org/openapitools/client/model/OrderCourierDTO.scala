
package org.openapitools.client.model


case class OrderCourierDTO (
    /* Полное имя курьера. */
    _fullName: Option[String],
    /* Номер телефона курьера. */
    _phone: Option[String],
    /* Добавочный номер телефона. */
    _phoneExtension: Option[String],
    /* Номер транспортного средства. */
    _vehicleNumber: Option[String],
    /* Описание машины. Например, модель и цвет. */
    _vehicleDescription: Option[String]
)
object OrderCourierDTO {
    def toStringBody(var_fullName: Object, var_phone: Object, var_phoneExtension: Object, var_vehicleNumber: Object, var_vehicleDescription: Object) =
        s"""
        | {
        | "fullName":$var_fullName,"phone":$var_phone,"phoneExtension":$var_phoneExtension,"vehicleNumber":$var_vehicleNumber,"vehicleDescription":$var_vehicleDescription
        | }
        """.stripMargin
}
