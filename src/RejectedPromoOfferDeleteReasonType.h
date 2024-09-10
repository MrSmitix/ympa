/*
 * RejectedPromoOfferDeleteReasonType.h
 *
 * Описание ошибки:  * &#x60;OFFER_DOES_NOT_EXIST&#x60; — в кабинете нет товара с таким SKU. 
 */

#ifndef _RejectedPromoOfferDeleteReasonType_H_
#define _RejectedPromoOfferDeleteReasonType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Описание ошибки:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU. 
 *
 *  \ingroup Models
 *
 */

class RejectedPromoOfferDeleteReasonType : public Object {
public:
	/*! \brief Constructor.
	 */
	RejectedPromoOfferDeleteReasonType();
	RejectedPromoOfferDeleteReasonType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RejectedPromoOfferDeleteReasonType();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _RejectedPromoOfferDeleteReasonType_H_ */
