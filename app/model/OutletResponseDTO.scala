package model

import play.api.libs.json._

/**
  * Результат выполнения запроса. Выводится, если `status=\"OK\"`. 
  * @param id Идентификатор точки продаж, присвоенный Маркетом.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OutletResponseDTO(
  id: Option[Long]
)

object OutletResponseDTO {
  implicit lazy val outletResponseDTOJsonFormat: Format[OutletResponseDTO] = Json.format[OutletResponseDTO]
}

