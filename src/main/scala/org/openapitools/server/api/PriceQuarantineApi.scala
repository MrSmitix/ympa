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
import org.openapitools.server.model.ConfirmPricesRequest
import org.openapitools.server.model.EmptyApiResponse
import org.openapitools.server.model.GetQuarantineOffersRequest
import org.openapitools.server.model.GetQuarantineOffersResponse


class PriceQuarantineApi(
    priceQuarantineService: PriceQuarantineApiService,
    priceQuarantineMarshaller: PriceQuarantineApiMarshaller
) {

  
  import priceQuarantineMarshaller._

  lazy val route: Route =
    path("businesses" / LongNumber / "price-quarantine" / "confirm") { (businessId) => 
      post {  
            entity(as[ConfirmPricesRequest]){ confirmPricesRequest =>
              priceQuarantineService.confirmBusinessPrices(businessId = businessId, confirmPricesRequest = confirmPricesRequest)
            }
      }
    } ~
    path("campaigns" / LongNumber / "price-quarantine" / "confirm") { (campaignId) => 
      post {  
            entity(as[ConfirmPricesRequest]){ confirmPricesRequest =>
              priceQuarantineService.confirmCampaignPrices(campaignId = campaignId, confirmPricesRequest = confirmPricesRequest)
            }
      }
    } ~
    path("businesses" / LongNumber / "price-quarantine") { (businessId) => 
      post { 
        parameters("page_token".as[String].?, "limit".as[Int].?) { (pageToken, limit) => 
            entity(as[GetQuarantineOffersRequest]){ getQuarantineOffersRequest =>
              priceQuarantineService.getBusinessQuarantineOffers(businessId = businessId, getQuarantineOffersRequest = getQuarantineOffersRequest, pageToken = pageToken, limit = limit)
            }
        }
      }
    } ~
    path("campaigns" / LongNumber / "price-quarantine") { (campaignId) => 
      post { 
        parameters("page_token".as[String].?, "limit".as[Int].?) { (pageToken, limit) => 
            entity(as[GetQuarantineOffersRequest]){ getQuarantineOffersRequest =>
              priceQuarantineService.getCampaignQuarantineOffers(campaignId = campaignId, getQuarantineOffersRequest = getQuarantineOffersRequest, pageToken = pageToken, limit = limit)
            }
        }
      }
    }
}


trait PriceQuarantineApiService {

  def confirmBusinessPrices200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def confirmBusinessPrices400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def confirmBusinessPrices401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def confirmBusinessPrices403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def confirmBusinessPrices404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def confirmBusinessPrices420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def confirmBusinessPrices423(responseApiLockedErrorResponse: ApiLockedErrorResponse)(implicit toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]): Route =
    complete((423, responseApiLockedErrorResponse))
  def confirmBusinessPrices500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Ответ 200 обозначает, что цены подтверждены., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 423, Message: К ресурсу нельзя применить указанный метод., DataType: ApiLockedErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def confirmBusinessPrices(businessId: Long, confirmPricesRequest: ConfirmPricesRequest)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def confirmCampaignPrices200(responseEmptyApiResponse: EmptyApiResponse)(implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]): Route =
    complete((200, responseEmptyApiResponse))
  def confirmCampaignPrices400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def confirmCampaignPrices401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def confirmCampaignPrices403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def confirmCampaignPrices404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def confirmCampaignPrices420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def confirmCampaignPrices423(responseApiLockedErrorResponse: ApiLockedErrorResponse)(implicit toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]): Route =
    complete((423, responseApiLockedErrorResponse))
  def confirmCampaignPrices500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Ответ 200 обозначает, что цены подтверждены., DataType: EmptyApiResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 423, Message: К ресурсу нельзя применить указанный метод., DataType: ApiLockedErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def confirmCampaignPrices(campaignId: Long, confirmPricesRequest: ConfirmPricesRequest)
      (implicit toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getBusinessQuarantineOffers200(responseGetQuarantineOffersResponse: GetQuarantineOffersResponse)(implicit toEntityMarshallerGetQuarantineOffersResponse: ToEntityMarshaller[GetQuarantineOffersResponse]): Route =
    complete((200, responseGetQuarantineOffersResponse))
  def getBusinessQuarantineOffers400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getBusinessQuarantineOffers401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getBusinessQuarantineOffers403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getBusinessQuarantineOffers404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getBusinessQuarantineOffers420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getBusinessQuarantineOffers500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список товаров в карантине., DataType: GetQuarantineOffersResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getBusinessQuarantineOffers(businessId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int])
      (implicit toEntityMarshallerGetQuarantineOffersResponse: ToEntityMarshaller[GetQuarantineOffersResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def getCampaignQuarantineOffers200(responseGetQuarantineOffersResponse: GetQuarantineOffersResponse)(implicit toEntityMarshallerGetQuarantineOffersResponse: ToEntityMarshaller[GetQuarantineOffersResponse]): Route =
    complete((200, responseGetQuarantineOffersResponse))
  def getCampaignQuarantineOffers400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def getCampaignQuarantineOffers401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def getCampaignQuarantineOffers403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def getCampaignQuarantineOffers404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def getCampaignQuarantineOffers420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def getCampaignQuarantineOffers500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список товаров в карантине., DataType: GetQuarantineOffersResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def getCampaignQuarantineOffers(campaignId: Long, getQuarantineOffersRequest: GetQuarantineOffersRequest, pageToken: Option[String], limit: Option[Int])
      (implicit toEntityMarshallerGetQuarantineOffersResponse: ToEntityMarshaller[GetQuarantineOffersResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

}

trait PriceQuarantineApiMarshaller {
  implicit def fromEntityUnmarshallerConfirmPricesRequest: FromEntityUnmarshaller[ConfirmPricesRequest]

  implicit def fromEntityUnmarshallerGetQuarantineOffersRequest: FromEntityUnmarshaller[GetQuarantineOffersRequest]



  implicit def toEntityMarshallerGetQuarantineOffersResponse: ToEntityMarshaller[GetQuarantineOffersResponse]

  implicit def toEntityMarshallerEmptyApiResponse: ToEntityMarshaller[EmptyApiResponse]

  implicit def toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]

  implicit def toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]

  implicit def toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]

  implicit def toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]

  implicit def toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]

  implicit def toEntityMarshallerApiLockedErrorResponse: ToEntityMarshaller[ApiLockedErrorResponse]

  implicit def toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]

}

