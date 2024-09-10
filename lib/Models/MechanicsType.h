
/*
 * MechanicsType.h
 *
 * Тип акции:  * &#x60;DIRECT_DISCOUNT&#x60; — прямая скидка.  * &#x60;BLUE_FLASH&#x60; — флеш-акция.  * &#x60;MARKET_PROMOCODE&#x60; — скидка по промокоду. 
 */

#ifndef TINY_CPP_CLIENT_MechanicsType_H_
#define TINY_CPP_CLIENT_MechanicsType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип акции:  * `DIRECT_DISCOUNT` — прямая скидка.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_PROMOCODE` — скидка по промокоду. 
 *
 *  \ingroup Models
 *
 */

class MechanicsType{
public:

    /*! \brief Constructor.
	 */
    MechanicsType();
    MechanicsType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MechanicsType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_MechanicsType_H_ */
