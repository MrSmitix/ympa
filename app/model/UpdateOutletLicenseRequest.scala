package model

import play.api.libs.json._

/**
  * Запрос на создание или изменение лицензий для точек продаж.
  * @param licenses Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateOutletLicenseRequest(
  licenses: List[OutletLicenseDTO]
)

object UpdateOutletLicenseRequest {
  implicit lazy val updateOutletLicenseRequestJsonFormat: Format[UpdateOutletLicenseRequest] = Json.format[UpdateOutletLicenseRequest]
}

