/*
 * OrdersStatsItemStatusType.h
 *
 * Статус товара:  * &#x60;REJECTED&#x60; — товар был добавлен в созданный заказ, но не был оплачен. * &#x60;RETURNED&#x60; — товар вернули. 
 */

#ifndef _OrdersStatsItemStatusType_H_
#define _OrdersStatsItemStatusType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Статус товара:  * `REJECTED` — товар был добавлен в созданный заказ, но не был оплачен. * `RETURNED` — товар вернули. 
 *
 *  \ingroup Models
 *
 */

class OrdersStatsItemStatusType : public Object {
public:
	/*! \brief Constructor.
	 */
	OrdersStatsItemStatusType();
	OrdersStatsItemStatusType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrdersStatsItemStatusType();

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

#endif /* _OrdersStatsItemStatusType_H_ */
