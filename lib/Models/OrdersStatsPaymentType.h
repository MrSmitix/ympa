
/*
 * OrdersStatsPaymentType.h
 *
 * Тип денежного перевода: - &#x60;PAYMENT&#x60; — оплата. - &#x60;REFUND&#x60; — возврат. 
 */

#ifndef TINY_CPP_CLIENT_OrdersStatsPaymentType_H_
#define TINY_CPP_CLIENT_OrdersStatsPaymentType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип денежного перевода: - `PAYMENT` — оплата. - `REFUND` — возврат. 
 *
 *  \ingroup Models
 *
 */

class OrdersStatsPaymentType{
public:

    /*! \brief Constructor.
	 */
    OrdersStatsPaymentType();
    OrdersStatsPaymentType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrdersStatsPaymentType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrdersStatsPaymentType_H_ */
