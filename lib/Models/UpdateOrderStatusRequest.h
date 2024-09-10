
/*
 * UpdateOrderStatusRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdateOrderStatusRequest_H_
#define TINY_CPP_CLIENT_UpdateOrderStatusRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderStatusChangeDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdateOrderStatusRequest{
public:

    /*! \brief Constructor.
	 */
    UpdateOrderStatusRequest();
    UpdateOrderStatusRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateOrderStatusRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OrderStatusChangeDTO getOrder();

	/*! \brief Set 
	 */
	void setOrder(OrderStatusChangeDTO  order);


    private:
    OrderStatusChangeDTO order;
};
}

#endif /* TINY_CPP_CLIENT_UpdateOrderStatusRequest_H_ */
