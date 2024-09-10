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
import org.openapitools.server.model.ApiNotFoundErrorResponse
import org.openapitools.server.model.ApiServerErrorResponse
import org.openapitools.server.model.ApiUnauthorizedErrorResponse
import org.openapitools.server.model.GetRegionWithChildrenResponse
import org.openapitools.server.model.GetRegionsResponse


class RegionsApi(
    regionsService: RegionsApiService,
    regionsMarshaller: RegionsApiMarshaller
) {

  
  import regionsMarshaller._

  lazy val route: Route =
    path("regions" / LongNumber / "children") { (regionId) => 
      get { 
        parameters("page".as[Int].?(1), "pageSize".as[Int].?) { (page, pageSize) => 
            regionsService.searchRegionChildren(regionId = regionId, page = page, pageSize = pageSize)
        }
      }
    } ~
    path("regions" / LongNumber) { (regionId) => 
      get {  
            regionsService.searchRegionsById(regionId = regionId)
      }
    } ~
    path("regions") { 
      get { 
        parameters("name".as[String], "page_token".as[String].?, "limit".as[Int].?) { (name, pageToken, limit) => 
            regionsService.searchRegionsByName(name = name, pageToken = pageToken, limit = limit)
        }
      }
    }
}


trait RegionsApiService {

  def searchRegionChildren200(responseGetRegionWithChildrenResponse: GetRegionWithChildrenResponse)(implicit toEntityMarshallerGetRegionWithChildrenResponse: ToEntityMarshaller[GetRegionWithChildrenResponse]): Route =
    complete((200, responseGetRegionWithChildrenResponse))
  def searchRegionChildren400(responseApiClientDataErrorResponse: ApiClientDataErrorResponse)(implicit toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]): Route =
    complete((400, responseApiClientDataErrorResponse))
  def searchRegionChildren401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def searchRegionChildren403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def searchRegionChildren404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def searchRegionChildren420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def searchRegionChildren500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Регионы, являющиеся дочерними к указанному в запросе., DataType: GetRegionWithChildrenResponse
   * Code: 400, Message: Запрос содержит неправильные данные., DataType: ApiClientDataErrorResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def searchRegionChildren(regionId: Long, page: Int, pageSize: Option[Int])
      (implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerGetRegionWithChildrenResponse: ToEntityMarshaller[GetRegionWithChildrenResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def searchRegionsById200(responseGetRegionsResponse: GetRegionsResponse)(implicit toEntityMarshallerGetRegionsResponse: ToEntityMarshaller[GetRegionsResponse]): Route =
    complete((200, responseGetRegionsResponse))
  def searchRegionsById401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def searchRegionsById403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def searchRegionsById404(responseApiNotFoundErrorResponse: ApiNotFoundErrorResponse)(implicit toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]): Route =
    complete((404, responseApiNotFoundErrorResponse))
  def searchRegionsById420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def searchRegionsById500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Найденный регион., DataType: GetRegionsResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 404, Message: Запрашиваемый ресурс не найден., DataType: ApiNotFoundErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def searchRegionsById(regionId: Long)
      (implicit toEntityMarshallerGetRegionsResponse: ToEntityMarshaller[GetRegionsResponse], toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

  def searchRegionsByName200(responseGetRegionsResponse: GetRegionsResponse)(implicit toEntityMarshallerGetRegionsResponse: ToEntityMarshaller[GetRegionsResponse]): Route =
    complete((200, responseGetRegionsResponse))
  def searchRegionsByName401(responseApiUnauthorizedErrorResponse: ApiUnauthorizedErrorResponse)(implicit toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route =
    complete((401, responseApiUnauthorizedErrorResponse))
  def searchRegionsByName403(responseApiForbiddenErrorResponse: ApiForbiddenErrorResponse)(implicit toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]): Route =
    complete((403, responseApiForbiddenErrorResponse))
  def searchRegionsByName420(responseApiLimitErrorResponse: ApiLimitErrorResponse)(implicit toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]): Route =
    complete((420, responseApiLimitErrorResponse))
  def searchRegionsByName500(responseApiServerErrorResponse: ApiServerErrorResponse)(implicit toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]): Route =
    complete((500, responseApiServerErrorResponse))
  /**
   * Code: 200, Message: Список найденных регионов., DataType: GetRegionsResponse
   * Code: 401, Message: В запросе не указаны данные для авторизации., DataType: ApiUnauthorizedErrorResponse
   * Code: 403, Message: Данные для авторизации неверны или доступ к ресурсу запрещен., DataType: ApiForbiddenErrorResponse
   * Code: 420, Message: Превышено ограничение на доступ к ресурсу., DataType: ApiLimitErrorResponse
   * Code: 500, Message: Внутренняя ошибка сервера., DataType: ApiServerErrorResponse
   */
  def searchRegionsByName(name: String, pageToken: Option[String], limit: Option[Int])
      (implicit toEntityMarshallerGetRegionsResponse: ToEntityMarshaller[GetRegionsResponse], toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse], toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse], toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse], toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]): Route

}

trait RegionsApiMarshaller {


  implicit def toEntityMarshallerGetRegionsResponse: ToEntityMarshaller[GetRegionsResponse]

  implicit def toEntityMarshallerApiNotFoundErrorResponse: ToEntityMarshaller[ApiNotFoundErrorResponse]

  implicit def toEntityMarshallerApiLimitErrorResponse: ToEntityMarshaller[ApiLimitErrorResponse]

  implicit def toEntityMarshallerApiForbiddenErrorResponse: ToEntityMarshaller[ApiForbiddenErrorResponse]

  implicit def toEntityMarshallerGetRegionWithChildrenResponse: ToEntityMarshaller[GetRegionWithChildrenResponse]

  implicit def toEntityMarshallerApiServerErrorResponse: ToEntityMarshaller[ApiServerErrorResponse]

  implicit def toEntityMarshallerApiClientDataErrorResponse: ToEntityMarshaller[ApiClientDataErrorResponse]

  implicit def toEntityMarshallerApiUnauthorizedErrorResponse: ToEntityMarshaller[ApiUnauthorizedErrorResponse]

}

