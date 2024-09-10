/*
 * GetSuggestedOfferMappingsRequest.h
 *
 * 
 */

#ifndef _GetSuggestedOfferMappingsRequest_H_
#define _GetSuggestedOfferMappingsRequest_H_


#include <string>
#include "SuggestedOfferDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetSuggestedOfferMappingsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetSuggestedOfferMappingsRequest();
	GetSuggestedOfferMappingsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetSuggestedOfferMappingsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров.
	 */
	std::list<SuggestedOfferDTO> getOffers();

	/*! \brief Set Список товаров.
	 */
	void setOffers(std::list <SuggestedOfferDTO> offers);

private:
	std::list <SuggestedOfferDTO>offers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetSuggestedOfferMappingsRequest_H_ */
