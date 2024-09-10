
/*
 * FeedbackDeliveryType.h
 *
 * Способ покупки, указанный в отзыве:  * &#x60;DELIVERY&#x60; — доставка. * &#x60;PICKUP&#x60; — самовывоз. * &#x60;INSTORE&#x60; — в магазине. 
 */

#ifndef TINY_CPP_CLIENT_FeedbackDeliveryType_H_
#define TINY_CPP_CLIENT_FeedbackDeliveryType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Способ покупки, указанный в отзыве:  * `DELIVERY` — доставка. * `PICKUP` — самовывоз. * `INSTORE` — в магазине. 
 *
 *  \ingroup Models
 *
 */

class FeedbackDeliveryType{
public:

    /*! \brief Constructor.
	 */
    FeedbackDeliveryType();
    FeedbackDeliveryType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedbackDeliveryType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_FeedbackDeliveryType_H_ */
