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
package org.openapitools.client.api

import org.openapitools.client.model.ApiClientDataErrorResponse
import org.openapitools.client.model.ApiForbiddenErrorResponse
import org.openapitools.client.model.ApiLimitErrorResponse
import org.openapitools.client.model.ApiNotFoundErrorResponse
import org.openapitools.client.model.ApiServerErrorResponse
import org.openapitools.client.model.ApiUnauthorizedErrorResponse
import org.openapitools.client.model.DeleteGoodsFeedbackCommentRequest
import org.openapitools.client.model.EmptyApiResponse
import org.openapitools.client.model.GetGoodsFeedbackCommentsRequest
import org.openapitools.client.model.GetGoodsFeedbackCommentsResponse
import org.openapitools.client.model.GetGoodsFeedbackRequest
import org.openapitools.client.model.GetGoodsFeedbackResponse
import org.openapitools.client.model.SkipGoodsFeedbackReactionRequest
import org.openapitools.client.model.UpdateGoodsFeedbackCommentRequest
import org.openapitools.client.model.UpdateGoodsFeedbackCommentResponse
import org.openapitools.client.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object GoodsFeedbackApi {
  def apply(baseUrl: String = "https://api.partner.market.yandex.ru") = new GoodsFeedbackApi(baseUrl)
}

class GoodsFeedbackApi(baseUrl: String) {

  /**
   * Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : EmptyApiResponse (Пустой ответ.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param deleteGoodsFeedbackCommentRequest 
   */
  def deleteGoodsFeedbackComment(businessId: Long, deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest
): Request[Either[ResponseException[String, Exception], EmptyApiResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/businesses/${businessId}/goods-feedback/comments/delete")
      .contentType("application/json")
      .body(deleteGoodsFeedbackCommentRequest)
      .response(asJson[EmptyApiResponse])

  /**
   * Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : GetGoodsFeedbackCommentsResponse (Дерево комментариев к отзыву.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param getGoodsFeedbackCommentsRequest 
   * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
   * @param limit Количество значений на одной странице. 
   */
  def getGoodsFeedbackComments(businessId: Long, getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest, pageToken: Option[String] = None, limit: Option[Int] = None
): Request[Either[ResponseException[String, Exception], GetGoodsFeedbackCommentsResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/businesses/${businessId}/goods-feedback/comments?page_token=${ pageToken }&limit=${ limit }")
      .contentType("application/json")
      .body(getGoodsFeedbackCommentsRequest)
      .response(asJson[GetGoodsFeedbackCommentsResponse])

  /**
   * Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : GetGoodsFeedbackResponse (Список отзывов.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
   * @param limit Количество значений на одной странице. 
   * @param getGoodsFeedbackRequest 
   */
  def getGoodsFeedbacks(businessId: Long, pageToken: Option[String] = None, limit: Option[Int] = None, getGoodsFeedbackRequest: Option[GetGoodsFeedbackRequest] = None
): Request[Either[ResponseException[String, Exception], GetGoodsFeedbackResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/businesses/${businessId}/goods-feedback?page_token=${ pageToken }&limit=${ limit }")
      .contentType("application/json")
      .body(getGoodsFeedbackRequest)
      .response(asJson[GetGoodsFeedbackResponse])

  /**
   * Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : EmptyApiResponse (Пустой ответ.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param skipGoodsFeedbackReactionRequest 
   */
  def skipGoodsFeedbacksReaction(businessId: Long, skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest
): Request[Either[ResponseException[String, Exception], EmptyApiResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/businesses/${businessId}/goods-feedback/skip-reaction")
      .contentType("application/json")
      .body(skipGoodsFeedbackReactionRequest)
      .response(asJson[EmptyApiResponse])

  /**
   * Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
   * 
   * Expected answers:
   *   code 200 : UpdateGoodsFeedbackCommentResponse (Информация о добавленном или измененном комментарии.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param updateGoodsFeedbackCommentRequest 
   */
  def updateGoodsFeedbackComment(businessId: Long, updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest
): Request[Either[ResponseException[String, Exception], UpdateGoodsFeedbackCommentResponse], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/businesses/${businessId}/goods-feedback/comments/update")
      .contentType("application/json")
      .body(updateGoodsFeedbackCommentRequest)
      .response(asJson[UpdateGoodsFeedbackCommentResponse])

}
