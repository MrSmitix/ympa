//> using scala "3.3.1"
//> using lib "com.lihaoyi::cask:0.8.3"
//> using lib "com.lihaoyi::scalatags:0.12.0"
/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI spec version: LATEST
 *
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 *
 * https://openapi-generator.tech
 */


// generated from apiService.mustache
package ympa_scala_cask_server.api

import _root_.ympa_scala_cask_server.model.ApiClientDataErrorResponse
import _root_.ympa_scala_cask_server.model.ApiForbiddenErrorResponse
import _root_.ympa_scala_cask_server.model.ApiLimitErrorResponse
import _root_.ympa_scala_cask_server.model.ApiNotFoundErrorResponse
import _root_.ympa_scala_cask_server.model.ApiServerErrorResponse
import _root_.ympa_scala_cask_server.model.ApiUnauthorizedErrorResponse
import _root_.ympa_scala_cask_server.model.GetBusinessBuyerInfoResponse
import _root_.ympa_scala_cask_server.model.GetBusinessDocumentsInfoResponse

import _root_.ympa_scala_cask_server.model.*

object OrderBusinessInformationService {
  def apply() : OrderBusinessInformationService = new OrderBusinessInformationService {
        override def getOrderBusinessBuyerInfo(campaignId : Long, orderId : Long) : GetBusinessBuyerInfoResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse = ???
        override def getOrderBusinessDocumentsInfo(campaignId : Long, orderId : Long) : GetBusinessDocumentsInfoResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse = ???
  }
}

/**
 * The OrderBusinessInformation business-logic
 */
trait OrderBusinessInformationService {
  /** Информация о покупателе — юридическом лице
   * 
   * @return GetBusinessBuyerInfoResponse
   */
  def getOrderBusinessBuyerInfo(campaignId : Long, orderId : Long) : GetBusinessBuyerInfoResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse
  /** Информация о документах
   * 
   * @return GetBusinessDocumentsInfoResponse
   */
  def getOrderBusinessDocumentsInfo(campaignId : Long, orderId : Long) : GetBusinessDocumentsInfoResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse
}
