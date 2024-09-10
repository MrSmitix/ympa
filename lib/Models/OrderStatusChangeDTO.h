
/*
 * OrderStatusChangeDTO.h
 *
 * Заказ.
 */

#ifndef TINY_CPP_CLIENT_OrderStatusChangeDTO_H_
#define TINY_CPP_CLIENT_OrderStatusChangeDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderStatusChangeDeliveryDTO.h"
#include "OrderStatusType.h"
#include "OrderSubstatusType.h"

namespace Tiny {


/*! \brief Заказ.
 *
 *  \ingroup Models
 *
 */

class OrderStatusChangeDTO{
public:

    /*! \brief Constructor.
	 */
    OrderStatusChangeDTO();
    OrderStatusChangeDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderStatusChangeDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OrderStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(OrderStatusType  status);
	/*! \brief Get 
	 */
	OrderSubstatusType getSubstatus();

	/*! \brief Set 
	 */
	void setSubstatus(OrderSubstatusType  substatus);
	/*! \brief Get 
	 */
	OrderStatusChangeDeliveryDTO getDelivery();

	/*! \brief Set 
	 */
	void setDelivery(OrderStatusChangeDeliveryDTO  delivery);


    private:
    OrderStatusType status;
    OrderSubstatusType substatus;
    OrderStatusChangeDeliveryDTO delivery;
};
}

#endif /* TINY_CPP_CLIENT_OrderStatusChangeDTO_H_ */
