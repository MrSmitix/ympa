package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal
import org.openapitools.models.FeedbackFactorDTO
import scala.collection.immutable.Seq

/**
 * Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 * @param average Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).
 * @param agreeCount Количество пользователей, считающих отзыв полезным.
 * @param rejectCount Количество пользователей, считающих отзыв бесполезным.
 * @param factors Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
 */
case class FeedbackGradesDTO(average: Option[BigDecimal],
                agreeCount: Option[Long],
                rejectCount: Option[Long],
                factors: Seq[FeedbackFactorDTO]
                )

object FeedbackGradesDTO {
    /**
     * Creates the codec for converting FeedbackGradesDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedbackGradesDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedbackGradesDTO] = deriveEncoder
}
