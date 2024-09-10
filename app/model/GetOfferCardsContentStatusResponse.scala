package model

import play.api.libs.json._

/**
  * Ответ со списком состояний товаров и пагинацией.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetOfferCardsContentStatusResponse(
  status: Option[ApiResponseStatusType],
  result: Option[OfferCardsContentStatusDTO]
  additionalProperties: 
)

object GetOfferCardsContentStatusResponse {
  implicit lazy val getOfferCardsContentStatusResponseJsonFormat: Format[GetOfferCardsContentStatusResponse] = {
    val realJsonFormat = Json.format[GetOfferCardsContentStatusResponse]
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
      Writes { getOfferCardsContentStatusResponse =>
        val jsObj = realJsonFormat.writes(getOfferCardsContentStatusResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

