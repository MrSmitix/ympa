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

import org.openapitools.client.model.FeedbackCommentAuthorType._

  /**
   * Информация об авторе комментария.
   */
case class FeedbackCommentAuthorDTO(
  `type`: Option[FeedbackCommentAuthorType] = None,
  /* Имя автора отзыва или название магазина. */
  name: Option[String] = None
)

object FeedbackCommentAuthorDTOEnums {

}
