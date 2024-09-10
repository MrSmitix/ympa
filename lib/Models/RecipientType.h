
/*
 * RecipientType.h
 *
 * Способ возврата товара покупателем:  * &#x60;SHOP&#x60; — в точку возврата магазина.  * &#x60;DELIVERY_SERVICE&#x60; — отправить курьером.  * &#x60;POST&#x60; — почта. 
 */

#ifndef TINY_CPP_CLIENT_RecipientType_H_
#define TINY_CPP_CLIENT_RecipientType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Способ возврата товара покупателем:  * `SHOP` — в точку возврата магазина.  * `DELIVERY_SERVICE` — отправить курьером.  * `POST` — почта. 
 *
 *  \ingroup Models
 *
 */

class RecipientType{
public:

    /*! \brief Constructor.
	 */
    RecipientType();
    RecipientType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RecipientType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_RecipientType_H_ */
