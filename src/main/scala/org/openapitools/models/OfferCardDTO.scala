package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.GetMappingDTO
import org.openapitools.models.OfferCardRecommendationDTO
import org.openapitools.models.OfferCardStatusType
import org.openapitools.models.OfferErrorDTO
import org.openapitools.models.ParameterValueDTO
import scala.collection.immutable.Seq

/**
 * Информация о состоянии карточки товара.  Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param mapping 
 * @param parameterValues Список характеристик с их значениями. 
 * @param cardStatus 
 * @param contentRating Процент заполненности карточки.
 * @param recommendations Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
 * @param errors Ошибки в контенте, препятствующие размещению товара на витрине.
 * @param warnings Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
 */
case class OfferCardDTO(offerId: String,
                mapping: Option[GetMappingDTO],
                parameterValues: Option[Seq[ParameterValueDTO]],
                cardStatus: Option[OfferCardStatusType],
                contentRating: Option[Int],
                recommendations: Option[Seq[OfferCardRecommendationDTO]],
                errors: Option[Seq[OfferErrorDTO]],
                warnings: Option[Seq[OfferErrorDTO]]
                )

object OfferCardDTO {
    /**
     * Creates the codec for converting OfferCardDTO from and to JSON.
     */
    implicit val decoder: Decoder[OfferCardDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferCardDTO] = deriveEncoder
}
