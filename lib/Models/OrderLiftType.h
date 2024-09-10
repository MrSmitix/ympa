
/*
 * OrderLiftType.h
 *
 * Тип подъема заказа на этаж:  * &#x60;NOT_NEEDED&#x60; — не требуется.  * &#x60;MANUAL&#x60; — ручной.  * &#x60;ELEVATOR&#x60; — лифт.  * &#x60;CARGO_ELEVATOR&#x60; — грузовой лифт.  * &#x60;FREE&#x60; — любой из перечисленных выше, если включена опция бесплатного подъема.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
 */

#ifndef TINY_CPP_CLIENT_OrderLiftType_H_
#define TINY_CPP_CLIENT_OrderLiftType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип подъема заказа на этаж:  * `NOT_NEEDED` — не требуется.  * `MANUAL` — ручной.  * `ELEVATOR` — лифт.  * `CARGO_ELEVATOR` — грузовой лифт.  * `FREE` — любой из перечисленных выше, если включена опция бесплатного подъема.  * `UNKNOWN` — неизвестный тип. 
 *
 *  \ingroup Models
 *
 */

class OrderLiftType{
public:

    /*! \brief Constructor.
	 */
    OrderLiftType();
    OrderLiftType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderLiftType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrderLiftType_H_ */
