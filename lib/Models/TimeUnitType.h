
/*
 * TimeUnitType.h
 *
 * Единица измерения времени:  * &#x60;HOUR&#x60; — час. * &#x60;DAY&#x60; — сутки. * &#x60;WEEK&#x60; — неделя. * &#x60;MONTH&#x60; — месяц. * &#x60;YEAR&#x60; — год. 
 */

#ifndef TINY_CPP_CLIENT_TimeUnitType_H_
#define TINY_CPP_CLIENT_TimeUnitType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Единица измерения времени:  * `HOUR` — час. * `DAY` — сутки. * `WEEK` — неделя. * `MONTH` — месяц. * `YEAR` — год. 
 *
 *  \ingroup Models
 *
 */

class TimeUnitType{
public:

    /*! \brief Constructor.
	 */
    TimeUnitType();
    TimeUnitType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TimeUnitType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_TimeUnitType_H_ */
