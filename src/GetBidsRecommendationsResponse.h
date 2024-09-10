/*
 * GetBidsRecommendationsResponse.h
 *
 * description.
 */

#ifndef _GetBidsRecommendationsResponse_H_
#define _GetBidsRecommendationsResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "GetBidsRecommendationsResponseDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief description.
 *
 *  \ingroup Models
 *
 */

class GetBidsRecommendationsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetBidsRecommendationsResponse();
	GetBidsRecommendationsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetBidsRecommendationsResponse();

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
	GetBidsRecommendationsResponseDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetBidsRecommendationsResponseDTO  result);

private:
	ApiResponseStatusType status;
	GetBidsRecommendationsResponseDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetBidsRecommendationsResponse_H_ */
