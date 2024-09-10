package model

import play.api.libs.json._

/**
  * GPS-координаты широты и долготы. 
  * @param latitude Широта.
  * @param longitude Долгота.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GpsDTO(
  latitude: BigDecimal,
  longitude: BigDecimal
)

object GpsDTO {
  implicit lazy val gpsDTOJsonFormat: Format[GpsDTO] = Json.format[GpsDTO]
}

