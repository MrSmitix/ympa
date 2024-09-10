/*
 * GetSuggestedOfferMappingsResponse.h
 *
 * 
 */

#ifndef _GetSuggestedOfferMappingsResponse_H_
#define _GetSuggestedOfferMappingsResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "GetSuggestedOfferMappingsResultDTO.h"
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

class GetSuggestedOfferMappingsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetSuggestedOfferMappingsResponse();
	GetSuggestedOfferMappingsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetSuggestedOfferMappingsResponse();

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
	GetSuggestedOfferMappingsResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetSuggestedOfferMappingsResultDTO  result);

private:
	ApiResponseStatusType status;
	GetSuggestedOfferMappingsResultDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetSuggestedOfferMappingsResponse_H_ */
