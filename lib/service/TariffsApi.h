#ifndef TINY_CPP_CLIENT_TariffsApi_H_
#define TINY_CPP_CLIENT_TariffsApi_H_


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
#include "CalculateTariffsRequest.h"
#include "CalculateTariffsResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class TariffsApi : public Service {
public:
    TariffsApi() = default;

    virtual ~TariffsApi() = default;

    /**
    * Калькулятор стоимости услуг.
    *
    * Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
    * \param calculateTariffsRequest  *Required*
    */
    Response<
                CalculateTariffsResponse
        >
    calculateTariffs(
            
            CalculateTariffsRequest calculateTariffsRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_TariffsApi_H_ */