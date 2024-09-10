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

  /**
   * Комментарий к отзыву на магазин.
   */
case class FeedbackCommentDTO(
  /* Идентификатор ответа. */
  id: Option[Long] = None,
  /* Идентификатор родительского ответа. */
  parentId: Option[Long] = None,
  /* Текст ответа. */
  body: Option[String] = None,
  /* Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
  createdAt: Option[OffsetDateTime] = None,
  /* Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
  updatedAt: Option[OffsetDateTime] = None,
  author: Option[FeedbackCommentAuthorDTO] = None,
  /* Дочерние ответы. */
  children: Option[Seq[FeedbackCommentDTO]] = None
)
