/*
 * GetSuggestedOfferMappingEntriesRequest.h
 *
 * Запрос рекомендованных карточек товара.
 */

#ifndef _GetSuggestedOfferMappingEntriesRequest_H_
#define _GetSuggestedOfferMappingEntriesRequest_H_


#include <string>
#include "MappingsOfferDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос рекомендованных карточек товара.
 *
 *  \ingroup Models
 *
 */

class GetSuggestedOfferMappingEntriesRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetSuggestedOfferMappingEntriesRequest();
	GetSuggestedOfferMappingEntriesRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetSuggestedOfferMappingEntriesRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров.
	 */
	std::list<MappingsOfferDTO> getOffers();

	/*! \brief Set Список товаров.
	 */
	void setOffers(std::list <MappingsOfferDTO> offers);

private:
	std::list <MappingsOfferDTO>offers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetSuggestedOfferMappingEntriesRequest_H_ */
