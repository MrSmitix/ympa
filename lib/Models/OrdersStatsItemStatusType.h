
/*
 * OrdersStatsItemStatusType.h
 *
 * Статус товара:  * &#x60;REJECTED&#x60; — товар был добавлен в созданный заказ, но не был оплачен. * &#x60;RETURNED&#x60; — товар вернули. 
 */

#ifndef TINY_CPP_CLIENT_OrdersStatsItemStatusType_H_
#define TINY_CPP_CLIENT_OrdersStatsItemStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Статус товара:  * `REJECTED` — товар был добавлен в созданный заказ, но не был оплачен. * `RETURNED` — товар вернули. 
 *
 *  \ingroup Models
 *
 */

class OrdersStatsItemStatusType{
public:

    /*! \brief Constructor.
	 */
    OrdersStatsItemStatusType();
    OrdersStatsItemStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrdersStatsItemStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrdersStatsItemStatusType_H_ */
