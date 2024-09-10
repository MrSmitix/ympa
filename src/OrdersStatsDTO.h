/*
 * OrdersStatsDTO.h
 *
 * Информация по заказам.
 */

#ifndef _OrdersStatsDTO_H_
#define _OrdersStatsDTO_H_


#include <string>
#include "ForwardScrollingPagerDTO.h"
#include "OrdersStatsOrderDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация по заказам.
 *
 *  \ingroup Models
 *
 */

class OrdersStatsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrdersStatsDTO();
	OrdersStatsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrdersStatsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список заказов.
	 */
	std::list<OrdersStatsOrderDTO> getOrders();

	/*! \brief Set Список заказов.
	 */
	void setOrders(std::list <OrdersStatsOrderDTO> orders);
	/*! \brief Get 
	 */
	ForwardScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ForwardScrollingPagerDTO  paging);

private:
	std::list <OrdersStatsOrderDTO>orders;
	ForwardScrollingPagerDTO paging;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrdersStatsDTO_H_ */
