
/*
 * UpdateBusinessOfferPriceDTO.h
 *
 * Товар с новой ценой.
 */

#ifndef TINY_CPP_CLIENT_UpdateBusinessOfferPriceDTO_H_
#define TINY_CPP_CLIENT_UpdateBusinessOfferPriceDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdatePriceWithDiscountDTO.h"

namespace Tiny {


/*! \brief Товар с новой ценой.
 *
 *  \ingroup Models
 *
 */

class UpdateBusinessOfferPriceDTO{
public:

    /*! \brief Constructor.
	 */
    UpdateBusinessOfferPriceDTO();
    UpdateBusinessOfferPriceDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateBusinessOfferPriceDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	std::string getOfferId();

	/*! \brief Set Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	void setOfferId(std::string  offerId);
	/*! \brief Get 
	 */
	UpdatePriceWithDiscountDTO getPrice();

	/*! \brief Set 
	 */
	void setPrice(UpdatePriceWithDiscountDTO  price);


    private:
    std::string offerId{};
    UpdatePriceWithDiscountDTO price;
};
}

#endif /* TINY_CPP_CLIENT_UpdateBusinessOfferPriceDTO_H_ */
