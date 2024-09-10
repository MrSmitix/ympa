
/*
 * OrderDeliveryEacType.h
 *
 * Тип кода подтверждения ЭАПП:  * &#x60;MERCHANT_TO_COURIER&#x60; — продавец передает код курьеру.  * &#x60;COURIER_TO_MERCHANT&#x60; — курьер передает код продавцу.  * &#x60;CHECKING_BY_MERCHANT&#x60; — продавец проверяет код на своей стороне. 
 */

#ifndef TINY_CPP_CLIENT_OrderDeliveryEacType_H_
#define TINY_CPP_CLIENT_OrderDeliveryEacType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип кода подтверждения ЭАПП:  * `MERCHANT_TO_COURIER` — продавец передает код курьеру.  * `COURIER_TO_MERCHANT` — курьер передает код продавцу.  * `CHECKING_BY_MERCHANT` — продавец проверяет код на своей стороне. 
 *
 *  \ingroup Models
 *
 */

class OrderDeliveryEacType{
public:

    /*! \brief Constructor.
	 */
    OrderDeliveryEacType();
    OrderDeliveryEacType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderDeliveryEacType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrderDeliveryEacType_H_ */
