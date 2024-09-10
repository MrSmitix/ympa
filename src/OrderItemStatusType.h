/*
 * OrderItemStatusType.h
 *
 * Возвращенный или невыкупленный товар:  * &#x60;REJECTED&#x60; — невыкупленный.  * &#x60;RETURNED&#x60; — возвращенный. 
 */

#ifndef _OrderItemStatusType_H_
#define _OrderItemStatusType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Возвращенный или невыкупленный товар:  * `REJECTED` — невыкупленный.  * `RETURNED` — возвращенный. 
 *
 *  \ingroup Models
 *
 */

class OrderItemStatusType : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderItemStatusType();
	OrderItemStatusType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderItemStatusType();

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

#endif /* _OrderItemStatusType_H_ */
