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

import org.openapitools.client.model.AddOffersToArchiveRequest
import org.openapitools.client.model.AddOffersToArchiveResponse
import org.openapitools.client.model.ApiClientDataErrorResponse
import org.openapitools.client.model.ApiForbiddenErrorResponse
import org.openapitools.client.model.ApiLimitErrorResponse
import org.openapitools.client.model.ApiLockedErrorResponse
import org.openapitools.client.model.ApiNotFoundErrorResponse
import org.openapitools.client.model.ApiServerErrorResponse
import org.openapitools.client.model.ApiUnauthorizedErrorResponse
import org.openapitools.client.model.DeleteOffersFromArchiveRequest
import org.openapitools.client.model.DeleteOffersFromArchiveResponse
import org.openapitools.client.model.DeleteOffersRequest
import org.openapitools.client.model.DeleteOffersResponse
import org.openapitools.client.model.GetOfferMappingsRequest
import org.openapitools.client.model.GetOfferMappingsResponse
import org.openapitools.client.model.GetSuggestedOfferMappingsRequest
import org.openapitools.client.model.GetSuggestedOfferMappingsResponse
import org.openapitools.client.model.UpdateOfferMappingsRequest
import org.openapitools.client.model.UpdateOfferMappingsResponse
import org.openapitools.client.core.JsonSupport._
import sttp.client4._
import sttp.model.Method

object BusinessOfferMappingsApi {
  def apply(baseUrl: String = "https://api.partner.market.yandex.ru") = new BusinessOfferMappingsApi(baseUrl)
}

class BusinessOfferMappingsApi(baseUrl: String) {

  /**
   * Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \"В архив нельзя отправить товар, который хранится на складе Маркета\" %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
   * 
   * Expected answers:
   *   code 200 : AddOffersToArchiveResponse (Если некоторые товары добавить в архив не удалось, в ответе 200 будет их список.  Список успешно добавленных товаров не возвращается. )
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 423 : ApiLockedErrorResponse (К ресурсу нельзя применить указанный метод.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param addOffersToArchiveRequest 
   */
  def addOffersToArchive(businessId: Long, addOffersToArchiveRequest: AddOffersToArchiveRequest): Request[Either[ResponseException[String, Exception], AddOffersToArchiveResponse]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/businesses/${businessId}/offer-mappings/archive")
      .contentType("application/json")
      .body(addOffersToArchiveRequest)
      .response(asJson[AddOffersToArchiveResponse])

  /**
   * Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
   * 
   * Expected answers:
   *   code 200 : DeleteOffersResponse (Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине.)
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 423 : ApiLockedErrorResponse (К ресурсу нельзя применить указанный метод.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param deleteOffersRequest 
   */
  def deleteOffers(businessId: Long, deleteOffersRequest: DeleteOffersRequest): Request[Either[ResponseException[String, Exception], DeleteOffersResponse]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/businesses/${businessId}/offer-mappings/delete")
      .contentType("application/json")
      .body(deleteOffersRequest)
      .response(asJson[DeleteOffersResponse])

  /**
   * Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
   * 
   * Expected answers:
   *   code 200 : DeleteOffersFromArchiveResponse (Если некоторые товары восстановить из архива не удалось, в ответе 200 будет их список.  Список успешно восстановленных товаров не возвращается. )
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 423 : ApiLockedErrorResponse (К ресурсу нельзя применить указанный метод.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param deleteOffersFromArchiveRequest 
   */
  def deleteOffersFromArchive(businessId: Long, deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest): Request[Either[ResponseException[String, Exception], DeleteOffersFromArchiveResponse]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/businesses/${businessId}/offer-mappings/unarchive")
      .contentType("application/json")
      .body(deleteOffersFromArchiveRequest)
      .response(asJson[DeleteOffersFromArchiveResponse])

  /**
   * Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 
   * 
   * Expected answers:
   *   code 200 : GetOfferMappingsResponse (Информация о товарах в каталоге.)
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
   * @param getOfferMappingsRequest 
   */
  def getOfferMappings(businessId: Long, pageToken: Option[String] = None, limit: Option[Int] = None, getOfferMappingsRequest: Option[GetOfferMappingsRequest] = None): Request[Either[ResponseException[String, Exception], GetOfferMappingsResponse]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/businesses/${businessId}/offer-mappings?page_token=${ pageToken }&limit=${ limit }")
      .contentType("application/json")
      .body(getOfferMappingsRequest)
      .response(asJson[GetOfferMappingsResponse])

  /**
   * Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.  {% note info \"𝓠 Как определить `marketSku` товара, найденного на Маркете?\" %}  𝓐 Он есть в адресе страницы товара — расположен после `sku=`.  Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
   * 
   * Expected answers:
   *   code 200 : GetSuggestedOfferMappingsResponse (Подобранные карточки на Маркете.  По результатам проверки товара полученная через этот запрос карточка может быть заменена на другую. )
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param getSuggestedOfferMappingsRequest 
   */
  def getSuggestedOfferMappings(businessId: Long, getSuggestedOfferMappingsRequest: Option[GetSuggestedOfferMappingsRequest] = None): Request[Either[ResponseException[String, Exception], GetSuggestedOfferMappingsResponse]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/businesses/${businessId}/offer-mappings/suggestions")
      .contentType("application/json")
      .body(getSuggestedOfferMappingsRequest)
      .response(asJson[GetSuggestedOfferMappingsResponse])

  /**
   * Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.  Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.  Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \"Правила использования SKU\" %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
   * 
   * Expected answers:
   *   code 200 : UpdateOfferMappingsResponse (Все обязательные поля товаров заполнены, поэтому новые товары и внесенные изменения сохранены в каталоге. )
   *   code 400 : ApiClientDataErrorResponse (Запрос содержит неправильные данные.)
   *   code 401 : ApiUnauthorizedErrorResponse (В запросе не указаны данные для авторизации.)
   *   code 403 : ApiForbiddenErrorResponse (Данные для авторизации неверны или доступ к ресурсу запрещен.)
   *   code 404 : ApiNotFoundErrorResponse (Запрашиваемый ресурс не найден.)
   *   code 420 : ApiLimitErrorResponse (Превышено ограничение на доступ к ресурсу.)
   *   code 423 : ApiLockedErrorResponse (К ресурсу нельзя применить указанный метод.)
   *   code 500 : ApiServerErrorResponse (Внутренняя ошибка сервера.)
   * 
   * @param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
   * @param updateOfferMappingsRequest 
   */
  def updateOfferMappings(businessId: Long, updateOfferMappingsRequest: UpdateOfferMappingsRequest): Request[Either[ResponseException[String, Exception], UpdateOfferMappingsResponse]] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/businesses/${businessId}/offer-mappings/update")
      .contentType("application/json")
      .body(updateOfferMappingsRequest)
      .response(asJson[UpdateOfferMappingsResponse])

}