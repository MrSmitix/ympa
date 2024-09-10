
/*
 * UpdateOrderStatusResponse.h
 *
 * Информация об изменении статуса заказа.
 */

#ifndef TINY_CPP_CLIENT_UpdateOrderStatusResponse_H_
#define TINY_CPP_CLIENT_UpdateOrderStatusResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderDTO.h"

namespace Tiny {


/*! \brief Информация об изменении статуса заказа.
 *
 *  \ingroup Models
 *
 */

class UpdateOrderStatusResponse{
public:

    /*! \brief Constructor.
	 */
    UpdateOrderStatusResponse();
    UpdateOrderStatusResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateOrderStatusResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OrderDTO getOrder();

	/*! \brief Set 
	 */
	void setOrder(OrderDTO  order);


    private:
    OrderDTO order;
};
}

#endif /* TINY_CPP_CLIENT_UpdateOrderStatusResponse_H_ */
