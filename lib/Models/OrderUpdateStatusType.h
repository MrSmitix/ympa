
/*
 * OrderUpdateStatusType.h
 *
 * Изменился ли статус заказа:  * &#x60;OK&#x60; — статус изменен.  * &#x60;ERROR&#x60; — статус не изменен. В этом случае появится сообщение об ошибке в параметре &#x60;errorDetails&#x60;. 
 */

#ifndef TINY_CPP_CLIENT_OrderUpdateStatusType_H_
#define TINY_CPP_CLIENT_OrderUpdateStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Изменился ли статус заказа:  * `OK` — статус изменен.  * `ERROR` — статус не изменен. В этом случае появится сообщение об ошибке в параметре `errorDetails`. 
 *
 *  \ingroup Models
 *
 */

class OrderUpdateStatusType{
public:

    /*! \brief Constructor.
	 */
    OrderUpdateStatusType();
    OrderUpdateStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderUpdateStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrderUpdateStatusType_H_ */
