
/*
 * RejectedPromoOfferDeleteReasonType.h
 *
 * Описание ошибки:  * &#x60;OFFER_DOES_NOT_EXIST&#x60; — в кабинете нет товара с таким SKU. 
 */

#ifndef TINY_CPP_CLIENT_RejectedPromoOfferDeleteReasonType_H_
#define TINY_CPP_CLIENT_RejectedPromoOfferDeleteReasonType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Описание ошибки:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU. 
 *
 *  \ingroup Models
 *
 */

class RejectedPromoOfferDeleteReasonType{
public:

    /*! \brief Constructor.
	 */
    RejectedPromoOfferDeleteReasonType();
    RejectedPromoOfferDeleteReasonType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RejectedPromoOfferDeleteReasonType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_RejectedPromoOfferDeleteReasonType_H_ */
