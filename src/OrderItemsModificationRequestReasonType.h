/*
 * OrderItemsModificationRequestReasonType.h
 *
 * Причина обновления состава заказа.
 */

#ifndef _OrderItemsModificationRequestReasonType_H_
#define _OrderItemsModificationRequestReasonType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Причина обновления состава заказа.
 *
 *  \ingroup Models
 *
 */

class OrderItemsModificationRequestReasonType : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderItemsModificationRequestReasonType();
	OrderItemsModificationRequestReasonType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderItemsModificationRequestReasonType();

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

#endif /* _OrderItemsModificationRequestReasonType_H_ */
