
/*
 * PriceQuarantineVerdictParamNameType.h
 *
 * Имя параметра причины скрытия товара по цене.  * &#x60;CURRENT_PRICE&#x60; — цена, из-за которой товар попал в карантин. * &#x60;LAST_VALID_PRICE&#x60; — последняя цена до попадания в карантин (только для карантина типа &#x60;PRICE_CHANGE&#x60;). * &#x60;MIN_PRICE&#x60; — порог попадания в карантин (только для карантина типов &#x60;LOW_PRICE&#x60; и &#x60;LOW_PRICE_PROMO&#x60;). * &#x60;CURRENCY&#x60; — валюта. 
 */

#ifndef TINY_CPP_CLIENT_PriceQuarantineVerdictParamNameType_H_
#define TINY_CPP_CLIENT_PriceQuarantineVerdictParamNameType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Имя параметра причины скрытия товара по цене.  * `CURRENT_PRICE` — цена, из-за которой товар попал в карантин. * `LAST_VALID_PRICE` — последняя цена до попадания в карантин (только для карантина типа `PRICE_CHANGE`). * `MIN_PRICE` — порог попадания в карантин (только для карантина типов `LOW_PRICE` и `LOW_PRICE_PROMO`). * `CURRENCY` — валюта. 
 *
 *  \ingroup Models
 *
 */

class PriceQuarantineVerdictParamNameType{
public:

    /*! \brief Constructor.
	 */
    PriceQuarantineVerdictParamNameType();
    PriceQuarantineVerdictParamNameType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PriceQuarantineVerdictParamNameType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PriceQuarantineVerdictParamNameType_H_ */
