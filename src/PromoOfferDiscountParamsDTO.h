/*
 * PromoOfferDiscountParamsDTO.h
 *
 * Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.
 */

#ifndef _PromoOfferDiscountParamsDTO_H_
#define _PromoOfferDiscountParamsDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.
 *
 *  \ingroup Models
 *
 */

class PromoOfferDiscountParamsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	PromoOfferDiscountParamsDTO();
	PromoOfferDiscountParamsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PromoOfferDiscountParamsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
	 */
	long long getPrice();

	/*! \brief Set Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
	 */
	void setPrice(long long  price);
	/*! \brief Get Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
	 */
	long long getPromoPrice();

	/*! \brief Set Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
	 */
	void setPromoPrice(long long  promoPrice);
	/*! \brief Get Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
	 */
	long long getMaxPromoPrice();

	/*! \brief Set Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
	 */
	void setMaxPromoPrice(long long  maxPromoPrice);

private:
	long long price;
	long long promoPrice;
	long long maxPromoPrice;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PromoOfferDiscountParamsDTO_H_ */
