
/*
 * OrderItemInstanceType.h
 *
 * Вид маркировки товара:  * &#x60;CIS&#x60; — КИЗ, идентификатор единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  * &#x60;UIN&#x60; — УИН, уникальный идентификационный номер.  * &#x60;RNPT&#x60; — РНПТ, регистрационный номер партии товара.  * &#x60;GTD&#x60; — номер ГТД, грузовой таможенной декларации. 
 */

#ifndef TINY_CPP_CLIENT_OrderItemInstanceType_H_
#define TINY_CPP_CLIENT_OrderItemInstanceType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Вид маркировки товара:  * `CIS` — КИЗ, идентификатор единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  * `UIN` — УИН, уникальный идентификационный номер.  * `RNPT` — РНПТ, регистрационный номер партии товара.  * `GTD` — номер ГТД, грузовой таможенной декларации. 
 *
 *  \ingroup Models
 *
 */

class OrderItemInstanceType{
public:

    /*! \brief Constructor.
	 */
    OrderItemInstanceType();
    OrderItemInstanceType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderItemInstanceType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OrderItemInstanceType_H_ */
