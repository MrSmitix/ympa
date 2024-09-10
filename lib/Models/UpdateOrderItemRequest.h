
/*
 * UpdateOrderItemRequest.h
 *
 * Запрос на обновление состава заказа.
 */

#ifndef TINY_CPP_CLIENT_UpdateOrderItemRequest_H_
#define TINY_CPP_CLIENT_UpdateOrderItemRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderItemModificationDTO.h"
#include "OrderItemsModificationRequestReasonType.h"
#include <list>

namespace Tiny {


/*! \brief Запрос на обновление состава заказа.
 *
 *  \ingroup Models
 *
 */

class UpdateOrderItemRequest{
public:

    /*! \brief Constructor.
	 */
    UpdateOrderItemRequest();
    UpdateOrderItemRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateOrderItemRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<OrderItemModificationDTO> items;
    OrderItemsModificationRequestReasonType reason;
};
}

#endif /* TINY_CPP_CLIENT_UpdateOrderItemRequest_H_ */
