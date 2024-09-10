package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
 * @param id Идентификатор параметра.
 * @param title Название параметра. Например, `Скорость обработки заказа`.
 * @param description Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.
 * @param value Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). 
 */
case class FeedbackFactorDTO(id: Option[Long],
                title: Option[String],
                description: Option[String],
                value: Option[Int]
                )

object FeedbackFactorDTO {
    /**
     * Creates the codec for converting FeedbackFactorDTO from and to JSON.
     */
    implicit val decoder: Decoder[FeedbackFactorDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FeedbackFactorDTO] = deriveEncoder
}
