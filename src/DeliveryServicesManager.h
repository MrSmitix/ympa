#ifndef _DeliveryServicesManager_H_
#define _DeliveryServicesManager_H_

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
#include "GetDeliveryServicesResponse.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup DeliveryServices DeliveryServices
 * \ingroup Operations
 *  @{
 */
class DeliveryServicesManager {
public:
	DeliveryServicesManager();
	virtual ~DeliveryServicesManager();

/*! \brief Справочник служб доставки. *Synchronous*
 *
 * Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDeliveryServicesSync(char * accessToken,
	
	void(* handler)(GetDeliveryServicesResponse, Error, void* )
	, void* userData);

/*! \brief Справочник служб доставки. *Asynchronous*
 *
 * Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDeliveryServicesAsync(char * accessToken,
	
	void(* handler)(GetDeliveryServicesResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.partner.market.yandex.ru";
	}
};
/** @}*/

}
}
#endif /* DeliveryServicesManager_H_ */
