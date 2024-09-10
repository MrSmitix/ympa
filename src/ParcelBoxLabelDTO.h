/*
 * ParcelBoxLabelDTO.h
 *
 * Информация о ярлыке для коробки.
 */

#ifndef _ParcelBoxLabelDTO_H_
#define _ParcelBoxLabelDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о ярлыке для коробки.
 *
 *  \ingroup Models
 *
 */

class ParcelBoxLabelDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ParcelBoxLabelDTO();
	ParcelBoxLabelDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ParcelBoxLabelDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
	 */
	std::string getUrl();

	/*! \brief Set Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
	 */
	void setUrl(std::string  url);
	/*! \brief Get Юридическое название магазина.
	 */
	std::string getSupplierName();

	/*! \brief Set Юридическое название магазина.
	 */
	void setSupplierName(std::string  supplierName);
	/*! \brief Get Юридическое название службы доставки.
	 */
	std::string getDeliveryServiceName();

	/*! \brief Set Юридическое название службы доставки.
	 */
	void setDeliveryServiceName(std::string  deliveryServiceName);
	/*! \brief Get Идентификатор заказа в системе Маркета.
	 */
	long long getOrderId();

	/*! \brief Set Идентификатор заказа в системе Маркета.
	 */
	void setOrderId(long long  orderId);
	/*! \brief Get Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. 
	 */
	std::string getOrderNum();

	/*! \brief Set Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. 
	 */
	void setOrderNum(std::string  orderNum);
	/*! \brief Get Фамилия и инициалы получателя заказа.
	 */
	std::string getRecipientName();

	/*! \brief Set Фамилия и инициалы получателя заказа.
	 */
	void setRecipientName(std::string  recipientName);
	/*! \brief Get Идентификатор коробки.
	 */
	long long getBoxId();

	/*! \brief Set Идентификатор коробки.
	 */
	void setBoxId(long long  boxId);
	/*! \brief Get Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. 
	 */
	std::string getFulfilmentId();

	/*! \brief Set Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. 
	 */
	void setFulfilmentId(std::string  fulfilmentId);
	/*! \brief Get Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. 
	 */
	std::string getPlace();

	/*! \brief Set Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. 
	 */
	void setPlace(std::string  place);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. 
	 */
	std::string getWeight();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. 
	 */
	void setWeight(std::string  weight);
	/*! \brief Get Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
	 */
	std::string getDeliveryServiceId();

	/*! \brief Set Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
	 */
	void setDeliveryServiceId(std::string  deliveryServiceId);
	/*! \brief Get Адрес получателя.
	 */
	std::string getDeliveryAddress();

	/*! \brief Set Адрес получателя.
	 */
	void setDeliveryAddress(std::string  deliveryAddress);
	/*! \brief Get Дата отгрузки в формате `dd.MM.yyyy`.
	 */
	std::string getShipmentDate();

	/*! \brief Set Дата отгрузки в формате `dd.MM.yyyy`.
	 */
	void setShipmentDate(std::string  shipmentDate);

private:
	std::string url;
	std::string supplierName;
	std::string deliveryServiceName;
	long long orderId;
	std::string orderNum;
	std::string recipientName;
	long long boxId;
	std::string fulfilmentId;
	std::string place;
	std::string weight;
	std::string deliveryServiceId;
	std::string deliveryAddress;
	std::string shipmentDate;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ParcelBoxLabelDTO_H_ */
