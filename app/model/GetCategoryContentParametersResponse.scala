package model

import play.api.libs.json._

/**
  * Ответ со списком характеристик для категории и их допустимыми значениями.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetCategoryContentParametersResponse(
  status: Option[ApiResponseStatusType],
  result: Option[CategoryContentParametersDTO]
  additionalProperties: 
)

object GetCategoryContentParametersResponse {
  implicit lazy val getCategoryContentParametersResponseJsonFormat: Format[GetCategoryContentParametersResponse] = {
    val realJsonFormat = Json.format[GetCategoryContentParametersResponse]
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
      Writes { getCategoryContentParametersResponse =>
        val jsObj = realJsonFormat.writes(getCategoryContentParametersResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

