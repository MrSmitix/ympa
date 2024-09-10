/*
 * OrdersStatsOrderPaymentType.h
 *
 * Тип оплаты заказа: - &#x60;CREDIT&#x60; — заказ оформлен в кредит. - &#x60;POSTPAID&#x60; — заказ оплачен после того, как был получен. - &#x60;PREPAID&#x60; — заказ оплачен до того, как был получен. 
 */

#ifndef _OrdersStatsOrderPaymentType_H_
#define _OrdersStatsOrderPaymentType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Тип оплаты заказа: - `CREDIT` — заказ оформлен в кредит. - `POSTPAID` — заказ оплачен после того, как был получен. - `PREPAID` — заказ оплачен до того, как был получен. 
 *
 *  \ingroup Models
 *
 */

class OrdersStatsOrderPaymentType : public Object {
public:
	/*! \brief Constructor.
	 */
	OrdersStatsOrderPaymentType();
	OrdersStatsOrderPaymentType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrdersStatsOrderPaymentType();

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

#endif /* _OrdersStatsOrderPaymentType_H_ */
