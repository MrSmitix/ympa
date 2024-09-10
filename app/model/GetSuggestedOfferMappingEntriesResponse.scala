package model

import play.api.libs.json._

/**
  * Ответ со списком рекомендованных карточек товара.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetSuggestedOfferMappingEntriesResponse(
  status: Option[ApiResponseStatusType],
  result: Option[OfferMappingSuggestionsListDTO]
  additionalProperties: 
)

object GetSuggestedOfferMappingEntriesResponse {
  implicit lazy val getSuggestedOfferMappingEntriesResponseJsonFormat: Format[GetSuggestedOfferMappingEntriesResponse] = {
    val realJsonFormat = Json.format[GetSuggestedOfferMappingEntriesResponse]
    val declaredPropNames = Set("status", "result")
    
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
      Writes { getSuggestedOfferMappingEntriesResponse =>
        val jsObj = realJsonFormat.writes(getSuggestedOfferMappingEntriesResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

