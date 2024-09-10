#ifndef _CategoriesManager_H_
#define _CategoriesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
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
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Categories Categories
 * \ingroup Operations
 *  @{
 */
class CategoriesManager {
public:
	CategoriesManager();
	virtual ~CategoriesManager();

/*! \brief Лимит на установку кванта продажи и минимального количества товаров в заказе. *Synchronous*
 *
 * Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * \param getCategoriesMaxSaleQuantumRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getCategoriesMaxSaleQuantumSync(char * accessToken,
	std::shared_ptr<GetCategoriesMaxSaleQuantumRequest> getCategoriesMaxSaleQuantumRequest, 
	void(* handler)(GetCategoriesMaxSaleQuantumResponse, Error, void* )
	, void* userData);

/*! \brief Лимит на установку кванта продажи и минимального количества товаров в заказе. *Asynchronous*
 *
 * Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * \param getCategoriesMaxSaleQuantumRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getCategoriesMaxSaleQuantumAsync(char * accessToken,
	std::shared_ptr<GetCategoriesMaxSaleQuantumRequest> getCategoriesMaxSaleQuantumRequest, 
	void(* handler)(GetCategoriesMaxSaleQuantumResponse, Error, void* )
	, void* userData);


/*! \brief Дерево категорий. *Synchronous*
 *
 * Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * \param getCategoriesRequest 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getCategoriesTreeSync(char * accessToken,
	std::shared_ptr<GetCategoriesRequest> getCategoriesRequest, 
	void(* handler)(GetCategoriesResponse, Error, void* )
	, void* userData);

/*! \brief Дерево категорий. *Asynchronous*
 *
 * Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * \param getCategoriesRequest 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getCategoriesTreeAsync(char * accessToken,
	std::shared_ptr<GetCategoriesRequest> getCategoriesRequest, 
	void(* handler)(GetCategoriesResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.partner.market.yandex.ru";
	}
};
/** @}*/

}
}
#endif /* CategoriesManager_H_ */
