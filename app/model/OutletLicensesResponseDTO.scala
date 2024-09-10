package model

import play.api.libs.json._

/**
  * Ответ на запрос информации о лицензиях для точек продаж.
  * @param licenses Список лицензий.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OutletLicensesResponseDTO(
  licenses: List[FullOutletLicenseDTO]
)

object OutletLicensesResponseDTO {
  implicit lazy val outletLicensesResponseDTOJsonFormat: Format[OutletLicensesResponseDTO] = Json.format[OutletLicensesResponseDTO]
}

