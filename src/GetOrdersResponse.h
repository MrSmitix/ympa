/*
 * GetOrdersResponse.h
 *
 * Модель для ответа API списка информации по заказам.
 */

#ifndef _GetOrdersResponse_H_
#define _GetOrdersResponse_H_


#include <string>
#include "FlippingPagerDTO.h"
#include "ForwardScrollingPagerDTO.h"
#include "OrderDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Модель для ответа API списка информации по заказам.
 *
 *  \ingroup Models
 *
 */

class GetOrdersResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetOrdersResponse();
	GetOrdersResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetOrdersResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	FlippingPagerDTO getPager();

	/*! \brief Set 
	 */
	void setPager(FlippingPagerDTO  pager);
	/*! \brief Get Модель заказа. 
	 */
	std::list<OrderDTO> getOrders();

	/*! \brief Set Модель заказа. 
	 */
	void setOrders(std::list <OrderDTO> orders);
	/*! \brief Get 
	 */
	ForwardScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ForwardScrollingPagerDTO  paging);

private:
	FlippingPagerDTO pager;
	std::list <OrderDTO>orders;
	ForwardScrollingPagerDTO paging;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetOrdersResponse_H_ */
