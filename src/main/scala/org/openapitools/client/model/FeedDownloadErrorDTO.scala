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

import org.openapitools.client.model.FeedDownloadErrorType._

  /**
   * Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. 
   */
case class FeedDownloadErrorDTO(
  /* HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`.  */
  httpStatusCode: Option[Int] = None,
  `type`: Option[FeedDownloadErrorType] = None,
  /* Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`.  */
  description: Option[String] = None
)

object FeedDownloadErrorDTOEnums {

}