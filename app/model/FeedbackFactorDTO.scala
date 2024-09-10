package model

import play.api.libs.json._

/**
  * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
  * @param id Идентификатор параметра.
  * @param title Название параметра. Например, `Скорость обработки заказа`.
  * @param description Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.
  * @param value Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedbackFactorDTO(
  id: Option[Long],
  title: Option[String],
  description: Option[String],
  value: Option[Int]
)

object FeedbackFactorDTO {
  implicit lazy val feedbackFactorDTOJsonFormat: Format[FeedbackFactorDTO] = Json.format[FeedbackFactorDTO]
}

