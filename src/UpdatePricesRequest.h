/*
 * UpdatePricesRequest.h
 *
 * Запрос на установку цен на товары.
 */

#ifndef _UpdatePricesRequest_H_
#define _UpdatePricesRequest_H_


#include <string>
#include "OfferPriceDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос на установку цен на товары.
 *
 *  \ingroup Models
 *
 */

class UpdatePricesRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdatePricesRequest();
	UpdatePricesRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdatePricesRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров.
	 */
	std::list<OfferPriceDTO> getOffers();

	/*! \brief Set Список товаров.
	 */
	void setOffers(std::list <OfferPriceDTO> offers);

private:
	std::list <OfferPriceDTO>offers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdatePricesRequest_H_ */
