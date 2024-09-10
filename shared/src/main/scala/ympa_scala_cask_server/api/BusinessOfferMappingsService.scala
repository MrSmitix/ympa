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

import _root_.ympa_scala_cask_server.model.AddOffersToArchiveRequest
import _root_.ympa_scala_cask_server.model.AddOffersToArchiveResponse
import _root_.ympa_scala_cask_server.model.ApiClientDataErrorResponse
import _root_.ympa_scala_cask_server.model.ApiForbiddenErrorResponse
import _root_.ympa_scala_cask_server.model.ApiLimitErrorResponse
import _root_.ympa_scala_cask_server.model.ApiLockedErrorResponse
import _root_.ympa_scala_cask_server.model.ApiNotFoundErrorResponse
import _root_.ympa_scala_cask_server.model.ApiServerErrorResponse
import _root_.ympa_scala_cask_server.model.ApiUnauthorizedErrorResponse
import _root_.ympa_scala_cask_server.model.DeleteOffersFromArchiveRequest
import _root_.ympa_scala_cask_server.model.DeleteOffersFromArchiveResponse
import _root_.ympa_scala_cask_server.model.DeleteOffersRequest
import _root_.ympa_scala_cask_server.model.DeleteOffersResponse
import _root_.ympa_scala_cask_server.model.GetOfferMappingsRequest
import _root_.ympa_scala_cask_server.model.GetOfferMappingsResponse
import _root_.ympa_scala_cask_server.model.GetSuggestedOfferMappingsRequest
import _root_.ympa_scala_cask_server.model.GetSuggestedOfferMappingsResponse
import _root_.ympa_scala_cask_server.model.UpdateOfferMappingsRequest
import _root_.ympa_scala_cask_server.model.UpdateOfferMappingsResponse

import _root_.ympa_scala_cask_server.model.*

object BusinessOfferMappingsService {
  def apply() : BusinessOfferMappingsService = new BusinessOfferMappingsService {
        override def addOffersToArchive(businessId : Long, addOffersToArchiveRequest : AddOffersToArchiveRequest) : AddOffersToArchiveResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiLockedErrorResponse | ApiServerErrorResponse = ???
        override def deleteOffers(businessId : Long, deleteOffersRequest : DeleteOffersRequest) : DeleteOffersResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiLockedErrorResponse | ApiServerErrorResponse = ???
        override def deleteOffersFromArchive(businessId : Long, deleteOffersFromArchiveRequest : DeleteOffersFromArchiveRequest) : DeleteOffersFromArchiveResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiLockedErrorResponse | ApiServerErrorResponse = ???
        override def getOfferMappings(businessId : Long, pageToken : Option[String], limit : Option[Int], getOfferMappingsRequest : Option[GetOfferMappingsRequest]) : GetOfferMappingsResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse = ???
        override def getSuggestedOfferMappings(businessId : Long, getSuggestedOfferMappingsRequest : Option[GetSuggestedOfferMappingsRequest]) : GetSuggestedOfferMappingsResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse = ???
        override def updateOfferMappings(businessId : Long, updateOfferMappingsRequest : UpdateOfferMappingsRequest) : UpdateOfferMappingsResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiLockedErrorResponse | ApiServerErrorResponse = ???
  }
}

/**
 * The BusinessOfferMappings business-logic
 */
trait BusinessOfferMappingsService {
  /** Добавление товаров в архив
   * 
   * @return AddOffersToArchiveResponse
   */
  def addOffersToArchive(businessId : Long, addOffersToArchiveRequest : AddOffersToArchiveRequest) : AddOffersToArchiveResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiLockedErrorResponse | ApiServerErrorResponse
  /** Удаление товаров из каталога
   * 
   * @return DeleteOffersResponse
   */
  def deleteOffers(businessId : Long, deleteOffersRequest : DeleteOffersRequest) : DeleteOffersResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiLockedErrorResponse | ApiServerErrorResponse
  /** Удаление товаров из архива
   * 
   * @return DeleteOffersFromArchiveResponse
   */
  def deleteOffersFromArchive(businessId : Long, deleteOffersFromArchiveRequest : DeleteOffersFromArchiveRequest) : DeleteOffersFromArchiveResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiLockedErrorResponse | ApiServerErrorResponse
  /** Информация о товарах в каталоге
   * 
   * @return GetOfferMappingsResponse
   */
  def getOfferMappings(businessId : Long, pageToken : Option[String], limit : Option[Int], getOfferMappingsRequest : Option[GetOfferMappingsRequest]) : GetOfferMappingsResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse
  /** Просмотр карточек на Маркете, которые подходят вашим товарам
   * 
   * @return GetSuggestedOfferMappingsResponse
   */
  def getSuggestedOfferMappings(businessId : Long, getSuggestedOfferMappingsRequest : Option[GetSuggestedOfferMappingsRequest]) : GetSuggestedOfferMappingsResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiServerErrorResponse
  /** Добавление товаров в каталог и изменение информации о них
   * 
   * @return UpdateOfferMappingsResponse
   */
  def updateOfferMappings(businessId : Long, updateOfferMappingsRequest : UpdateOfferMappingsRequest) : UpdateOfferMappingsResponse | ApiClientDataErrorResponse | ApiUnauthorizedErrorResponse | ApiForbiddenErrorResponse | ApiNotFoundErrorResponse | ApiLimitErrorResponse | ApiLockedErrorResponse | ApiServerErrorResponse
}
