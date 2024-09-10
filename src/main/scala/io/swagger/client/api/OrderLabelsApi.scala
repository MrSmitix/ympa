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
import java.io.File
import io.swagger.client.model.GetOrderLabelsDataResponse
import io.swagger.client.model.PageFormatType

trait OrderLabelsApi extends Service {


  final override def descriptor = {
    import Service._
    named("OrderLabelsApi").withCalls(
      restCall(Method.GET, "/campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes/:boxId/label?format", generateOrderLabel _), 
      restCall(Method.GET, "/campaigns/:campaignId/orders/:orderId/delivery/labels?format", generateOrderLabels _), 
      restCall(Method.GET, "/campaigns/:campaignId/orders/:orderId/delivery/labels/data", getOrderLabelsData _)
    ).withAutoAcl(true)
  }

      
  /**
    * Готовый ярлык‑наклейка для коробки в заказе
    * Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    *  
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)   
    * @param orderId Идентификатор заказа.  
    * @param shipmentId Идентификатор грузоместа.  
    * @param boxId Идентификатор коробки.  
    * @param format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. (optional)
    * @return File
    */
  def generateOrderLabel(format:           Option[PageFormatType] = NonecampaignId: Long, orderId: Long, shipmentId: Long, boxId: Long): ServiceCall[NotUsed ,File]
        
  /**
    * Готовые ярлыки‑наклейки на все коробки в одном заказе
    * Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    *  
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)   
    * @param orderId Идентификатор заказа.  
    * @param format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. (optional)
    * @return File
    */
  def generateOrderLabels(format:           Option[PageFormatType] = NonecampaignId: Long, orderId: Long): ServiceCall[NotUsed ,File]
  
  /**
    * Данные для самостоятельного изготовления ярлыков
    * Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    *  
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)   
    * @param orderId Идентификатор заказа. 
    * @return GetOrderLabelsDataResponse
    */
  def getOrderLabelsData(campaignId: Long, orderId: Long): ServiceCall[NotUsed ,GetOrderLabelsDataResponse]
  

  }
