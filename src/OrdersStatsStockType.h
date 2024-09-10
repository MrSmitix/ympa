/*
 * OrdersStatsStockType.h
 *
 * Тип товара:  * &#x60;DEFECT&#x60; — товар бракованный.  * &#x60;FIT&#x60; — товар надлежащего качества. 
 */

#ifndef _OrdersStatsStockType_H_
#define _OrdersStatsStockType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Тип товара:  * `DEFECT` — товар бракованный.  * `FIT` — товар надлежащего качества. 
 *
 *  \ingroup Models
 *
 */

class OrdersStatsStockType : public Object {
public:
	/*! \brief Constructor.
	 */
	OrdersStatsStockType();
	OrdersStatsStockType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrdersStatsStockType();

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

#endif /* _OrdersStatsStockType_H_ */
