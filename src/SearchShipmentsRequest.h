/*
 * SearchShipmentsRequest.h
 *
 * Запрос информации об отгрузках.
 */

#ifndef _SearchShipmentsRequest_H_
#define _SearchShipmentsRequest_H_


#include <string>
#include "Date.h"
#include "Set.h"
#include "ShipmentStatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос информации об отгрузках.
 *
 *  \ingroup Models
 *
 */

class SearchShipmentsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	SearchShipmentsRequest();
	SearchShipmentsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SearchShipmentsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	Date getDateFrom();

	/*! \brief Set Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	void setDateFrom(Date  dateFrom);
	/*! \brief Get Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	Date getDateTo();

	/*! \brief Set Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	void setDateTo(Date  dateTo);
	/*! \brief Get Список статусов отгрузок.
	 */
	Set<ShipmentStatusType> getStatuses();

	/*! \brief Set Список статусов отгрузок.
	 */
	void setStatuses(Set <ShipmentStatusType> statuses);
	/*! \brief Get Список идентификаторов заказов из отгрузок.
	 */
	Set<long long> getOrderIds();

	/*! \brief Set Список идентификаторов заказов из отгрузок.
	 */
	void setOrderIds(Set <long long> orderIds);
	/*! \brief Get Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. 
	 */
	bool getCancelledOrders();

	/*! \brief Set Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. 
	 */
	void setCancelledOrders(bool  cancelledOrders);

private:
	Date dateFrom;
	Date dateTo;
	Set <ShipmentStatusType>statuses;
	Set <long long>orderIds;
	bool cancelledOrders;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SearchShipmentsRequest_H_ */
