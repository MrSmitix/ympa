package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Модель для пагинации.
 * @param total Сколько всего найдено элементов.
 * @param from Начальный номер найденного элемента на странице.
 * @param to Конечный номер найденного элемента на странице.
 * @param currentPage Текущая страница.
 * @param pagesCount Общее количество страниц.
 * @param pageSize Размер страницы.
 */
case class FlippingPagerDTO(total: Option[Int],
                from: Option[Int],
                to: Option[Int],
                currentPage: Option[Int],
                pagesCount: Option[Int],
                pageSize: Option[Int]
                )

object FlippingPagerDTO {
    /**
     * Creates the codec for converting FlippingPagerDTO from and to JSON.
     */
    implicit val decoder: Decoder[FlippingPagerDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[FlippingPagerDTO] = deriveEncoder
}
