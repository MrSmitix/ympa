package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.ApiClientDataErrorResponse
import org.openapitools.server.model.ApiForbiddenErrorResponse
import org.openapitools.server.model.ApiLimitErrorResponse
import org.openapitools.server.model.ApiLockedErrorResponse
import org.openapitools.server.model.ApiNotFoundErrorResponse
import org.openapitools.server.model.ApiServerErrorResponse
import org.openapitools.server.model.ApiUnauthorizedErrorResponse
import org.openapitools.server.model.EmptyApiResponse
import org.openapitools.server.model.GetOfferMappingEntriesResponse
import org.openapitools.server.model.GetSuggestedOfferMappingEntriesRequest
import org.openapitools.server.model.GetSuggestedOfferMappingEntriesResponse
import org.openapitools.server.model.OfferAvailabilityStatusType
import org.openapitools.server.model.OfferMappingKindType
import org.openapitools.server.model.OfferProcessingStatusType
import org.openapitools.server.model.UpdateOfferMappingEntryRequest


class OfferMappingsApi(
    offerMappingsService: OfferMappingsApiService,
    offerMappingsMarshaller: OfferMappingsApiMarshaller
) {

  
  import offerMappingsMarshaller._

  lazy val route: Route =
    path("campaigns" / LongNumber / "offer-mapping-entries") { (campaignId) => 
      get { 
        parameters("offer_id".as[String].?, "shop_sku".as[String].?, "mapping_kind".as[String].?, "status".as[String].?, "availability".as[String].?, "category_id".as[String].?, "vendor".as[String].?, "page_token".as[String].?, "limit".as[Int].?) { (offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit) => 
            offerMappingsService.getOfferMappingEntries(campaignId = campaignId, offerId = offerId, shopSku = shopSku, mappingKind = mappingKind, status = status, availability = availability, categoryId = categoryId, vendor = vendor, pageToken = pageToken, limit = limit)
        }
      }
    } ~
    path("campaigns" / LongNumber / "offer-mapping-entries" / "suggestions") { (campaignId) => 
      post {  
            entity(as[GetSuggestedOfferMappingEntriesRequest]){ getSuggestedOfferMappingEntriesRequest =>
              offerMappingsService.getSuggestedOfferMappingEntries(campaignId = campaignId, getSuggestedOfferMappingEntriesRequest = getSuggestedOfferMappingEntriesRequest)
            }
      }
    } ~
    path("campaigns" / LongNumber / "offer-mapping-entries" / "updates") { (campaignId) => 
      post {  
            entity(as[UpdateOfferMappingEntryRequest]){ updateOfferMappingEntryRequest =>
              offerMappingsService.updateOfferMappingEntries(campaignId = campaignId, updateOfferMappingEntryRequest = updateOfferMappingEntryRequest)
            }
      }
    }
}


trait OfferMappingsApiService {

  def getOfferMappingEntries200(responseGetOfferMappingEntriesResponse: GetOfferMappingEntriesResponse)(implicit toEntityMarshallerGetOfferMappingEntriesResponse: ToEntityMarshaller[GetOfferMappingEntriesResponse]): Route =
    complete((200, responseGetOfferMappingEntriesResponse))
  def getOfferMappingEntries400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getOfferMappingEntries401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getOfferMappingEntries403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getOfferMappingEntries404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getOfferMappingEntries420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getOfferMappingEntries500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Информация о товарах в каталоге., DataType: GetOfferMappingEntriesResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getOfferMappingEntries(campaignId: Long, offerId: Option[String], shopSku: Option[String], mappingKind: Option[String], status: Option[String], availability: Option[String], categoryId: Option[String], vendor: Option[String], pageToken: Option[String], limit: Option[Int])
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerGetOfferMappingEntriesResponse: ToEntityMarshaller[GetOfferMappingEntriesResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getSuggestedOfferMappingEntries200(responseGetSuggestedOfferMappingEntriesResponse: GetSuggestedOfferMappingEntriesResponse)(implicit toEntityMarshallerGetSuggestedOfferMappingEntriesResponse: ToEntityMarshaller[GetSuggestedOfferMappingEntriesResponse]): Route =
    complete((200, responseGetSuggestedOfferMappingEntriesResponse))
  def getSuggestedOfferMappingEntries400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getSuggestedOfferMappingEntries401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getSuggestedOfferMappingEntries403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getSuggestedOfferMappingEntries404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getSuggestedOfferMappingEntries420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getSuggestedOfferMappingEntries500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Информация о товарах в каталоге., DataType: GetSuggestedOfferMappingEntriesResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getSuggestedOfferMappingEntries(campaignId: Long, getSuggestedOfferMappingEntriesRequest: GetSuggestedOfferMappingEntriesRequest)
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerGetSuggestedOfferMappingEntriesResponse: ToEntityMarshaller[GetSuggestedOfferMappingEntriesResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def updateOfferMappingEntries200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def updateOfferMappingEntries400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def updateOfferMappingEntries401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def updateOfferMappingEntries403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def updateOfferMappingEntries404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def updateOfferMappingEntries420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def updateOfferMappingEntries423(responseApiLockedErrorResponse: ApiLockedErrorResponse)(implicit toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]): Route =
    complete((423, responseApiLockedErrorResponse))
  def updateOfferMappingEntries500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Статус выполнения операции., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 423, Message: К ресурсу нельзя применить указанный метод., DataType: ApiLockedErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def updateOfferMappingEntries(campaignId: Long, updateOfferMappingEntryRequest: UpdateOfferMappingEntryRequest)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

}

trait OfferMappingsApiMarshaller {
  implicit def fromEntityUnmarshallerUpdateOfferMappingEntryRequest: FromEntityUnmarshaller[UpdateOfferMappingEntryRequest]

  implicit def fromEntityUnmarshallerGetSuggestedOfferMappingEntriesRequest: FromEntityUnmarshaller[GetSuggestedOfferMappingEntriesRequest]



  implicit def toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]

  implicit def toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]

  implicit def toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]

  implicit def toEntityMarshallerGetOfferMappingEntriesResponse: ToEntityMarshaller[GetOfferMappingEntriesResponse]

  implicit def toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]

  implicit def toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]

  implicit def toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]

  implicit def toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]

  implicit def toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]

  implicit def toEntityMarshallerGetSuggestedOfferMappingEntriesResponse: ToEntityMarshaller[GetSuggestedOfferMappingEntriesResponse]

}

