package model

import play.api.libs.json._

/**
  * Список предложений с пагинатором.
  * @param offers Список предложений магазина.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetOffersResponse(
  offers: List[OfferDTO],
  pager: Option[FlippingPagerDTO]
  additionalProperties: 
)

object GetOffersResponse {
  implicit lazy val getOffersResponseJsonFormat: Format[GetOffersResponse] = {
    val realJsonFormat = Json.format[GetOffersResponse]
    val declaredPropNames = Set("offers", "pager")
    
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
      Writes { getOffersResponse =>
        val jsObj = realJsonFormat.writes(getOffersResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

