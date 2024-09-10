/*
 * OrderItemModificationDTO.h
 *
 * Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
 */

#ifndef _OrderItemModificationDTO_H_
#define _OrderItemModificationDTO_H_


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


/*! \brief Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
 *
 *  \ingroup Models
 *
 */

class OrderItemModificationDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderItemModificationDTO();
	OrderItemModificationDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderItemModificationDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр. 
	 */
	long long getId();

	/*! \brief Set Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр. 
	 */
	void setId(long long  id);
	/*! \brief Get Новое количество товара.
	 */
	int getCount();

	/*! \brief Set Новое количество товара.
	 */
	void setCount(int  count);
	/*! \brief Get Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/). 
	 */
	std::list<BriefOrderItemInstanceDTO> getInstances();

	/*! \brief Set Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/). 
	 */
	void setInstances(std::list <BriefOrderItemInstanceDTO> instances);

private:
	long long id;
	int count;
	std::list <BriefOrderItemInstanceDTO>instances;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderItemModificationDTO_H_ */
