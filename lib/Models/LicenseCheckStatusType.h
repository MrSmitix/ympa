
/*
 * LicenseCheckStatusType.h
 *
 * Статус проверки лицензии:  * &#x60;NEW&#x60; — лицензия проверяется. * &#x60;SUCCESS&#x60; — лицензия прошла проверку. * &#x60;FAIL&#x60; — лицензия не прошла проверку. 
 */

#ifndef TINY_CPP_CLIENT_LicenseCheckStatusType_H_
#define TINY_CPP_CLIENT_LicenseCheckStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Статус проверки лицензии:  * `NEW` — лицензия проверяется. * `SUCCESS` — лицензия прошла проверку. * `FAIL` — лицензия не прошла проверку. 
 *
 *  \ingroup Models
 *
 */

class LicenseCheckStatusType{
public:

    /*! \brief Constructor.
	 */
    LicenseCheckStatusType();
    LicenseCheckStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LicenseCheckStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_LicenseCheckStatusType_H_ */
