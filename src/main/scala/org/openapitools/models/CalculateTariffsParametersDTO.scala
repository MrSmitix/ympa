package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.PaymentFrequencyType
import org.openapitools.models.SellingProgramType

/**
 * Параметры для расчета стоимости услуг.
 * @param campaignId Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке. 
 * @param sellingProgram 
 * @param frequency 
 */
case class CalculateTariffsParametersDTO(campaignId: Option[Long],
                sellingProgram: Option[SellingProgramType],
                frequency: Option[PaymentFrequencyType]
                )

object CalculateTariffsParametersDTO {
    /**
     * Creates the codec for converting CalculateTariffsParametersDTO from and to JSON.
     */
    implicit val decoder: Decoder[CalculateTariffsParametersDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CalculateTariffsParametersDTO] = deriveEncoder
}
