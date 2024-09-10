package model

import play.api.libs.json._

/**
  * В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
  * @param boxes Список грузовых мест. Маркет определил количество мест по длине этого списка. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ShipmentBoxesDTO(
  boxes: List[ParcelBoxDTO]
)

object ShipmentBoxesDTO {
  implicit lazy val shipmentBoxesDTOJsonFormat: Format[ShipmentBoxesDTO] = Json.format[ShipmentBoxesDTO]
}

