package model

import play.api.libs.json._

/**
  * Ответ с информацией для печати ярлыков.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetOrderLabelsDataResponse(
  status: Option[ApiResponseStatusType],
  result: Option[OrderLabelDTO]
  additionalProperties: 
)

object GetOrderLabelsDataResponse {
  implicit lazy val getOrderLabelsDataResponseJsonFormat: Format[GetOrderLabelsDataResponse] = {
    val realJsonFormat = Json.format[GetOrderLabelsDataResponse]
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
      Writes { getOrderLabelsDataResponse =>
        val jsObj = realJsonFormat.writes(getOrderLabelsDataResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

