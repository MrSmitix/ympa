
/*
 * DayOfWeekType.h
 *
 * День недели:  * &#x60;MONDAY&#x60; — понедельник. * &#x60;TUESDAY&#x60; — вторник. * &#x60;WEDNESDAY&#x60; — среда. * &#x60;THURSDAY&#x60; — четверг. * &#x60;FRIDAY&#x60; — пятница. * &#x60;SATURDAY&#x60; — суббота. * &#x60;SUNDAY&#x60; — воскресенье. 
 */

#ifndef TINY_CPP_CLIENT_DayOfWeekType_H_
#define TINY_CPP_CLIENT_DayOfWeekType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief День недели:  * `MONDAY` — понедельник. * `TUESDAY` — вторник. * `WEDNESDAY` — среда. * `THURSDAY` — четверг. * `FRIDAY` — пятница. * `SATURDAY` — суббота. * `SUNDAY` — воскресенье. 
 *
 *  \ingroup Models
 *
 */

class DayOfWeekType{
public:

    /*! \brief Constructor.
	 */
    DayOfWeekType();
    DayOfWeekType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DayOfWeekType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_DayOfWeekType_H_ */
