/*
 * GetFeedIndexLogsResponse.h
 *
 * 
 */

#ifndef _GetFeedIndexLogsResponse_H_
#define _GetFeedIndexLogsResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "FeedIndexLogsResultDTO.h"
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

class GetFeedIndexLogsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetFeedIndexLogsResponse();
	GetFeedIndexLogsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetFeedIndexLogsResponse();

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
	FeedIndexLogsResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(FeedIndexLogsResultDTO  result);

private:
	ApiResponseStatusType status;
	FeedIndexLogsResultDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetFeedIndexLogsResponse_H_ */
