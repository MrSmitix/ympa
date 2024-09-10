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
import org.openapitools.client.model.ChatStatusType._
import org.openapitools.client.model.ChatType._

  /**
   * Информация о чатах.
   */
case class GetChatInfoDTO(
  /* Идентификатор чата. */
  chatId: Long,
  /* Идентификатор заказа. */
  orderId: Long,
  `type`: ChatType,
  status: ChatStatusType,
  /* Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  */
  createdAt: OffsetDateTime,
  /* Дата и время последнего сообщения в чате. */
  updatedAt: OffsetDateTime
)

object GetChatInfoDTOEnums {

}
