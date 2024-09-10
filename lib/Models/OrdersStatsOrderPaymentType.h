
/*
 * OrdersStatsOrderPaymentType.h
 *
 * Тип оплаты заказа: - &#x60;CREDIT&#x60; — заказ оформлен в кредит. - &#x60;POSTPAID&#x60; — заказ оплачен после того, как был получен. - &#x60;PREPAID&#x60; — заказ оплачен до того, как был получен. 
 */

#ifndef TINY_CPP_CLIENT_OrdersStatsOrderPaymentType_H_
#define TINY_CPP_CLIENT_OrdersStatsOrderPaymentType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип оплаты заказа: - `CREDIT` — заказ оформлен в кредит. - `POSTPAID` — заказ оплачен после того, как был получен. - `PREPAID` — заказ оплачен до того, как был получен. 
 *
 *  \ingroup Models
 *
 */

class OrdersStatsOrderPaymentType{
public:

    /*! \brief Constructor.
	 */
    OrdersStatsOrderPaymentType();
    OrdersStatsOrderPaymentType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrdersStatsOrderPaymentType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrdersStatsOrderPaymentType_H_ */
