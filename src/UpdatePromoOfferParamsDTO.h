/*
 * UpdatePromoOfferParamsDTO.h
 *
 * Параметры товара, который участвует в акции.
 */

#ifndef _UpdatePromoOfferParamsDTO_H_
#define _UpdatePromoOfferParamsDTO_H_


#include <string>
#include "UpdatePromoOfferDiscountParamsDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Параметры товара, который участвует в акции.
 *
 *  \ingroup Models
 *
 */

class UpdatePromoOfferParamsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdatePromoOfferParamsDTO();
	UpdatePromoOfferParamsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdatePromoOfferParamsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	UpdatePromoOfferDiscountParamsDTO getDiscountParams();

	/*! \brief Set 
	 */
	void setDiscountParams(UpdatePromoOfferDiscountParamsDTO  discountParams);

private:
	UpdatePromoOfferDiscountParamsDTO discountParams;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdatePromoOfferParamsDTO_H_ */
