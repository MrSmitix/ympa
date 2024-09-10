package model

import play.api.libs.json._

/**
  * Результат выполнения запроса.
  * @param attemptsLeft Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class EacVerificationResultDTO(
  verificationResult: Option[EacVerificationStatusType],
  attemptsLeft: Option[Int]
)

object EacVerificationResultDTO {
  implicit lazy val eacVerificationResultDTOJsonFormat: Format[EacVerificationResultDTO] = Json.format[EacVerificationResultDTO]
}

