#ifndef TINY_CPP_CLIENT_BusinessOfferMappingsApi_H_
#define TINY_CPP_CLIENT_BusinessOfferMappingsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AddOffersToArchiveRequest.h"
#include "AddOffersToArchiveResponse.h"
#include "ApiClientDataErrorResponse.h"
#include "ApiForbiddenErrorResponse.h"
#include "ApiLimitErrorResponse.h"
#include "ApiLockedErrorResponse.h"
#include "ApiNotFoundErrorResponse.h"
#include "ApiServerErrorResponse.h"
#include "ApiUnauthorizedErrorResponse.h"
#include "DeleteOffersFromArchiveRequest.h"
#include "DeleteOffersFromArchiveResponse.h"
#include "DeleteOffersRequest.h"
#include "DeleteOffersResponse.h"
#include "GetOfferMappingsRequest.h"
#include "GetOfferMappingsResponse.h"
#include "GetSuggestedOfferMappingsRequest.h"
#include "GetSuggestedOfferMappingsResponse.h"
#include "UpdateOfferMappingsRequest.h"
#include "UpdateOfferMappingsResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class BusinessOfferMappingsApi : public Service {
public:
    BusinessOfferMappingsApi() = default;

    virtual ~BusinessOfferMappingsApi() = default;

    /**
    * Добавление товаров в архив.
    *
    * Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \"В архив нельзя отправить товар, который хранится на складе Маркета\" %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param addOffersToArchiveRequest  *Required*
    */
    Response<
                AddOffersToArchiveResponse
        >
    addOffersToArchive(
            
            long businessId
            , 
            
            AddOffersToArchiveRequest addOffersToArchiveRequest
            
    );
    /**
    * Удаление товаров из каталога.
    *
    * Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param deleteOffersRequest  *Required*
    */
    Response<
                DeleteOffersResponse
        >
    deleteOffers(
            
            long businessId
            , 
            
            DeleteOffersRequest deleteOffersRequest
            
    );
    /**
    * Удаление товаров из архива.
    *
    * Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param deleteOffersFromArchiveRequest  *Required*
    */
    Response<
                DeleteOffersFromArchiveResponse
        >
    deleteOffersFromArchive(
            
            long businessId
            , 
            
            DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest
            
    );
    /**
    * Информация о товарах в каталоге.
    *
    * Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
    * \param limit Количество значений на одной странице. 
    * \param getOfferMappingsRequest 
    */
    Response<
                GetOfferMappingsResponse
        >
    getOfferMappings(
            
            long businessId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            GetOfferMappingsRequest getOfferMappingsRequest
            
    );
    /**
    * Просмотр карточек на Маркете, которые подходят вашим товарам.
    *
    * Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.  {% note info \"𝓠 Как определить `marketSku` товара, найденного на Маркете?\" %}  𝓐 Он есть в адресе страницы товара — расположен после `sku=`.  Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param getSuggestedOfferMappingsRequest 
    */
    Response<
                GetSuggestedOfferMappingsResponse
        >
    getSuggestedOfferMappings(
            
            long businessId
            , 
            
            GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest
            
    );
    /**
    * Добавление товаров в каталог и изменение информации о них.
    *
    * Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.  Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.  Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \"Правила использования SKU\" %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param updateOfferMappingsRequest  *Required*
    */
    Response<
                UpdateOfferMappingsResponse
        >
    updateOfferMappings(
            
            long businessId
            , 
            
            UpdateOfferMappingsRequest updateOfferMappingsRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_BusinessOfferMappingsApi_H_ */