/*
 * OrderDigitalItemDTO.h
 *
 * Ключ цифрового товара.
 */

#ifndef _OrderDigitalItemDTO_H_
#define _OrderDigitalItemDTO_H_


#include <string>
#include "Date.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ключ цифрового товара.
 *
 *  \ingroup Models
 *
 */

class OrderDigitalItemDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderDigitalItemDTO();
	OrderDigitalItemDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderDigitalItemDTO();

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
	long long id;
	std::string code;
	std::string slip;
	Date activate_till;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderDigitalItemDTO_H_ */
