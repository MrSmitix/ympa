/*
 * FeedbackDeliveryType.h
 *
 * Способ покупки, указанный в отзыве:  * &#x60;DELIVERY&#x60; — доставка. * &#x60;PICKUP&#x60; — самовывоз. * &#x60;INSTORE&#x60; — в магазине. 
 */

#ifndef _FeedbackDeliveryType_H_
#define _FeedbackDeliveryType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Способ покупки, указанный в отзыве:  * `DELIVERY` — доставка. * `PICKUP` — самовывоз. * `INSTORE` — в магазине. 
 *
 *  \ingroup Models
 *
 */

class FeedbackDeliveryType : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedbackDeliveryType();
	FeedbackDeliveryType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedbackDeliveryType();

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

#endif /* _FeedbackDeliveryType_H_ */
