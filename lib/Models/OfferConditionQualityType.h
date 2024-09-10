
/*
 * OfferConditionQualityType.h
 *
 * Внешний вид товара:  * &#x60;PERFECT&#x60; — идеальный. * &#x60;EXCELLENT&#x60; — отличный. * &#x60;GOOD&#x60; — хороший. * &#x60;NOT_SPECIFIED&#x60; — не выбран. 
 */

#ifndef TINY_CPP_CLIENT_OfferConditionQualityType_H_
#define TINY_CPP_CLIENT_OfferConditionQualityType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Внешний вид товара:  * `PERFECT` — идеальный. * `EXCELLENT` — отличный. * `GOOD` — хороший. * `NOT_SPECIFIED` — не выбран. 
 *
 *  \ingroup Models
 *
 */

class OfferConditionQualityType{
public:

    /*! \brief Constructor.
	 */
    OfferConditionQualityType();
    OfferConditionQualityType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferConditionQualityType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_OfferConditionQualityType_H_ */
