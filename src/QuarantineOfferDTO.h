/*
 * QuarantineOfferDTO.h
 *
 * Товар в карантине.
 */

#ifndef _QuarantineOfferDTO_H_
#define _QuarantineOfferDTO_H_


#include <string>
#include "BasePriceDTO.h"
#include "PriceQuarantineVerdictDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Товар в карантине.
 *
 *  \ingroup Models
 *
 */

class QuarantineOfferDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	QuarantineOfferDTO();
	QuarantineOfferDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~QuarantineOfferDTO();

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
	BasePriceDTO getCurrentPrice();

	/*! \brief Set 
	 */
	void setCurrentPrice(BasePriceDTO  currentPrice);
	/*! \brief Get 
	 */
	BasePriceDTO getLastValidPrice();

	/*! \brief Set 
	 */
	void setLastValidPrice(BasePriceDTO  lastValidPrice);
	/*! \brief Get Причины попадания товара в карантин.
	 */
	std::list<PriceQuarantineVerdictDTO> getVerdicts();

	/*! \brief Set Причины попадания товара в карантин.
	 */
	void setVerdicts(std::list <PriceQuarantineVerdictDTO> verdicts);

private:
	std::string offerId;
	BasePriceDTO currentPrice;
	BasePriceDTO lastValidPrice;
	std::list <PriceQuarantineVerdictDTO>verdicts;
	void __init();
	void __cleanup();

};
}
}

#endif /* _QuarantineOfferDTO_H_ */
