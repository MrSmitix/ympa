/*
 * UpdatePromoOfferDiscountParamsDTO.h
 *
 * Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.  Обязательный параметр для акций с этими типами. 
 */

#ifndef _UpdatePromoOfferDiscountParamsDTO_H_
#define _UpdatePromoOfferDiscountParamsDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.  Обязательный параметр для акций с этими типами. 
 *
 *  \ingroup Models
 *
 */

class UpdatePromoOfferDiscountParamsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdatePromoOfferDiscountParamsDTO();
	UpdatePromoOfferDiscountParamsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdatePromoOfferDiscountParamsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. 
	 */
	long long getPrice();

	/*! \brief Set Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. 
	 */
	void setPrice(long long  price);
	/*! \brief Get Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. 
	 */
	long long getPromoPrice();

	/*! \brief Set Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. 
	 */
	void setPromoPrice(long long  promoPrice);

private:
	long long price;
	long long promoPrice;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdatePromoOfferDiscountParamsDTO_H_ */
