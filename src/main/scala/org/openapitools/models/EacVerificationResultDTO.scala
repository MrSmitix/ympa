package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.EacVerificationStatusType

/**
 * Результат выполнения запроса.
 * @param verificationResult 
 * @param attemptsLeft Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. 
 */
case class EacVerificationResultDTO(verificationResult: Option[EacVerificationStatusType],
                attemptsLeft: Option[Int]
                )

object EacVerificationResultDTO {
    /**
     * Creates the codec for converting EacVerificationResultDTO from and to JSON.
     */
    implicit val decoder: Decoder[EacVerificationResultDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[EacVerificationResultDTO] = deriveEncoder
}
