/*
 * UpdateOrderStatusesRequest.h
 *
 * Список заказов.
 */

#ifndef _UpdateOrderStatusesRequest_H_
#define _UpdateOrderStatusesRequest_H_


#include <string>
#include "OrderStateDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список заказов.
 *
 *  \ingroup Models
 *
 */

class UpdateOrderStatusesRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateOrderStatusesRequest();
	UpdateOrderStatusesRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateOrderStatusesRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список заказов.
	 */
	std::list<OrderStateDTO> getOrders();

	/*! \brief Set Список заказов.
	 */
	void setOrders(std::list <OrderStateDTO> orders);

private:
	std::list <OrderStateDTO>orders;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateOrderStatusesRequest_H_ */
