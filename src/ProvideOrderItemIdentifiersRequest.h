/*
 * ProvideOrderItemIdentifiersRequest.h
 *
 * 
 */

#ifndef _ProvideOrderItemIdentifiersRequest_H_
#define _ProvideOrderItemIdentifiersRequest_H_


#include <string>
#include "OrderItemInstanceModificationDTO.h"
#include <list>
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

class ProvideOrderItemIdentifiersRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	ProvideOrderItemIdentifiersRequest();
	ProvideOrderItemIdentifiersRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProvideOrderItemIdentifiersRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список позиций, требующих маркировки. 
	 */
	std::list<OrderItemInstanceModificationDTO> getItems();

	/*! \brief Set Список позиций, требующих маркировки. 
	 */
	void setItems(std::list <OrderItemInstanceModificationDTO> items);

private:
	std::list <OrderItemInstanceModificationDTO>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProvideOrderItemIdentifiersRequest_H_ */
