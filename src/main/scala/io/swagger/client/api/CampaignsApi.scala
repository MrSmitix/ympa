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
import io.swagger.client.model.ApiNotFoundErrorResponse
import io.swagger.client.model.ApiServerErrorResponse
import io.swagger.client.model.ApiUnauthorizedErrorResponse
import io.swagger.client.model.GetCampaignLoginsResponse
import io.swagger.client.model.GetCampaignRegionResponse
import io.swagger.client.model.GetCampaignResponse
import io.swagger.client.model.GetCampaignSettingsResponse
import io.swagger.client.model.GetCampaignsResponse

trait CampaignsApi extends Service {


  final override def descriptor = {
    import Service._
    named("CampaignsApi").withCalls(
      restCall(Method.GET, "/campaigns/:campaignId", getCampaign _), 
      restCall(Method.GET, "/campaigns/:campaignId/logins", getCampaignLogins _), 
      restCall(Method.GET, "/campaigns/:campaignId/region", getCampaignRegion _), 
      restCall(Method.GET, "/campaigns/:campaignId/settings", getCampaignSettings _), 
      restCall(Method.GET, "/campaigns?page&pageSize", getCampaigns _), 
      restCall(Method.GET, "/campaigns/by_login/:login?page&pageSize", getCampaignsByLogin _)
    ).withAutoAcl(true)
  }


  /**
    * Информация о магазине
    * Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
    *  
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
    * @return GetCampaignResponse
    */
  def getCampaign(campaignId: Long): ServiceCall[NotUsed ,GetCampaignResponse]
  
  /**
    * Логины, связанные с магазином
    * Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
    *  
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
    * @return GetCampaignLoginsResponse
    */
  def getCampaignLogins(campaignId: Long): ServiceCall[NotUsed ,GetCampaignLoginsResponse]
  
  /**
    * Регион магазина
    * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
    *  
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
    * @return GetCampaignRegionResponse
    */
  def getCampaignRegion(campaignId: Long): ServiceCall[NotUsed ,GetCampaignRegionResponse]
  
  /**
    * Настройки магазина
    * Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
    *  
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
    * @return GetCampaignSettingsResponse
    */
  def getCampaignSettings(campaignId: Long): ServiceCall[NotUsed ,GetCampaignSettingsResponse]
        
  /**
    * Список магазинов пользователя
    * Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
    *  
    * @param page Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  (optional, default to 1) 
    * @param pageSize Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  (optional)
    * @return GetCampaignsResponse
    */
  def getCampaigns(page:           Option[Int] /* = 1*/,pageSize:           Option[Int] = None): ServiceCall[NotUsed ,GetCampaignsResponse]
        
  /**
    * Магазины, доступные логину
    * Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
    *  
    * @param login Логин пользователя.  
    * @param page Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  (optional, default to 1) 
    * @param pageSize Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  (optional)
    * @return GetCampaignsResponse
    */
  def getCampaignsByLogin(page:           Option[Int] /* = 1*/,pageSize:           Option[Int] = Nonelogin: String): ServiceCall[NotUsed ,GetCampaignsResponse]
  

  }
