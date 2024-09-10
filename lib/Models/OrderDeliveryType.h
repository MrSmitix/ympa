
/*
 * OrderDeliveryType.h
 *
 * Способ доставки заказа:  * &#x60;DELIVERY&#x60; — курьерская доставка.  * &#x60;PICKUP&#x60; — самовывоз.  * &#x60;POST&#x60; — почта.  * &#x60;DIGITAL&#x60; — для цифровых товаров.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
 */

#ifndef TINY_CPP_CLIENT_OrderDeliveryType_H_
#define TINY_CPP_CLIENT_OrderDeliveryType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Способ доставки заказа:  * `DELIVERY` — курьерская доставка.  * `PICKUP` — самовывоз.  * `POST` — почта.  * `DIGITAL` — для цифровых товаров.  * `UNKNOWN` — неизвестный тип. 
 *
 *  \ingroup Models
 *
 */

class OrderDeliveryType{
public:

    /*! \brief Constructor.
	 */
    OrderDeliveryType();
    OrderDeliveryType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderDeliveryType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrderDeliveryType_H_ */
