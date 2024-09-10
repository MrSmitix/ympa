package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Информация об индексе качества.
  * @param rating Значение индекса качества.
  * @param calculationDate Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
  * @param components Составляющие индекса качества.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class QualityRatingDTO(
  rating: Long,
  calculationDate: LocalDate,
  components: List[QualityRatingComponentDTO]
)

object QualityRatingDTO {
  implicit lazy val qualityRatingDTOJsonFormat: Format[QualityRatingDTO] = Json.format[QualityRatingDTO]
}

