
/*
 * OrderStatusChangeDeliveryDTO.h
 *
 * Информация о доставке.
 */

#ifndef TINY_CPP_CLIENT_OrderStatusChangeDeliveryDTO_H_
#define TINY_CPP_CLIENT_OrderStatusChangeDeliveryDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderStatusChangeDeliveryDatesDTO.h"

namespace Tiny {


/*! \brief Информация о доставке.
 *
 *  \ingroup Models
 *
 */

class OrderStatusChangeDeliveryDTO{
public:

    /*! \brief Constructor.
	 */
    OrderStatusChangeDeliveryDTO();
    OrderStatusChangeDeliveryDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderStatusChangeDeliveryDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OrderStatusChangeDeliveryDatesDTO getDates();

	/*! \brief Set 
	 */
	void setDates(OrderStatusChangeDeliveryDatesDTO  dates);


    private:
    OrderStatusChangeDeliveryDatesDTO dates;
};
}

#endif /* TINY_CPP_CLIENT_OrderStatusChangeDeliveryDTO_H_ */
