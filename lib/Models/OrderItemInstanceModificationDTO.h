
/*
 * OrderItemInstanceModificationDTO.h
 *
 * Позиция в корзине, требующая маркировки.
 */

#ifndef TINY_CPP_CLIENT_OrderItemInstanceModificationDTO_H_
#define TINY_CPP_CLIENT_OrderItemInstanceModificationDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BriefOrderItemInstanceDTO.h"
#include <list>

namespace Tiny {


/*! \brief Позиция в корзине, требующая маркировки.
 *
 *  \ingroup Models
 *
 */

class OrderItemInstanceModificationDTO{
public:

    /*! \brief Constructor.
	 */
    OrderItemInstanceModificationDTO();
    OrderItemInstanceModificationDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderItemInstanceModificationDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
	 */
	long getId();

	/*! \brief Set Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
	 */
	void setId(long  id);
	/*! \brief Get Список кодов маркировки единиц товара. 
	 */
	std::list<BriefOrderItemInstanceDTO> getInstances();

	/*! \brief Set Список кодов маркировки единиц товара. 
	 */
	void setInstances(std::list <BriefOrderItemInstanceDTO> instances);


    private:
    long id{};
    std::list<BriefOrderItemInstanceDTO> instances;
};
}

#endif /* TINY_CPP_CLIENT_OrderItemInstanceModificationDTO_H_ */
