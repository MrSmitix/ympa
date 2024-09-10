/*
 * OrderItemInstanceModificationDTO.h
 *
 * Позиция в корзине, требующая маркировки.
 */

#ifndef _OrderItemInstanceModificationDTO_H_
#define _OrderItemInstanceModificationDTO_H_


#include <string>
#include "BriefOrderItemInstanceDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Позиция в корзине, требующая маркировки.
 *
 *  \ingroup Models
 *
 */

class OrderItemInstanceModificationDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderItemInstanceModificationDTO();
	OrderItemInstanceModificationDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderItemInstanceModificationDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
	 */
	long long getId();

	/*! \brief Set Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
	 */
	void setId(long long  id);
	/*! \brief Get Список кодов маркировки единиц товара. 
	 */
	std::list<BriefOrderItemInstanceDTO> getInstances();

	/*! \brief Set Список кодов маркировки единиц товара. 
	 */
	void setInstances(std::list <BriefOrderItemInstanceDTO> instances);

private:
	long long id;
	std::list <BriefOrderItemInstanceDTO>instances;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderItemInstanceModificationDTO_H_ */
