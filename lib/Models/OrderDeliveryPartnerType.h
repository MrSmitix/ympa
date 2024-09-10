
/*
 * OrderDeliveryPartnerType.h
 *
 * Тип сотрудничества со службой доставки в рамках конкретного заказа:  * &#x60;SHOP&#x60; — магазин работает со службой доставки напрямую или доставляет заказы самостоятельно.  * &#x60;YANDEX_MARKET&#x60; — магазин работает со службой доставки через Маркет.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
 */

#ifndef TINY_CPP_CLIENT_OrderDeliveryPartnerType_H_
#define TINY_CPP_CLIENT_OrderDeliveryPartnerType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип сотрудничества со службой доставки в рамках конкретного заказа:  * `SHOP` — магазин работает со службой доставки напрямую или доставляет заказы самостоятельно.  * `YANDEX_MARKET` — магазин работает со службой доставки через Маркет.  * `UNKNOWN` — неизвестный тип. 
 *
 *  \ingroup Models
 *
 */

class OrderDeliveryPartnerType{
public:

    /*! \brief Constructor.
	 */
    OrderDeliveryPartnerType();
    OrderDeliveryPartnerType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderDeliveryPartnerType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrderDeliveryPartnerType_H_ */
