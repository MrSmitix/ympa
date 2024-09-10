#ifndef TINY_CPP_CLIENT_PromosApi_H_
#define TINY_CPP_CLIENT_PromosApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "ApiClientDataErrorResponse.h"
#include "ApiForbiddenErrorResponse.h"
#include "ApiLimitErrorResponse.h"
#include "ApiNotFoundErrorResponse.h"
#include "ApiServerErrorResponse.h"
#include "ApiUnauthorizedErrorResponse.h"
#include "DeletePromoOffersRequest.h"
#include "DeletePromoOffersResponse.h"
#include "GetPromoOffersRequest.h"
#include "GetPromoOffersResponse.h"
#include "GetPromosRequest.h"
#include "GetPromosResponse.h"
#include "UpdatePromoOffersRequest.h"
#include "UpdatePromoOffersResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class PromosApi : public Service {
public:
    PromosApi() = default;

    virtual ~PromosApi() = default;

    /**
    * Удаление товаров из акции.
    *
    * Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param deletePromoOffersRequest  *Required*
    */
    Response<
                DeletePromoOffersResponse
        >
    deletePromoOffers(
            
            long businessId
            , 
            
            DeletePromoOffersRequest deletePromoOffersRequest
            
    );
    /**
    * Получение списка товаров, которые участвуют или могут участвовать в акции.
    *
    * Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param getPromoOffersRequest  *Required*
    * \param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
    * \param limit Количество значений на одной странице. 
    */
    Response<
                GetPromoOffersResponse
        >
    getPromoOffers(
            
            long businessId
            , 
            
            GetPromoOffersRequest getPromoOffersRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
    );
    /**
    * Получение списка акций.
    *
    * Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param getPromosRequest 
    */
    Response<
                GetPromosResponse
        >
    getPromos(
            
            long businessId
            , 
            
            GetPromosRequest getPromosRequest
            
    );
    /**
    * Добавление товаров в акцию или изменение их цен.
    *
    * Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param updatePromoOffersRequest  *Required*
    */
    Response<
                UpdatePromoOffersResponse
        >
    updatePromoOffers(
            
            long businessId
            , 
            
            UpdatePromoOffersRequest updatePromoOffersRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_PromosApi_H_ */