#ifndef TINY_CPP_CLIENT_DeliveryServicesApi_H_
#define TINY_CPP_CLIENT_DeliveryServicesApi_H_


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
#include "GetDeliveryServicesResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class DeliveryServicesApi : public Service {
public:
    DeliveryServicesApi() = default;

    virtual ~DeliveryServicesApi() = default;

    /**
    * Справочник служб доставки.
    *
    * Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
    */
    Response<
                GetDeliveryServicesResponse
        >
    getDeliveryServices(
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_DeliveryServicesApi_H_ */