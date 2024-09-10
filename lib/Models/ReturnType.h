
/*
 * ReturnType.h
 *
 * Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
 */

#ifndef TINY_CPP_CLIENT_ReturnType_H_
#define TINY_CPP_CLIENT_ReturnType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
 *
 *  \ingroup Models
 *
 */

class ReturnType{
public:

    /*! \brief Constructor.
	 */
    ReturnType();
    ReturnType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ReturnType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ReturnType_H_ */
