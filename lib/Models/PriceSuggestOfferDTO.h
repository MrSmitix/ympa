
/*
 * PriceSuggestOfferDTO.h
 *
 * Товар с ценами для продвижения.
 */

#ifndef TINY_CPP_CLIENT_PriceSuggestOfferDTO_H_
#define TINY_CPP_CLIENT_PriceSuggestOfferDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PriceSuggestDTO.h"
#include <list>

namespace Tiny {


/*! \brief Товар с ценами для продвижения.
 *
 *  \ingroup Models
 *
 */

class PriceSuggestOfferDTO{
public:

    /*! \brief Constructor.
	 */
    PriceSuggestOfferDTO();
    PriceSuggestOfferDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PriceSuggestOfferDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get SKU на Маркете.
	 */
	long getMarketSku();

	/*! \brief Set SKU на Маркете.
	 */
	void setMarketSku(long  marketSku);
	/*! \brief Get Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	std::string getOfferId();

	/*! \brief Set Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	void setOfferId(std::string  offerId);
	/*! \brief Get Цены для продвижения. 
	 */
	std::list<PriceSuggestDTO> getPriceSuggestion();

	/*! \brief Set Цены для продвижения. 
	 */
	void setPriceSuggestion(std::list <PriceSuggestDTO> priceSuggestion);


    private:
    long marketSku{};
    std::string offerId{};
    std::list<PriceSuggestDTO> priceSuggestion;
};
}

#endif /* TINY_CPP_CLIENT_PriceSuggestOfferDTO_H_ */
