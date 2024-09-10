/*
 * GetOrderResponse.h
 *
 * 
 */

#ifndef _GetOrderResponse_H_
#define _GetOrderResponse_H_


#include <string>
#include "OrderDTO.h"
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

class GetOrderResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetOrderResponse();
	GetOrderResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetOrderResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OrderDTO getOrder();

	/*! \brief Set 
	 */
	void setOrder(OrderDTO  order);

private:
	OrderDTO order;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetOrderResponse_H_ */
