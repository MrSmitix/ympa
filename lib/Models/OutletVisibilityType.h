
/*
 * OutletVisibilityType.h
 *
 * Состояние точки продаж.  Возможные значения:  * &#x60;HIDDEN&#x60; — точка продаж выключена. * &#x60;VISIBLE&#x60; — точка продаж включена. 
 */

#ifndef TINY_CPP_CLIENT_OutletVisibilityType_H_
#define TINY_CPP_CLIENT_OutletVisibilityType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Состояние точки продаж.  Возможные значения:  * `HIDDEN` — точка продаж выключена. * `VISIBLE` — точка продаж включена. 
 *
 *  \ingroup Models
 *
 */

class OutletVisibilityType{
public:

    /*! \brief Constructor.
	 */
    OutletVisibilityType();
    OutletVisibilityType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OutletVisibilityType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OutletVisibilityType_H_ */
