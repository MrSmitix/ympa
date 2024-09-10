/*
 * OfferPriceDTO.h
 *
 * Товар с информацией о новой цене на него.
 */

#ifndef _OfferPriceDTO_H_
#define _OfferPriceDTO_H_


#include <string>
#include "PriceDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Товар с информацией о новой цене на него.
 *
 *  \ingroup Models
 *
 */

class OfferPriceDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferPriceDTO();
	OfferPriceDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferPriceDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	std::string getOfferId();

	/*! \brief Set Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
	 */
	void setOfferId(std::string  offerId);
	/*! \brief Get 
	 */
	PriceDTO getPrice();

	/*! \brief Set 
	 */
	void setPrice(PriceDTO  price);

private:
	std::string offerId;
	PriceDTO price;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferPriceDTO_H_ */
