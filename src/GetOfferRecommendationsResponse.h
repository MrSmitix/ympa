/*
 * GetOfferRecommendationsResponse.h
 *
 * 
 */

#ifndef _GetOfferRecommendationsResponse_H_
#define _GetOfferRecommendationsResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "OfferRecommendationsResultDTO.h"
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

class GetOfferRecommendationsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetOfferRecommendationsResponse();
	GetOfferRecommendationsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetOfferRecommendationsResponse();

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
	OfferRecommendationsResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OfferRecommendationsResultDTO  result);

private:
	ApiResponseStatusType status;
	OfferRecommendationsResultDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetOfferRecommendationsResponse_H_ */
