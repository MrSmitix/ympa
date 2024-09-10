/*
 * UpdateOfferContentResultDTO.h
 *
 * Ошибки и предупреждения, которые появились из-за переданных характеристик.
 */

#ifndef _UpdateOfferContentResultDTO_H_
#define _UpdateOfferContentResultDTO_H_


#include <string>
#include "OfferContentErrorDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ошибки и предупреждения, которые появились из-за переданных характеристик.
 *
 *  \ingroup Models
 *
 */

class UpdateOfferContentResultDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateOfferContentResultDTO();
	UpdateOfferContentResultDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateOfferContentResultDTO();

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
	/*! \brief Get Ошибки — информация в каталоге не обновится.
	 */
	std::list<OfferContentErrorDTO> getErrors();

	/*! \brief Set Ошибки — информация в каталоге не обновится.
	 */
	void setErrors(std::list <OfferContentErrorDTO> errors);
	/*! \brief Get Предупреждения — информация в каталоге обновится.
	 */
	std::list<OfferContentErrorDTO> getWarnings();

	/*! \brief Set Предупреждения — информация в каталоге обновится.
	 */
	void setWarnings(std::list <OfferContentErrorDTO> warnings);

private:
	std::string offerId;
	std::list <OfferContentErrorDTO>errors;
	std::list <OfferContentErrorDTO>warnings;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateOfferContentResultDTO_H_ */
