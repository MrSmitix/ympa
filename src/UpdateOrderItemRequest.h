/*
 * UpdateOrderItemRequest.h
 *
 * Запрос на обновление состава заказа.
 */

#ifndef _UpdateOrderItemRequest_H_
#define _UpdateOrderItemRequest_H_


#include <string>
#include "OrderItemModificationDTO.h"
#include "OrderItemsModificationRequestReasonType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос на обновление состава заказа.
 *
 *  \ingroup Models
 *
 */

class UpdateOrderItemRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateOrderItemRequest();
	UpdateOrderItemRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateOrderItemRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
	 */
	std::list<OrderItemModificationDTO> getItems();

	/*! \brief Set Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
	 */
	void setItems(std::list <OrderItemModificationDTO> items);
	/*! \brief Get 
	 */
	OrderItemsModificationRequestReasonType getReason();

	/*! \brief Set 
	 */
	void setReason(OrderItemsModificationRequestReasonType  reason);

private:
	std::list <OrderItemModificationDTO>items;
	OrderItemsModificationRequestReasonType reason;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateOrderItemRequest_H_ */
