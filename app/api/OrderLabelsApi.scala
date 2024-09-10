package api

import play.api.libs.json._
import model.ApiClientDataErrorResponse
import model.ApiForbiddenErrorResponse
import model.ApiLimitErrorResponse
import model.ApiNotFoundErrorResponse
import model.ApiServerErrorResponse
import model.ApiUnauthorizedErrorResponse
import model.GetOrderLabelsDataResponse
import model.PageFormatType
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
trait OrderLabelsApi {
  /**
    * Готовый ярлык‑наклейка для коробки в заказе
    * Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    * @param shipmentId Идентификатор грузоместа.
    * @param boxId Идентификатор коробки.
    * @param format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
    */
  def generateOrderLabel(campaignId: Long, orderId: Long, shipmentId: Long, boxId: Long, format: Option[PageFormatType]): TemporaryFile

  /**
    * Готовые ярлыки‑наклейки на все коробки в одном заказе
    * Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    * @param format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
    */
  def generateOrderLabels(campaignId: Long, orderId: Long, format: Option[PageFormatType]): TemporaryFile

  /**
    * Данные для самостоятельного изготовления ярлыков
    * Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
    * @param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    * @param orderId Идентификатор заказа.
    */
  def getOrderLabelsData(campaignId: Long, orderId: Long): GetOrderLabelsDataResponse
}
