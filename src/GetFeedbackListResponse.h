/*
 * GetFeedbackListResponse.h
 *
 * 
 */

#ifndef _GetFeedbackListResponse_H_
#define _GetFeedbackListResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "FeedbackListDTO.h"
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

class GetFeedbackListResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetFeedbackListResponse();
	GetFeedbackListResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetFeedbackListResponse();

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
	FeedbackListDTO getResult();

	/*! \brief Set 
	 */
	void setResult(FeedbackListDTO  result);

private:
	ApiResponseStatusType status;
	FeedbackListDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetFeedbackListResponse_H_ */
