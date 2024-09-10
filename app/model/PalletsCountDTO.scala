package model

import play.api.libs.json._

/**
  * Количество палет в отгрузке.
  * @param planned Количество палет, которое заявил продавец.
  * @param fact Количество палет, которое приняли в сортировочном центре.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PalletsCountDTO(
  planned: Option[Int],
  fact: Option[Int]
)

object PalletsCountDTO {
  implicit lazy val palletsCountDTOJsonFormat: Format[PalletsCountDTO] = Json.format[PalletsCountDTO]
}

