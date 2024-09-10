#ifndef TINY_CPP_CLIENT_BusinessesApi_H_
#define TINY_CPP_CLIENT_BusinessesApi_H_


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
#include "GetBusinessSettingsResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class BusinessesApi : public Service {
public:
    BusinessesApi() = default;

    virtual ~BusinessesApi() = default;

    /**
    * Настройки кабинета.
    *
    * Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    */
    Response<
                GetBusinessSettingsResponse
        >
    getBusinessSettings(
            
            long businessId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_BusinessesApi_H_ */