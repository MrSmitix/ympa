package model

import play.api.libs.json._

/**
  * Информация о страницах результатов.
  * @param nextPageToken Идентификатор следующей страницы результатов.
  * @param prevPageToken Идентификатор предыдущей страницы результатов.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ScrollingPagerDTO(
  nextPageToken: Option[String],
  prevPageToken: Option[String]
  additionalProperties: 
)

object ScrollingPagerDTO {
  implicit lazy val scrollingPagerDTOJsonFormat: Format[ScrollingPagerDTO] = {
    val realJsonFormat = Json.format[ScrollingPagerDTO]
    val declaredPropNames = Set("nextPageToken", "prevPageToken")
    
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
      Writes { scrollingPagerDTO =>
        val jsObj = realJsonFormat.writes(scrollingPagerDTO)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

