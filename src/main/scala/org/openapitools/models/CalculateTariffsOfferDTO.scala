package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal

/**
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 * @param categoryId Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
 * @param price Цена на товар в рублях.
 * @param length Длина товара в сантиметрах.
 * @param width Ширина товара в сантиметрах.
 * @param height Высота товара в сантиметрах.
 * @param weight Вес товара в килограммах.
 * @param quantity Квант продажи — количество единиц товара в одном товарном предложении.
 */
case class CalculateTariffsOfferDTO(categoryId: Long,
                price: BigDecimal,
                length: BigDecimal,
                width: BigDecimal,
                height: BigDecimal,
                weight: BigDecimal,
                quantity: Option[Int]
                )

object CalculateTariffsOfferDTO {
    /**
     * Creates the codec for converting CalculateTariffsOfferDTO from and to JSON.
     */
    implicit val decoder: Decoder[CalculateTariffsOfferDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CalculateTariffsOfferDTO] = deriveEncoder
}
