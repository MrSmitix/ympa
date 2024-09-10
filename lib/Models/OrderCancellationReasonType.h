
/*
 * OrderCancellationReasonType.h
 *
 * Варианты причин, по которым заказ не может быть отменен.  * &#x60;ORDER_DELIVERED&#x60; — заказ уже доставлен. * &#x60;ORDER_IN_DELIVERY&#x60; — заказ уже у курьера. 
 */

#ifndef TINY_CPP_CLIENT_OrderCancellationReasonType_H_
#define TINY_CPP_CLIENT_OrderCancellationReasonType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Варианты причин, по которым заказ не может быть отменен.  * `ORDER_DELIVERED` — заказ уже доставлен. * `ORDER_IN_DELIVERY` — заказ уже у курьера. 
 *
 *  \ingroup Models
 *
 */

class OrderCancellationReasonType{
public:

    /*! \brief Constructor.
	 */
    OrderCancellationReasonType();
    OrderCancellationReasonType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderCancellationReasonType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrderCancellationReasonType_H_ */
