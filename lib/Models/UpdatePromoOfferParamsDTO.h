
/*
 * UpdatePromoOfferParamsDTO.h
 *
 * Параметры товара, который участвует в акции.
 */

#ifndef TINY_CPP_CLIENT_UpdatePromoOfferParamsDTO_H_
#define TINY_CPP_CLIENT_UpdatePromoOfferParamsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdatePromoOfferDiscountParamsDTO.h"

namespace Tiny {


/*! \brief Параметры товара, который участвует в акции.
 *
 *  \ingroup Models
 *
 */

class UpdatePromoOfferParamsDTO{
public:

    /*! \brief Constructor.
	 */
    UpdatePromoOfferParamsDTO();
    UpdatePromoOfferParamsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdatePromoOfferParamsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	UpdatePromoOfferDiscountParamsDTO getDiscountParams();

	/*! \brief Set 
	 */
	void setDiscountParams(UpdatePromoOfferDiscountParamsDTO  discountParams);


    private:
    UpdatePromoOfferDiscountParamsDTO discountParams;
};
}

#endif /* TINY_CPP_CLIENT_UpdatePromoOfferParamsDTO_H_ */
