/*
 * PriceSuggestOfferDTO.h
 *
 * Товар с ценами для продвижения.
 */

#ifndef _PriceSuggestOfferDTO_H_
#define _PriceSuggestOfferDTO_H_


#include <string>
#include "PriceSuggestDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Товар с ценами для продвижения.
 *
 *  \ingroup Models
 *
 */

class PriceSuggestOfferDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	PriceSuggestOfferDTO();
	PriceSuggestOfferDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PriceSuggestOfferDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get SKU на Маркете.
	 */
	long long getMarketSku();

	/*! \brief Set SKU на Маркете.
	 */
	void setMarketSku(long long  marketSku);
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
	long long marketSku;
	std::string offerId;
	std::list <PriceSuggestDTO>priceSuggestion;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PriceSuggestOfferDTO_H_ */
