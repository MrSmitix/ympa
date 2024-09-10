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

package io.swagger.client.api

import akka.{Done, NotUsed}
import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}
import play.api.libs.json._
import com.lightbend.lagom.scaladsl.api.deser.PathParamSerializer

import io.swagger.client.model.ApiClientDataErrorResponse
import io.swagger.client.model.ApiForbiddenErrorResponse
import io.swagger.client.model.ApiLimitErrorResponse
import io.swagger.client.model.ApiLockedErrorResponse
import io.swagger.client.model.ApiNotFoundErrorResponse
import io.swagger.client.model.ApiServerErrorResponse
import io.swagger.client.model.ApiUnauthorizedErrorResponse
import io.swagger.client.model.GetCategoryContentParametersResponse
import io.swagger.client.model.GetOfferCardsContentStatusRequest
import io.swagger.client.model.GetOfferCardsContentStatusResponse
import io.swagger.client.model.UpdateOfferContentRequest
import io.swagger.client.model.UpdateOfferContentResponse

trait ContentApi extends Service {


  final override def descriptor = {
    import Service._
    named("ContentApi").withCalls(
      restCall(Method.POST, "/category/:categoryId/parameters", getCategoryContentParameters _), 
      restCall(Method.POST, "/businesses/:businessId/offer-cards?pageToken&limit", getOfferCardsContentStatus _), 
      restCall(Method.POST, "/businesses/:businessId/offer-cards/update", updateOfferContent _)
    ).withAutoAcl(true)
  }


  /**
    * Списки характеристик товаров по категориям
    * Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
    *  
    * @param categoryId Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  
    * @return GetCategoryContentParametersResponse
    */
  def getCategoryContentParameters(categoryId: Long): ServiceCall[NotUsed ,GetCategoryContentParametersResponse]
        
  /**
    * Получение информации о заполненности карточек магазина
    * Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
    *  
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)   
    * @param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional) 
    * @param limit Количество значений на одной странице.  (optional) 
    * @return GetOfferCardsContentStatusResponse Body Parameter   
    */
  def getOfferCardsContentStatus(pageToken:           Option[String] = None,limit:           Option[Int] = NonebusinessId: Long): ServiceCall[GetOfferCardsContentStatusRequest ,GetOfferCardsContentStatusResponse]
  
  /**
    * Редактирование категорийных характеристик товара
    * Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \&quot;Здесь только то, что относится к конкретной категории\&quot; %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
    *  
    * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)   
    * @return UpdateOfferContentResponse Body Parameter   
    */
  def updateOfferContent(businessId: Long): ServiceCall[UpdateOfferContentRequest ,UpdateOfferContentResponse]
  

  }
