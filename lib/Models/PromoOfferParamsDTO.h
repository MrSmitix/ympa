
/*
 * PromoOfferParamsDTO.h
 *
 * Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
 */

#ifndef TINY_CPP_CLIENT_PromoOfferParamsDTO_H_
#define TINY_CPP_CLIENT_PromoOfferParamsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PromoOfferDiscountParamsDTO.h"
#include "PromoOfferPromocodeParamsDTO.h"

namespace Tiny {


/*! \brief Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
 *
 *  \ingroup Models
 *
 */

class PromoOfferParamsDTO{
public:

    /*! \brief Constructor.
	 */
    PromoOfferParamsDTO();
    PromoOfferParamsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PromoOfferParamsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	PromoOfferDiscountParamsDTO getDiscountParams();

	/*! \brief Set 
	 */
	void setDiscountParams(PromoOfferDiscountParamsDTO  discountParams);
	/*! \brief Get 
	 */
	PromoOfferPromocodeParamsDTO getPromocodeParams();

	/*! \brief Set 
	 */
	void setPromocodeParams(PromoOfferPromocodeParamsDTO  promocodeParams);


    private:
    PromoOfferDiscountParamsDTO discountParams;
    PromoOfferPromocodeParamsDTO promocodeParams;
};
}

#endif /* TINY_CPP_CLIENT_PromoOfferParamsDTO_H_ */
