
/*
 * UpdatePromoOfferDiscountParamsDTO.h
 *
 * Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.  Обязательный параметр для акций с этими типами. 
 */

#ifndef TINY_CPP_CLIENT_UpdatePromoOfferDiscountParamsDTO_H_
#define TINY_CPP_CLIENT_UpdatePromoOfferDiscountParamsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.  Обязательный параметр для акций с этими типами. 
 *
 *  \ingroup Models
 *
 */

class UpdatePromoOfferDiscountParamsDTO{
public:

    /*! \brief Constructor.
	 */
    UpdatePromoOfferDiscountParamsDTO();
    UpdatePromoOfferDiscountParamsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdatePromoOfferDiscountParamsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. 
	 */
	long getPrice();

	/*! \brief Set Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. 
	 */
	void setPrice(long  price);
	/*! \brief Get Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. 
	 */
	long getPromoPrice();

	/*! \brief Set Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. 
	 */
	void setPromoPrice(long  promoPrice);


    private:
    long price{};
    long promoPrice{};
};
}

#endif /* TINY_CPP_CLIENT_UpdatePromoOfferDiscountParamsDTO_H_ */
