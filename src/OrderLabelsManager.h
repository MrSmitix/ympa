#ifndef _OrderLabelsManager_H_
#define _OrderLabelsManager_H_

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
#include "GetOrderLabelsDataResponse.h"
#include "PageFormatType.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup OrderLabels OrderLabels
 * \ingroup Operations
 *  @{
 */
class OrderLabelsManager {
public:
	OrderLabelsManager();
	virtual ~OrderLabelsManager();

/*! \brief Готовый ярлык‑наклейка для коробки в заказе. *Synchronous*
 *
 * Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
 * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param orderId Идентификатор заказа. *Required*
 * \param shipmentId Идентификатор грузоместа. *Required*
 * \param boxId Идентификатор коробки. *Required*
 * \param format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateOrderLabelSync(char * accessToken,
	long long campaignId, long long orderId, long long shipmentId, long long boxId, PageFormatType format, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Готовый ярлык‑наклейка для коробки в заказе. *Asynchronous*
 *
 * Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
 * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param orderId Идентификатор заказа. *Required*
 * \param shipmentId Идентификатор грузоместа. *Required*
 * \param boxId Идентификатор коробки. *Required*
 * \param format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateOrderLabelAsync(char * accessToken,
	long long campaignId, long long orderId, long long shipmentId, long long boxId, PageFormatType format, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Готовые ярлыки‑наклейки на все коробки в одном заказе. *Synchronous*
 *
 * Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
 * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param orderId Идентификатор заказа. *Required*
 * \param format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateOrderLabelsSync(char * accessToken,
	long long campaignId, long long orderId, PageFormatType format, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Готовые ярлыки‑наклейки на все коробки в одном заказе. *Asynchronous*
 *
 * Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
 * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param orderId Идентификатор заказа. *Required*
 * \param format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool generateOrderLabelsAsync(char * accessToken,
	long long campaignId, long long orderId, PageFormatType format, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Данные для самостоятельного изготовления ярлыков. *Synchronous*
 *
 * Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
 * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param orderId Идентификатор заказа. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getOrderLabelsDataSync(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetOrderLabelsDataResponse, Error, void* )
	, void* userData);

/*! \brief Данные для самостоятельного изготовления ярлыков. *Asynchronous*
 *
 * Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
 * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param orderId Идентификатор заказа. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getOrderLabelsDataAsync(char * accessToken,
	long long campaignId, long long orderId, 
	void(* handler)(GetOrderLabelsDataResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.partner.market.yandex.ru";
	}
};
/** @}*/

}
}
#endif /* OrderLabelsManager_H_ */
