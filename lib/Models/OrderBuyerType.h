
/*
 * OrderBuyerType.h
 *
 * Тип покупателя:  * &#x60;PERSON&#x60; — физическое лицо.  * &#x60;BUSINESS&#x60; — организация. 
 */

#ifndef TINY_CPP_CLIENT_OrderBuyerType_H_
#define TINY_CPP_CLIENT_OrderBuyerType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип покупателя:  * `PERSON` — физическое лицо.  * `BUSINESS` — организация. 
 *
 *  \ingroup Models
 *
 */

class OrderBuyerType{
public:

    /*! \brief Constructor.
	 */
    OrderBuyerType();
    OrderBuyerType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderBuyerType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrderBuyerType_H_ */
