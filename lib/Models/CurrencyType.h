
/*
 * CurrencyType.h
 *
 * Коды валют. Возможные значения: * &#x60;BYR&#x60; — белорусский рубль. * &#x60;KZT&#x60; — казахстанский тенге. * &#x60;RUR&#x60; — российский рубль. * &#x60;UAH&#x60; — украинская гривна. 
 */

#ifndef TINY_CPP_CLIENT_CurrencyType_H_
#define TINY_CPP_CLIENT_CurrencyType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Коды валют. Возможные значения: * `BYR` — белорусский рубль. * `KZT` — казахстанский тенге. * `RUR` — российский рубль. * `UAH` — украинская гривна. 
 *
 *  \ingroup Models
 *
 */

class CurrencyType{
public:

    /*! \brief Constructor.
	 */
    CurrencyType();
    CurrencyType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CurrencyType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CurrencyType_H_ */
