package model

import play.api.libs.json._

/**
  * Данные, необходимые для генерации отчета. 
  * @param businessId Идентификатор бизнеса.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GenerateGoodsFeedbackRequest(
  businessId: Long
)

object GenerateGoodsFeedbackRequest {
  implicit lazy val generateGoodsFeedbackRequestJsonFormat: Format[GenerateGoodsFeedbackRequest] = Json.format[GenerateGoodsFeedbackRequest]
}

