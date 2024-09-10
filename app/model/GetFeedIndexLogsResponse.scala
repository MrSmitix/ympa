package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GetFeedIndexLogsResponse.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetFeedIndexLogsResponse(
  status: Option[ApiResponseStatusType],
  result: Option[FeedIndexLogsResultDTO]
  additionalProperties: 
)

object GetFeedIndexLogsResponse {
  implicit lazy val getFeedIndexLogsResponseJsonFormat: Format[GetFeedIndexLogsResponse] = {
    val realJsonFormat = Json.format[GetFeedIndexLogsResponse]
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
      Writes { getFeedIndexLogsResponse =>
        val jsObj = realJsonFormat.writes(getFeedIndexLogsResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

