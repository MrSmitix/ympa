/*
 * OfferMappingSuggestionsListDTO.h
 *
 * Список рекомендованных карточек товара.
 */

#ifndef _OfferMappingSuggestionsListDTO_H_
#define _OfferMappingSuggestionsListDTO_H_


#include <string>
#include "EnrichedMappingsOfferDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список рекомендованных карточек товара.
 *
 *  \ingroup Models
 *
 */

class OfferMappingSuggestionsListDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferMappingSuggestionsListDTO();
	OfferMappingSuggestionsListDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferMappingSuggestionsListDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров.
	 */
	std::list<EnrichedMappingsOfferDTO> getOffers();

	/*! \brief Set Список товаров.
	 */
	void setOffers(std::list <EnrichedMappingsOfferDTO> offers);

private:
	std::list <EnrichedMappingsOfferDTO>offers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferMappingSuggestionsListDTO_H_ */
