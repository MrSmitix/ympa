
/*
 * OrderBoxLayoutItemDTO.h
 *
 * Информация о товаре в коробке.
 */

#ifndef TINY_CPP_CLIENT_OrderBoxLayoutItemDTO_H_
#define TINY_CPP_CLIENT_OrderBoxLayoutItemDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BriefOrderItemInstanceDTO.h"
#include "OrderBoxLayoutPartialCountDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация о товаре в коробке.
 *
 *  \ingroup Models
 *
 */

class OrderBoxLayoutItemDTO{
public:

    /*! \brief Constructor.
	 */
    OrderBoxLayoutItemDTO();
    OrderBoxLayoutItemDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderBoxLayoutItemDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
	 */
	long getId();

	/*! \brief Set Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
	 */
	void setId(long  id);
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
    long id{};
    int fullCount{};
    OrderBoxLayoutPartialCountDTO partialCount;
    std::list<BriefOrderItemInstanceDTO> instances;
};
}

#endif /* TINY_CPP_CLIENT_OrderBoxLayoutItemDTO_H_ */
