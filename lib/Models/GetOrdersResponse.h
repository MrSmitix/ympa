
/*
 * GetOrdersResponse.h
 *
 * Модель для ответа API списка информации по заказам.
 */

#ifndef TINY_CPP_CLIENT_GetOrdersResponse_H_
#define TINY_CPP_CLIENT_GetOrdersResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FlippingPagerDTO.h"
#include "ForwardScrollingPagerDTO.h"
#include "OrderDTO.h"
#include <list>

namespace Tiny {


/*! \brief Модель для ответа API списка информации по заказам.
 *
 *  \ingroup Models
 *
 */

class GetOrdersResponse{
public:

    /*! \brief Constructor.
	 */
    GetOrdersResponse();
    GetOrdersResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetOrdersResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<OrderDTO> orders;
    ForwardScrollingPagerDTO paging;
};
}

#endif /* TINY_CPP_CLIENT_GetOrdersResponse_H_ */
