/*
 * GetSuggestedOfferMappingEntriesResponse.h
 *
 * Ответ со списком рекомендованных карточек товара.
 */

#ifndef _GetSuggestedOfferMappingEntriesResponse_H_
#define _GetSuggestedOfferMappingEntriesResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "OfferMappingSuggestionsListDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ со списком рекомендованных карточек товара.
 *
 *  \ingroup Models
 *
 */

class GetSuggestedOfferMappingEntriesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetSuggestedOfferMappingEntriesResponse();
	GetSuggestedOfferMappingEntriesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetSuggestedOfferMappingEntriesResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ApiResponseStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(ApiResponseStatusType  status);
	/*! \brief Get 
	 */
	OfferMappingSuggestionsListDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OfferMappingSuggestionsListDTO  result);

private:
	ApiResponseStatusType status;
	OfferMappingSuggestionsListDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetSuggestedOfferMappingEntriesResponse_H_ */
