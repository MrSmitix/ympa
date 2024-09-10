
/*
 * OrderPaymentType.h
 *
 * Тип оплаты заказа:  * &#x60;PREPAID&#x60; — оплата при оформлении заказа.  * &#x60;POSTPAID&#x60; — оплата при получении заказа.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  Если параметр отсутствует, заказ будет оплачен при получении. 
 */

#ifndef TINY_CPP_CLIENT_OrderPaymentType_H_
#define TINY_CPP_CLIENT_OrderPaymentType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип оплаты заказа:  * `PREPAID` — оплата при оформлении заказа.  * `POSTPAID` — оплата при получении заказа.  * `UNKNOWN` — неизвестный тип.  Если параметр отсутствует, заказ будет оплачен при получении. 
 *
 *  \ingroup Models
 *
 */

class OrderPaymentType{
public:

    /*! \brief Constructor.
	 */
    OrderPaymentType();
    OrderPaymentType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderPaymentType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrderPaymentType_H_ */
