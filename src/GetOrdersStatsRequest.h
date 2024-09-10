/*
 * GetOrdersStatsRequest.h
 *
 * Запрос информации по заказам.
 */

#ifndef _GetOrdersStatsRequest_H_
#define _GetOrdersStatsRequest_H_


#include <string>
#include "Date.h"
#include "OrderStatsStatusType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос информации по заказам.
 *
 *  \ingroup Models
 *
 */

class GetOrdersStatsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetOrdersStatsRequest();
	GetOrdersStatsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetOrdersStatsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
	 */
	Date getDateFrom();

	/*! \brief Set Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
	 */
	void setDateFrom(Date  dateFrom);
	/*! \brief Get Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
	 */
	Date getDateTo();

	/*! \brief Set Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
	 */
	void setDateTo(Date  dateTo);
	/*! \brief Get Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
	 */
	Date getUpdateFrom();

	/*! \brief Set Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
	 */
	void setUpdateFrom(Date  updateFrom);
	/*! \brief Get Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
	 */
	Date getUpdateTo();

	/*! \brief Set Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
	 */
	void setUpdateTo(Date  updateTo);
	/*! \brief Get Список идентификаторов заказов.
	 */
	std::list<long long> getOrders();

	/*! \brief Set Список идентификаторов заказов.
	 */
	void setOrders(std::list <long long> orders);
	/*! \brief Get Список статусов заказов.
	 */
	std::list<OrderStatsStatusType> getStatuses();

	/*! \brief Set Список статусов заказов.
	 */
	void setStatuses(std::list <OrderStatsStatusType> statuses);
	/*! \brief Get Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
	 */
	bool getHasCis();

	/*! \brief Set Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
	 */
	void setHasCis(bool  hasCis);

private:
	Date dateFrom;
	Date dateTo;
	Date updateFrom;
	Date updateTo;
	std::list <long long>orders;
	std::list <OrderStatsStatusType>statuses;
	bool hasCis;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetOrdersStatsRequest_H_ */
