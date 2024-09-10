package model

import play.api.libs.json._

/**
  * Список предложений.
  * @param offers Список предложений магазина.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetAllOffersResponse(
  offers: List[OfferDTO]
  additionalProperties: 
)

object GetAllOffersResponse {
  implicit lazy val getAllOffersResponseJsonFormat: Format[GetAllOffersResponse] = {
    val realJsonFormat = Json.format[GetAllOffersResponse]
    val declaredPropNames = Set("offers")
    
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
      Writes { getAllOffersResponse =>
        val jsObj = realJsonFormat.writes(getAllOffersResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

