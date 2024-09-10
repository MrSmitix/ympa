
/*
 * BriefOrderItemDTO.h
 *
 * Информация о маркированном товаре.
 */

#ifndef TINY_CPP_CLIENT_BriefOrderItemDTO_H_
#define TINY_CPP_CLIENT_BriefOrderItemDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderItemInstanceDTO.h"
#include "OrderVatType.h"
#include <list>

namespace Tiny {


/*! \brief Информация о маркированном товаре.
 *
 *  \ingroup Models
 *
 */

class BriefOrderItemDTO{
public:

    /*! \brief Constructor.
	 */
    BriefOrderItemDTO();
    BriefOrderItemDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BriefOrderItemDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
	 */
	long getId();

	/*! \brief Set Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
	 */
	void setId(long  id);
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
	long getPrice();

	/*! \brief Set Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. 
	 */
	void setPrice(long  price);
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
    long id{};
    OrderVatType vat;
    int count{};
    long price{};
    std::string offerName{};
    std::string offerId{};
    std::list<OrderItemInstanceDTO> instances;
};
}

#endif /* TINY_CPP_CLIENT_BriefOrderItemDTO_H_ */
