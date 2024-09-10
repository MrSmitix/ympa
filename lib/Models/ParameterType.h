
/*
 * ParameterType.h
 *
 * Тип данных:  * &#x60;TEXT&#x60; — текст. * &#x60;ENUM&#x60; — список возможных значений. * &#x60;BOOLEAN&#x60; — &#x60;true&#x60; или &#x60;false&#x60;. * &#x60;NUMERIC&#x60; — число. 
 */

#ifndef TINY_CPP_CLIENT_ParameterType_H_
#define TINY_CPP_CLIENT_ParameterType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип данных:  * `TEXT` — текст. * `ENUM` — список возможных значений. * `BOOLEAN` — `true` или `false`. * `NUMERIC` — число. 
 *
 *  \ingroup Models
 *
 */

class ParameterType{
public:

    /*! \brief Constructor.
	 */
    ParameterType();
    ParameterType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ParameterType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ParameterType_H_ */
