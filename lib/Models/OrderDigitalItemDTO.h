
/*
 * OrderDigitalItemDTO.h
 *
 * Ключ цифрового товара.
 */

#ifndef TINY_CPP_CLIENT_OrderDigitalItemDTO_H_
#define TINY_CPP_CLIENT_OrderDigitalItemDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"

namespace Tiny {


/*! \brief Ключ цифрового товара.
 *
 *  \ingroup Models
 *
 */

class OrderDigitalItemDTO{
public:

    /*! \brief Constructor.
	 */
    OrderDigitalItemDTO();
    OrderDigitalItemDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderDigitalItemDTO();


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
	/*! \brief Get Сам ключ.
	 */
	std::string getCode();

	/*! \brief Set Сам ключ.
	 */
	void setCode(std::string  code);
	/*! \brief Get Инструкция по активации.
	 */
	std::string getSlip();

	/*! \brief Set Инструкция по активации.
	 */
	void setSlip(std::string  slip);
	/*! \brief Get Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. 
	 */
	Date getActivateTill();

	/*! \brief Set Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. 
	 */
	void setActivateTill(Date  activate_till);


    private:
    long id{};
    std::string code{};
    std::string slip{};
    Date activate_till;
};
}

#endif /* TINY_CPP_CLIENT_OrderDigitalItemDTO_H_ */
