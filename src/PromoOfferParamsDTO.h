/*
 * PromoOfferParamsDTO.h
 *
 * Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
 */

#ifndef _PromoOfferParamsDTO_H_
#define _PromoOfferParamsDTO_H_


#include <string>
#include "PromoOfferDiscountParamsDTO.h"
#include "PromoOfferPromocodeParamsDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
 *
 *  \ingroup Models
 *
 */

class PromoOfferParamsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	PromoOfferParamsDTO();
	PromoOfferParamsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PromoOfferParamsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _PromoOfferParamsDTO_H_ */
