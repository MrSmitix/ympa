/*
 * SetOrderDeliveryDateRequest.h
 *
 * 
 */

#ifndef _SetOrderDeliveryDateRequest_H_
#define _SetOrderDeliveryDateRequest_H_


#include <string>
#include "OrderDeliveryDateDTO.h"
#include "OrderDeliveryDateReasonType.h"
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

class SetOrderDeliveryDateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	SetOrderDeliveryDateRequest();
	SetOrderDeliveryDateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SetOrderDeliveryDateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OrderDeliveryDateDTO getDates();

	/*! \brief Set 
	 */
	void setDates(OrderDeliveryDateDTO  dates);
	/*! \brief Get 
	 */
	OrderDeliveryDateReasonType getReason();

	/*! \brief Set 
	 */
	void setReason(OrderDeliveryDateReasonType  reason);

private:
	OrderDeliveryDateDTO dates;
	OrderDeliveryDateReasonType reason;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SetOrderDeliveryDateRequest_H_ */
