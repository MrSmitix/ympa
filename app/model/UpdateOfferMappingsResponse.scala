package model

import play.api.libs.json._

/**
  * Описывает проблемы, возникшие при сохранении товара.
  * @param results Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateOfferMappingsResponse(
  status: Option[ApiResponseStatusType],
  results: Option[List[UpdateOfferMappingResultDTO]]
  additionalProperties: 
)

object UpdateOfferMappingsResponse {
  implicit lazy val updateOfferMappingsResponseJsonFormat: Format[UpdateOfferMappingsResponse] = {
    val realJsonFormat = Json.format[UpdateOfferMappingsResponse]
    val declaredPropNames = Set("status", "results")
    
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
      Writes { updateOfferMappingsResponse =>
        val jsObj = realJsonFormat.writes(updateOfferMappingsResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

