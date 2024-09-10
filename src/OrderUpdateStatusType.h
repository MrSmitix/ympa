/*
 * OrderUpdateStatusType.h
 *
 * Изменился ли статус заказа:  * &#x60;OK&#x60; — статус изменен.  * &#x60;ERROR&#x60; — статус не изменен. В этом случае появится сообщение об ошибке в параметре &#x60;errorDetails&#x60;. 
 */

#ifndef _OrderUpdateStatusType_H_
#define _OrderUpdateStatusType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Изменился ли статус заказа:  * `OK` — статус изменен.  * `ERROR` — статус не изменен. В этом случае появится сообщение об ошибке в параметре `errorDetails`. 
 *
 *  \ingroup Models
 *
 */

class OrderUpdateStatusType : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderUpdateStatusType();
	OrderUpdateStatusType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderUpdateStatusType();

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

#endif /* _OrderUpdateStatusType_H_ */
