#ifndef TINY_CPP_CLIENT_WarehousesApi_H_
#define TINY_CPP_CLIENT_WarehousesApi_H_


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
#include "GetFulfillmentWarehousesResponse.h"
#include "GetWarehousesResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class WarehousesApi : public Service {
public:
    WarehousesApi() = default;

    virtual ~WarehousesApi() = default;

    /**
    * Идентификаторы складов Маркета (FBY).
    *
    * Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
    */
    Response<
                GetFulfillmentWarehousesResponse
        >
    getFulfillmentWarehouses(
    );
    /**
    * Список складов и групп складов.
    *
    * Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    */
    Response<
                GetWarehousesResponse
        >
    getWarehouses(
            
            long businessId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_WarehousesApi_H_ */