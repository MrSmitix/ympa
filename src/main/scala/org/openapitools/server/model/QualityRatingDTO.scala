package org.openapitools.server.model

import java.time.LocalDate

/**
 * Информация об индексе качества.
 *
 * @param rating Значение индекса качества. for example: ''null''
 * @param calculationDate Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`.  for example: ''null''
 * @param components Составляющие индекса качества. for example: ''null''
*/
final case class QualityRatingDTO (
  rating: Long,
  calculationDate: LocalDate,
  components: Seq[QualityRatingComponentDTO]
)

