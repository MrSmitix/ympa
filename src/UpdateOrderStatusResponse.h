/*
 * UpdateOrderStatusResponse.h
 *
 * Информация об изменении статуса заказа.
 */

#ifndef _UpdateOrderStatusResponse_H_
#define _UpdateOrderStatusResponse_H_


#include <string>
#include "OrderDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об изменении статуса заказа.
 *
 *  \ingroup Models
 *
 */

class UpdateOrderStatusResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateOrderStatusResponse();
	UpdateOrderStatusResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateOrderStatusResponse();

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

#endif /* _UpdateOrderStatusResponse_H_ */
