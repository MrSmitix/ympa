
/*
 * GetOrdersStatsRequest.h
 *
 * Запрос информации по заказам.
 */

#ifndef TINY_CPP_CLIENT_GetOrdersStatsRequest_H_
#define TINY_CPP_CLIENT_GetOrdersStatsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"
#include "OrderStatsStatusType.h"
#include <list>

namespace Tiny {


/*! \brief Запрос информации по заказам.
 *
 *  \ingroup Models
 *
 */

class GetOrdersStatsRequest{
public:

    /*! \brief Constructor.
	 */
    GetOrdersStatsRequest();
    GetOrdersStatsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetOrdersStatsRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	std::list<long> getOrders();

	/*! \brief Set Список идентификаторов заказов.
	 */
	void setOrders(std::list <long> orders);
	/*! \brief Get Список статусов заказов.
	 */
	std::list<OrderStatsStatusType> getStatuses();

	/*! \brief Set Список статусов заказов.
	 */
	void setStatuses(std::list <OrderStatsStatusType> statuses);
	/*! \brief Get Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
	 */
	bool isHasCis();

	/*! \brief Set Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
	 */
	void setHasCis(bool  hasCis);


    private:
    Date dateFrom;
    Date dateTo;
    Date updateFrom;
    Date updateTo;
    std::list<long> orders;
    std::list<OrderStatsStatusType> statuses;
    bool hasCis{};
};
}

#endif /* TINY_CPP_CLIENT_GetOrdersStatsRequest_H_ */
