/*
 * GetSuggestedOfferMappingsResultDTO.h
 *
 * Подобранные карточки на Маркете.
 */

#ifndef _GetSuggestedOfferMappingsResultDTO_H_
#define _GetSuggestedOfferMappingsResultDTO_H_


#include <string>
#include "SuggestedOfferMappingDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Подобранные карточки на Маркете.
 *
 *  \ingroup Models
 *
 */

class GetSuggestedOfferMappingsResultDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetSuggestedOfferMappingsResultDTO();
	GetSuggestedOfferMappingsResultDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetSuggestedOfferMappingsResultDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров.
	 */
	std::list<SuggestedOfferMappingDTO> getOffers();

	/*! \brief Set Список товаров.
	 */
	void setOffers(std::list <SuggestedOfferMappingDTO> offers);

private:
	std::list <SuggestedOfferMappingDTO>offers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetSuggestedOfferMappingsResultDTO_H_ */
