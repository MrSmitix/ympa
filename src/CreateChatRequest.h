/*
 * CreateChatRequest.h
 *
 * Заказ, для которого нужно создать чат. 
 */

#ifndef _CreateChatRequest_H_
#define _CreateChatRequest_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Заказ, для которого нужно создать чат. 
 *
 *  \ingroup Models
 *
 */

class CreateChatRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateChatRequest();
	CreateChatRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateChatRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор заказа на Маркете.
	 */
	long long getOrderId();

	/*! \brief Set Идентификатор заказа на Маркете.
	 */
	void setOrderId(long long  orderId);

private:
	long long orderId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateChatRequest_H_ */
