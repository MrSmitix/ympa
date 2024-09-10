
/*
 * AgeUnitType.h
 *
 * Единицы измерения возраста:  * &#x60;YEAR&#x60; — год. * &#x60;MONTH&#x60; — месяц. 
 */

#ifndef TINY_CPP_CLIENT_AgeUnitType_H_
#define TINY_CPP_CLIENT_AgeUnitType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Единицы измерения возраста:  * `YEAR` — год. * `MONTH` — месяц. 
 *
 *  \ingroup Models
 *
 */

class AgeUnitType{
public:

    /*! \brief Constructor.
	 */
    AgeUnitType();
    AgeUnitType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AgeUnitType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AgeUnitType_H_ */
