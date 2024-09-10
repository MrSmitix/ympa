/*
 * WarningPromoOfferUpdateDTO.h
 *
 * Описание предупреждения, которое появилось при добавлении товара.
 */

#ifndef _WarningPromoOfferUpdateDTO_H_
#define _WarningPromoOfferUpdateDTO_H_


#include <string>
#include "PromoOfferUpdateWarningDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Описание предупреждения, которое появилось при добавлении товара.
 *
 *  \ingroup Models
 *
 */

class WarningPromoOfferUpdateDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	WarningPromoOfferUpdateDTO();
	WarningPromoOfferUpdateDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~WarningPromoOfferUpdateDTO();

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
	/*! \brief Get Предупреждения, которые появились при добавлении товара в акцию или изменении его цен.
	 */
	std::list<PromoOfferUpdateWarningDTO> getWarnings();

	/*! \brief Set Предупреждения, которые появились при добавлении товара в акцию или изменении его цен.
	 */
	void setWarnings(std::list <PromoOfferUpdateWarningDTO> warnings);

private:
	std::string offerId;
	std::list <PromoOfferUpdateWarningDTO>warnings;
	void __init();
	void __cleanup();

};
}
}

#endif /* _WarningPromoOfferUpdateDTO_H_ */
