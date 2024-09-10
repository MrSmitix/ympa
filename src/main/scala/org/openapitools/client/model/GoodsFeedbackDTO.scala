/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import java.time.OffsetDateTime
import org.openapitools.client.core.ApiModel

case class GoodsFeedbackDTO (
  /* Идентификатор отзыва.  */
  feedbackId: Long,
  /* Дата и время создания отзыва. */
  createdAt: OffsetDateTime,
  /* Нужен ли ответ на отзыв. */
  needReaction: Boolean,
  identifiers: GoodsFeedbackIdentifiersDTO,
  /* Имя автора отзыва. */
  author: Option[String] = None,
  description: Option[GoodsFeedbackDescriptionDTO] = None,
  media: Option[GoodsFeedbackMediaDTO] = None,
  statistics: GoodsFeedbackStatisticsDTO
) extends ApiModel

