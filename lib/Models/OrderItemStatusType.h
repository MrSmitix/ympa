
/*
 * OrderItemStatusType.h
 *
 * Возвращенный или невыкупленный товар:  * &#x60;REJECTED&#x60; — невыкупленный.  * &#x60;RETURNED&#x60; — возвращенный. 
 */

#ifndef TINY_CPP_CLIENT_OrderItemStatusType_H_
#define TINY_CPP_CLIENT_OrderItemStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Возвращенный или невыкупленный товар:  * `REJECTED` — невыкупленный.  * `RETURNED` — возвращенный. 
 *
 *  \ingroup Models
 *
 */

class OrderItemStatusType{
public:

    /*! \brief Constructor.
	 */
    OrderItemStatusType();
    OrderItemStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderItemStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrderItemStatusType_H_ */
