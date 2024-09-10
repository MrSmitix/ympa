/*
 * BriefOrderItemDTO.h
 *
 * Информация о маркированном товаре.
 */

#ifndef _BriefOrderItemDTO_H_
#define _BriefOrderItemDTO_H_


#include <string>
#include "OrderItemInstanceDTO.h"
#include "OrderVatType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о маркированном товаре.
 *
 *  \ingroup Models
 *
 */

class BriefOrderItemDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	BriefOrderItemDTO();
	BriefOrderItemDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BriefOrderItemDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
	 */
	long long getId();

	/*! \brief Set Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
	 */
	void setId(long long  id);
	/*! \brief Get 
	 */
	OrderVatType getVat();

	/*! \brief Set 
	 */
	void setVat(OrderVatType  vat);
	/*! \brief Get Количество единиц товара.
	 */
	int getCount();

	/*! \brief Set Количество единиц товара.
	 */
	void setCount(int  count);
	/*! \brief Get Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. 
	 */
	long long getPrice();

	/*! \brief Set Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. 
	 */
	void setPrice(long long  price);
	/*! \brief Get Название товара.
	 */
	std::string getOfferName();

	/*! \brief Set Название товара.
	 */
	void setOfferName(std::string  offerName);
	/*! \brief Get Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	std::string getOfferId();

	/*! \brief Set Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	void setOfferId(std::string  offerId);
	/*! \brief Get Переданные вами коды маркировки.
	 */
	std::list<OrderItemInstanceDTO> getInstances();

	/*! \brief Set Переданные вами коды маркировки.
	 */
	void setInstances(std::list <OrderItemInstanceDTO> instances);

private:
	long long id;
	OrderVatType vat;
	int count;
	long long price;
	std::string offerName;
	std::string offerId;
	std::list <OrderItemInstanceDTO>instances;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BriefOrderItemDTO_H_ */
