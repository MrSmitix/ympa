#ifndef TINY_CPP_CLIENT_CategoriesApi_H_
#define TINY_CPP_CLIENT_CategoriesApi_H_


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
#include "GetCategoriesMaxSaleQuantumRequest.h"
#include "GetCategoriesMaxSaleQuantumResponse.h"
#include "GetCategoriesRequest.h"
#include "GetCategoriesResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CategoriesApi : public Service {
public:
    CategoriesApi() = default;

    virtual ~CategoriesApi() = default;

    /**
    * Лимит на установку кванта продажи и минимального количества товаров в заказе.
    *
    * Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
    * \param getCategoriesMaxSaleQuantumRequest  *Required*
    */
    Response<
                GetCategoriesMaxSaleQuantumResponse
        >
    getCategoriesMaxSaleQuantum(
            
            GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest
            
    );
    /**
    * Дерево категорий.
    *
    * Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
    * \param getCategoriesRequest 
    */
    Response<
                GetCategoriesResponse
        >
    getCategoriesTree(
            
            GetCategoriesRequest getCategoriesRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_CategoriesApi_H_ */