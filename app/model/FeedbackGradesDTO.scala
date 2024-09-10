package model

import play.api.libs.json._

/**
  * Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
  * @param average Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).
  * @param agreeCount Количество пользователей, считающих отзыв полезным.
  * @param rejectCount Количество пользователей, считающих отзыв бесполезным.
  * @param factors Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedbackGradesDTO(
  average: Option[BigDecimal],
  agreeCount: Option[Long],
  rejectCount: Option[Long],
  factors: List[FeedbackFactorDTO]
)

object FeedbackGradesDTO {
  implicit lazy val feedbackGradesDTOJsonFormat: Format[FeedbackGradesDTO] = Json.format[FeedbackGradesDTO]
}

