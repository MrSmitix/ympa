/*
 * OrderBoxLayoutItemDTO.h
 *
 * Информация о товаре в коробке.
 */

#ifndef _OrderBoxLayoutItemDTO_H_
#define _OrderBoxLayoutItemDTO_H_


#include <string>
#include "BriefOrderItemInstanceDTO.h"
#include "OrderBoxLayoutPartialCountDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о товаре в коробке.
 *
 *  \ingroup Models
 *
 */

class OrderBoxLayoutItemDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderBoxLayoutItemDTO();
	OrderBoxLayoutItemDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderBoxLayoutItemDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
	 */
	long long getId();

	/*! \brief Set Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
	 */
	void setId(long long  id);
	/*! \brief Get Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. 
	 */
	int getFullCount();

	/*! \brief Set Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. 
	 */
	void setFullCount(int  fullCount);
	/*! \brief Get 
	 */
	OrderBoxLayoutPartialCountDTO getPartialCount();

	/*! \brief Set 
	 */
	void setPartialCount(OrderBoxLayoutPartialCountDTO  partialCount);
	/*! \brief Get Переданные вами коды маркировки.
	 */
	std::list<BriefOrderItemInstanceDTO> getInstances();

	/*! \brief Set Переданные вами коды маркировки.
	 */
	void setInstances(std::list <BriefOrderItemInstanceDTO> instances);

private:
	long long id;
	int fullCount;
	OrderBoxLayoutPartialCountDTO partialCount;
	std::list <BriefOrderItemInstanceDTO>instances;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderBoxLayoutItemDTO_H_ */
