package model

import play.api.libs.json._

/**
  * Описывает проблемы, которые появились при сохранении товара.
  * @param results Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateOfferContentResponse(
  status: Option[ApiResponseStatusType],
  results: Option[List[UpdateOfferContentResultDTO]]
  additionalProperties: 
)

object UpdateOfferContentResponse {
  implicit lazy val updateOfferContentResponseJsonFormat: Format[UpdateOfferContentResponse] = {
    val realJsonFormat = Json.format[UpdateOfferContentResponse]
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
      Writes { updateOfferContentResponse =>
        val jsObj = realJsonFormat.writes(updateOfferContentResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

