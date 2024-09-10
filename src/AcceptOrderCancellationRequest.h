/*
 * AcceptOrderCancellationRequest.h
 *
 * 
 */

#ifndef _AcceptOrderCancellationRequest_H_
#define _AcceptOrderCancellationRequest_H_


#include <string>
#include "OrderCancellationReasonType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AcceptOrderCancellationRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	AcceptOrderCancellationRequest();
	AcceptOrderCancellationRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AcceptOrderCancellationRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. 
	 */
	bool getAccepted();

	/*! \brief Set Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. 
	 */
	void setAccepted(bool  accepted);
	/*! \brief Get 
	 */
	OrderCancellationReasonType getReason();

	/*! \brief Set 
	 */
	void setReason(OrderCancellationReasonType  reason);

private:
	bool accepted;
	OrderCancellationReasonType reason;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AcceptOrderCancellationRequest_H_ */
