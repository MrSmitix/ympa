
/*
 * LicenseType.h
 *
 * Тип лицензии:  * &#x60;ALCOHOL&#x60; — лицензия на розничную продажу алкогольной продукции. 
 */

#ifndef TINY_CPP_CLIENT_LicenseType_H_
#define TINY_CPP_CLIENT_LicenseType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип лицензии:  * `ALCOHOL` — лицензия на розничную продажу алкогольной продукции. 
 *
 *  \ingroup Models
 *
 */

class LicenseType{
public:

    /*! \brief Constructor.
	 */
    LicenseType();
    LicenseType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LicenseType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_LicenseType_H_ */
