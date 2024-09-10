/*
 * GetQualityRatingResponse.h
 *
 * Информация об индексе качества магазинов.
 */

#ifndef _GetQualityRatingResponse_H_
#define _GetQualityRatingResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "CampaignsQualityRatingDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об индексе качества магазинов.
 *
 *  \ingroup Models
 *
 */

class GetQualityRatingResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetQualityRatingResponse();
	GetQualityRatingResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetQualityRatingResponse();

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
	CampaignsQualityRatingDTO getResult();

	/*! \brief Set 
	 */
	void setResult(CampaignsQualityRatingDTO  result);

private:
	ApiResponseStatusType status;
	CampaignsQualityRatingDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetQualityRatingResponse_H_ */
