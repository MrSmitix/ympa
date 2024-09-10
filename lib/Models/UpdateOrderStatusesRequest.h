
/*
 * UpdateOrderStatusesRequest.h
 *
 * Список заказов.
 */

#ifndef TINY_CPP_CLIENT_UpdateOrderStatusesRequest_H_
#define TINY_CPP_CLIENT_UpdateOrderStatusesRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderStateDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список заказов.
 *
 *  \ingroup Models
 *
 */

class UpdateOrderStatusesRequest{
public:

    /*! \brief Constructor.
	 */
    UpdateOrderStatusesRequest();
    UpdateOrderStatusesRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateOrderStatusesRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список заказов.
	 */
	std::list<OrderStateDTO> getOrders();

	/*! \brief Set Список заказов.
	 */
	void setOrders(std::list <OrderStateDTO> orders);


    private:
    std::list<OrderStateDTO> orders;
};
}

#endif /* TINY_CPP_CLIENT_UpdateOrderStatusesRequest_H_ */
