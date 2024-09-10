package model

import play.api.libs.json._

/**
  * Ответ на запрос списка товаров в каталоге.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetOfferMappingEntriesResponse(
  status: Option[ApiResponseStatusType],
  result: Option[OfferMappingEntriesDTO]
  additionalProperties: 
)

object GetOfferMappingEntriesResponse {
  implicit lazy val getOfferMappingEntriesResponseJsonFormat: Format[GetOfferMappingEntriesResponse] = {
    val realJsonFormat = Json.format[GetOfferMappingEntriesResponse]
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
      Writes { getOfferMappingEntriesResponse =>
        val jsObj = realJsonFormat.writes(getOfferMappingEntriesResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

