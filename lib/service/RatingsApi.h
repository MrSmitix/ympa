#ifndef TINY_CPP_CLIENT_RatingsApi_H_
#define TINY_CPP_CLIENT_RatingsApi_H_


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
#include "GetQualityRatingDetailsResponse.h"
#include "GetQualityRatingRequest.h"
#include "GetQualityRatingResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class RatingsApi : public Service {
public:
    RatingsApi() = default;

    virtual ~RatingsApi() = default;

    /**
    * Заказы, которые повлияли на индекс качества.
    *
    * Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 
    * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    */
    Response<
                GetQualityRatingDetailsResponse
        >
    getQualityRatingDetails(
            
            long campaignId
            
    );
    /**
    * Индекс качества магазинов.
    *
    * Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param getQualityRatingRequest  *Required*
    */
    Response<
                GetQualityRatingResponse
        >
    getQualityRatings(
            
            long businessId
            , 
            
            GetQualityRatingRequest getQualityRatingRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_RatingsApi_H_ */