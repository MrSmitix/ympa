package model

import play.api.libs.json._

/**
  * Список товаров. 
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferMappingEntryDTO(
  mapping: Option[OfferMappingDTO],
  awaitingModerationMapping: Option[OfferMappingDTO],
  rejectedMapping: Option[OfferMappingDTO],
  offer: Option[MappingsOfferDTO]
  additionalProperties: 
)

object OfferMappingEntryDTO {
  implicit lazy val offerMappingEntryDTOJsonFormat: Format[OfferMappingEntryDTO] = {
    val realJsonFormat = Json.format[OfferMappingEntryDTO]
    val declaredPropNames = Set("mapping", "awaitingModerationMapping", "rejectedMapping", "offer")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { offerMappingEntryDTO =>
        val jsObj = realJsonFormat.writes(offerMappingEntryDTO)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

