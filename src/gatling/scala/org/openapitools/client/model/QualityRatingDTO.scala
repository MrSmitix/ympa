
package org.openapitools.client.model

import java.time.LocalDate

case class QualityRatingDTO (
    /* Значение индекса качества. */
    _rating: Long,
    /* Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`.  */
    _calculationDate: LocalDate,
    /* Составляющие индекса качества. */
    _components: List[QualityRatingComponentDTO]
)
object QualityRatingDTO {
    def toStringBody(var_rating: Object, var_calculationDate: Object, var_components: Object) =
        s"""
        | {
        | "rating":$var_rating,"calculationDate":$var_calculationDate,"components":$var_components
        | }
        """.stripMargin
}
