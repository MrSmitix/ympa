
/*
 * OrderItemModificationDTO.h
 *
 * Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
 */

#ifndef TINY_CPP_CLIENT_OrderItemModificationDTO_H_
#define TINY_CPP_CLIENT_OrderItemModificationDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BriefOrderItemInstanceDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
 *
 *  \ingroup Models
 *
 */

class OrderItemModificationDTO{
public:

    /*! \brief Constructor.
	 */
    OrderItemModificationDTO();
    OrderItemModificationDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderItemModificationDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр. 
	 */
	long getId();

	/*! \brief Set Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр. 
	 */
	void setId(long  id);
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
    long id{};
    int count{};
    std::list<BriefOrderItemInstanceDTO> instances;
};
}

#endif /* TINY_CPP_CLIENT_OrderItemModificationDTO_H_ */
