/*
 * UpdateOrderStatusRequest.h
 *
 * 
 */

#ifndef _UpdateOrderStatusRequest_H_
#define _UpdateOrderStatusRequest_H_


#include <string>
#include "OrderStatusChangeDTO.h"
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

class UpdateOrderStatusRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateOrderStatusRequest();
	UpdateOrderStatusRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateOrderStatusRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OrderStatusChangeDTO getOrder();

	/*! \brief Set 
	 */
	void setOrder(OrderStatusChangeDTO  order);

private:
	OrderStatusChangeDTO order;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateOrderStatusRequest_H_ */
