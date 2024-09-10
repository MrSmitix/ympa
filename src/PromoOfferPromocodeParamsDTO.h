/*
 * PromoOfferPromocodeParamsDTO.h
 *
 * Параметры товара в акции с типом &#x60;MARKET_PROMOCODE&#x60;.
 */

#ifndef _PromoOfferPromocodeParamsDTO_H_
#define _PromoOfferPromocodeParamsDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Параметры товара в акции с типом `MARKET_PROMOCODE`.
 *
 *  \ingroup Models
 *
 */

class PromoOfferPromocodeParamsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	PromoOfferPromocodeParamsDTO();
	PromoOfferPromocodeParamsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PromoOfferPromocodeParamsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. 
	 */
	long long getMaxPrice();

	/*! \brief Set Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. 
	 */
	void setMaxPrice(long long  maxPrice);

private:
	long long maxPrice;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PromoOfferPromocodeParamsDTO_H_ */
