package model

import play.api.libs.json._

/**
  * Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferSellingProgramDTO(
  sellingProgram: SellingProgramType,
  status: OfferSellingProgramStatusType
)

object OfferSellingProgramDTO {
  implicit lazy val offerSellingProgramDTOJsonFormat: Format[OfferSellingProgramDTO] = Json.format[OfferSellingProgramDTO]
}

