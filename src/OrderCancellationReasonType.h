/*
 * OrderCancellationReasonType.h
 *
 * Варианты причин, по которым заказ не может быть отменен.  * &#x60;ORDER_DELIVERED&#x60; — заказ уже доставлен. * &#x60;ORDER_IN_DELIVERY&#x60; — заказ уже у курьера. 
 */

#ifndef _OrderCancellationReasonType_H_
#define _OrderCancellationReasonType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Варианты причин, по которым заказ не может быть отменен.  * `ORDER_DELIVERED` — заказ уже доставлен. * `ORDER_IN_DELIVERY` — заказ уже у курьера. 
 *
 *  \ingroup Models
 *
 */

class OrderCancellationReasonType : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderCancellationReasonType();
	OrderCancellationReasonType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderCancellationReasonType();

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

#endif /* _OrderCancellationReasonType_H_ */
