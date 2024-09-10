
/*
 * LanguageType.h
 *
 * Язык:  * &#x60;RU&#x60; — русский.  * &#x60;EN&#x60; — английский. 
 */

#ifndef TINY_CPP_CLIENT_LanguageType_H_
#define TINY_CPP_CLIENT_LanguageType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Язык:  * `RU` — русский.  * `EN` — английский. 
 *
 *  \ingroup Models
 *
 */

class LanguageType{
public:

    /*! \brief Constructor.
	 */
    LanguageType();
    LanguageType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LanguageType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_LanguageType_H_ */
