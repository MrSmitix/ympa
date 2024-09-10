#ifndef TINY_CPP_CLIENT_GoodsStatsApi_H_
#define TINY_CPP_CLIENT_GoodsStatsApi_H_


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
#include "GetGoodsStatsRequest.h"
#include "GetGoodsStatsResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class GoodsStatsApi : public Service {
public:
    GoodsStatsApi() = default;

    virtual ~GoodsStatsApi() = default;

    /**
    * Отчет по товарам.
    *
    * Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
    * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param getGoodsStatsRequest  *Required*
    */
    Response<
                GetGoodsStatsResponse
        >
    getGoodsStats(
            
            long campaignId
            , 
            
            GetGoodsStatsRequest getGoodsStatsRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_GoodsStatsApi_H_ */