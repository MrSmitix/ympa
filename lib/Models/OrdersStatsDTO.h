
/*
 * OrdersStatsDTO.h
 *
 * Информация по заказам.
 */

#ifndef TINY_CPP_CLIENT_OrdersStatsDTO_H_
#define TINY_CPP_CLIENT_OrdersStatsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ForwardScrollingPagerDTO.h"
#include "OrdersStatsOrderDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация по заказам.
 *
 *  \ingroup Models
 *
 */

class OrdersStatsDTO{
public:

    /*! \brief Constructor.
	 */
    OrdersStatsDTO();
    OrdersStatsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrdersStatsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<OrdersStatsOrderDTO> orders;
    ForwardScrollingPagerDTO paging;
};
}

#endif /* TINY_CPP_CLIENT_OrdersStatsDTO_H_ */
