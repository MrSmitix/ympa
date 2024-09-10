
/*
 * OfferSellingProgramStatusType.h
 *
 * Информация о доступности или недоступности.  * &#x60;FINE&#x60; — доступно. * &#x60;REJECT&#x60; — недоступно. 
 */

#ifndef TINY_CPP_CLIENT_OfferSellingProgramStatusType_H_
#define TINY_CPP_CLIENT_OfferSellingProgramStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о доступности или недоступности.  * `FINE` — доступно. * `REJECT` — недоступно. 
 *
 *  \ingroup Models
 *
 */

class OfferSellingProgramStatusType{
public:

    /*! \brief Constructor.
	 */
    OfferSellingProgramStatusType();
    OfferSellingProgramStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferSellingProgramStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OfferSellingProgramStatusType_H_ */
