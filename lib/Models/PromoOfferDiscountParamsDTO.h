
/*
 * PromoOfferDiscountParamsDTO.h
 *
 * Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.
 */

#ifndef TINY_CPP_CLIENT_PromoOfferDiscountParamsDTO_H_
#define TINY_CPP_CLIENT_PromoOfferDiscountParamsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.
 *
 *  \ingroup Models
 *
 */

class PromoOfferDiscountParamsDTO{
public:

    /*! \brief Constructor.
	 */
    PromoOfferDiscountParamsDTO();
    PromoOfferDiscountParamsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PromoOfferDiscountParamsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
	 */
	long getPrice();

	/*! \brief Set Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
	 */
	void setPrice(long  price);
	/*! \brief Get Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
	 */
	long getPromoPrice();

	/*! \brief Set Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
	 */
	void setPromoPrice(long  promoPrice);
	/*! \brief Get Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
	 */
	long getMaxPromoPrice();

	/*! \brief Set Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
	 */
	void setMaxPromoPrice(long  maxPromoPrice);


    private:
    long price{};
    long promoPrice{};
    long maxPromoPrice{};
};
}

#endif /* TINY_CPP_CLIENT_PromoOfferDiscountParamsDTO_H_ */
