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

import _root_.ympa_scala_cask_server.model.AddHiddenOffersRequest
import _root_.ympa_scala_cask_server.model.ApiClientDataErrorResponse
import _root_.ympa_scala_cask_server.model.ApiForbiddenErrorResponse
import _root_.ympa_scala_cask_server.model.ApiLimitErrorResponse
import _root_.ympa_scala_cask_server.model.ApiLockedErrorResponse
import _root_.ympa_scala_cask_server.model.ApiNotFoundErrorResponse
import _root_.ympa_scala_cask_server.model.ApiServerErrorResponse
import _root_.ympa_scala_cask_server.model.ApiUnauthorizedErrorResponse
import _root_.ympa_scala_cask_server.model.DeleteHiddenOffersRequest
import _root_.ympa_scala_cask_server.model.EmptyApiResponse
import _root_.ympa_scala_cask_server.model.GetHiddenOffersResponse

import _root_.ympa_scala_cask_server.model.*

object HiddenOffersService {
  def apply() : HiddenOffersService = new HiddenOffersService {
        override def addHiddenOffers(campaignId : Long, addHiddenOffersRequest : AddHiddenOffersRequest) : EmptyApiResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiLimitErrorResponse | ApiLockedErrorResponse | ApiServerErrorResponse = ???
        override def deleteHiddenOffers(campaignId : Long, deleteHiddenOffersRequest : DeleteHiddenOffersRequest) : EmptyApiResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiLockedErrorResponse | ApiServerErrorResponse = ???
        override def getHiddenOffers(campaignId : Long, offerId : Seq[String], pageToken : Option[String], limit : Option[Int], offset : Option[Int], page : Option[Int], pageSize : Option[Int]) : GetHiddenOffersResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse = ???
  }
}

/**
 * The HiddenOffers business-logic
 */
trait HiddenOffersService {
  /** Скрытие товаров и настройки скрытия
   * 
   * @return EmptyApiResponse
   */
  def addHiddenOffers(campaignId : Long, addHiddenOffersRequest : AddHiddenOffersRequest) : EmptyApiResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiLimitErrorResponse | ApiLockedErrorResponse | ApiServerErrorResponse
  /** Возобновление показа товаров
   * 
   * @return EmptyApiResponse
   */
  def deleteHiddenOffers(campaignId : Long, deleteHiddenOffersRequest : DeleteHiddenOffersRequest) : EmptyApiResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiLockedErrorResponse | ApiServerErrorResponse
  /** Информация о скрытых вами товарах
   * 
   * @return GetHiddenOffersResponse
   */
  def getHiddenOffers(campaignId : Long, offerId : Seq[String], pageToken : Option[String], limit : Option[Int], offset : Option[Int], page : Option[Int], pageSize : Option[Int]) : GetHiddenOffersResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse
}
