/*
 * UpdatePromoOfferDTO.h
 *
 * Описание товаров, которые участвуют в акции.
 */

#ifndef _UpdatePromoOfferDTO_H_
#define _UpdatePromoOfferDTO_H_


#include <string>
#include "UpdatePromoOfferParamsDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Описание товаров, которые участвуют в акции.
 *
 *  \ingroup Models
 *
 */

class UpdatePromoOfferDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdatePromoOfferDTO();
	UpdatePromoOfferDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdatePromoOfferDTO();

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
	UpdatePromoOfferParamsDTO getParams();

	/*! \brief Set 
	 */
	void setParams(UpdatePromoOfferParamsDTO  params);

private:
	std::string offerId;
	UpdatePromoOfferParamsDTO params;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdatePromoOfferDTO_H_ */
