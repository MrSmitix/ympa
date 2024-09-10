/*
 * OrdersStatsPaymentType.h
 *
 * Тип денежного перевода: - &#x60;PAYMENT&#x60; — оплата. - &#x60;REFUND&#x60; — возврат. 
 */

#ifndef _OrdersStatsPaymentType_H_
#define _OrdersStatsPaymentType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Тип денежного перевода: - `PAYMENT` — оплата. - `REFUND` — возврат. 
 *
 *  \ingroup Models
 *
 */

class OrdersStatsPaymentType : public Object {
public:
	/*! \brief Constructor.
	 */
	OrdersStatsPaymentType();
	OrdersStatsPaymentType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrdersStatsPaymentType();

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

#endif /* _OrdersStatsPaymentType_H_ */
