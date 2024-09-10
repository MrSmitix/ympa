
/*
 * OrdersStatsPaymentSourceType.h
 *
 * Способ денежного перевода: - &#x60;BUYER&#x60; — оплата или возврат деньгами. - &#x60;CASHBACK&#x60; — оплата или возврат баллами Плюса. - &#x60;MARKETPLACE&#x60; — оплата или возврат купонами. - &#x60;SPLIT&#x60; — оплата картой по частям (Сплит). 
 */

#ifndef TINY_CPP_CLIENT_OrdersStatsPaymentSourceType_H_
#define TINY_CPP_CLIENT_OrdersStatsPaymentSourceType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Способ денежного перевода: - `BUYER` — оплата или возврат деньгами. - `CASHBACK` — оплата или возврат баллами Плюса. - `MARKETPLACE` — оплата или возврат купонами. - `SPLIT` — оплата картой по частям (Сплит). 
 *
 *  \ingroup Models
 *
 */

class OrdersStatsPaymentSourceType{
public:

    /*! \brief Constructor.
	 */
    OrdersStatsPaymentSourceType();
    OrdersStatsPaymentSourceType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrdersStatsPaymentSourceType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrdersStatsPaymentSourceType_H_ */
