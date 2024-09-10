
/*
 * SearchShipmentsRequest.h
 *
 * Запрос информации об отгрузках.
 */

#ifndef TINY_CPP_CLIENT_SearchShipmentsRequest_H_
#define TINY_CPP_CLIENT_SearchShipmentsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"
#include "Set.h"
#include "ShipmentStatusType.h"

namespace Tiny {


/*! \brief Запрос информации об отгрузках.
 *
 *  \ingroup Models
 *
 */

class SearchShipmentsRequest{
public:

    /*! \brief Constructor.
	 */
    SearchShipmentsRequest();
    SearchShipmentsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SearchShipmentsRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	Set<long> getOrderIds();

	/*! \brief Set Список идентификаторов заказов из отгрузок.
	 */
	void setOrderIds(Set <long> orderIds);
	/*! \brief Get Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. 
	 */
	bool isCancelledOrders();

	/*! \brief Set Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. 
	 */
	void setCancelledOrders(bool  cancelledOrders);


    private:
    Date dateFrom;
    Date dateTo;
    Set<ShipmentStatusType> statuses;
    Set<long> orderIds;
    bool cancelledOrders{};
};
}

#endif /* TINY_CPP_CLIENT_SearchShipmentsRequest_H_ */
