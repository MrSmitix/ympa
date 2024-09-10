
/*
 * SellingProgramType.h
 *
 * Модель размещения:  * &#x60;FBY&#x60; — FBY. * &#x60;FBS&#x60; — FBS. * &#x60;DBS&#x60; — DBS. * &#x60;EXPRESS&#x60; — Экспресс. 
 */

#ifndef TINY_CPP_CLIENT_SellingProgramType_H_
#define TINY_CPP_CLIENT_SellingProgramType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Модель размещения:  * `FBY` — FBY. * `FBS` — FBS. * `DBS` — DBS. * `EXPRESS` — Экспресс. 
 *
 *  \ingroup Models
 *
 */

class SellingProgramType{
public:

    /*! \brief Constructor.
	 */
    SellingProgramType();
    SellingProgramType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SellingProgramType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_SellingProgramType_H_ */
