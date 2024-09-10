/*
 * TransferOrdersFromShipmentRequest.h
 *
 * Запрос переноса заказов из отгрузки.
 */

#ifndef _TransferOrdersFromShipmentRequest_H_
#define _TransferOrdersFromShipmentRequest_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос переноса заказов из отгрузки.
 *
 *  \ingroup Models
 *
 */

class TransferOrdersFromShipmentRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	TransferOrdersFromShipmentRequest();
	TransferOrdersFromShipmentRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TransferOrdersFromShipmentRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список заказов, которые вы не успеваете подготовить.
	 */
	std::list<long long> getOrderIds();

	/*! \brief Set Список заказов, которые вы не успеваете подготовить.
	 */
	void setOrderIds(std::list <long long> orderIds);

private:
	std::list <long long>orderIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TransferOrdersFromShipmentRequest_H_ */
