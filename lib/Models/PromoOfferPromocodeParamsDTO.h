
/*
 * PromoOfferPromocodeParamsDTO.h
 *
 * Параметры товара в акции с типом &#x60;MARKET_PROMOCODE&#x60;.
 */

#ifndef TINY_CPP_CLIENT_PromoOfferPromocodeParamsDTO_H_
#define TINY_CPP_CLIENT_PromoOfferPromocodeParamsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Параметры товара в акции с типом `MARKET_PROMOCODE`.
 *
 *  \ingroup Models
 *
 */

class PromoOfferPromocodeParamsDTO{
public:

    /*! \brief Constructor.
	 */
    PromoOfferPromocodeParamsDTO();
    PromoOfferPromocodeParamsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PromoOfferPromocodeParamsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. 
	 */
	long getMaxPrice();

	/*! \brief Set Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. 
	 */
	void setMaxPrice(long  maxPrice);


    private:
    long maxPrice{};
};
}

#endif /* TINY_CPP_CLIENT_PromoOfferPromocodeParamsDTO_H_ */
