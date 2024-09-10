package model

import play.api.libs.json._

/**
  * Результат удаления товаров.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class DeleteCampaignOffersResponse(
  status: Option[ApiResponseStatusType],
  result: Option[DeleteCampaignOffersDTO]
  additionalProperties: 
)

object DeleteCampaignOffersResponse {
  implicit lazy val deleteCampaignOffersResponseJsonFormat: Format[DeleteCampaignOffersResponse] = {
    val realJsonFormat = Json.format[DeleteCampaignOffersResponse]
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
      Writes { deleteCampaignOffersResponse =>
        val jsObj = realJsonFormat.writes(deleteCampaignOffersResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

