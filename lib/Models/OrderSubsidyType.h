
/*
 * OrderSubsidyType.h
 *
 * Тип субсидии:  * &#x60;YANDEX_CASHBACK&#x60; — скидка по подписке Яндекс Плюс.  * &#x60;SUBSIDY&#x60; — скидка Маркета (по акциям, промокодам, купонам и т. д.)  * &#x60;DELIVERY&#x60; — скидка за доставку (DBS). 
 */

#ifndef TINY_CPP_CLIENT_OrderSubsidyType_H_
#define TINY_CPP_CLIENT_OrderSubsidyType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип субсидии:  * `YANDEX_CASHBACK` — скидка по подписке Яндекс Плюс.  * `SUBSIDY` — скидка Маркета (по акциям, промокодам, купонам и т. д.)  * `DELIVERY` — скидка за доставку (DBS). 
 *
 *  \ingroup Models
 *
 */

class OrderSubsidyType{
public:

    /*! \brief Constructor.
	 */
    OrderSubsidyType();
    OrderSubsidyType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderSubsidyType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrderSubsidyType_H_ */
