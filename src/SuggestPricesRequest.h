/*
 * SuggestPricesRequest.h
 *
 * Запрос на получение списка цен для продвижения.
 */

#ifndef _SuggestPricesRequest_H_
#define _SuggestPricesRequest_H_


#include <string>
#include "SuggestOfferPriceDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос на получение списка цен для продвижения.
 *
 *  \ingroup Models
 *
 */

class SuggestPricesRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	SuggestPricesRequest();
	SuggestPricesRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SuggestPricesRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров.
	 */
	std::list<SuggestOfferPriceDTO> getOffers();

	/*! \brief Set Список товаров.
	 */
	void setOffers(std::list <SuggestOfferPriceDTO> offers);

private:
	std::list <SuggestOfferPriceDTO>offers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SuggestPricesRequest_H_ */
