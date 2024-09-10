/*
 * GetGoodsFeedbackCommentsResponse.h
 *
 * 
 */

#ifndef _GetGoodsFeedbackCommentsResponse_H_
#define _GetGoodsFeedbackCommentsResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "GoodsFeedbackCommentListDTO.h"
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

class GetGoodsFeedbackCommentsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetGoodsFeedbackCommentsResponse();
	GetGoodsFeedbackCommentsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetGoodsFeedbackCommentsResponse();

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
	GoodsFeedbackCommentListDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GoodsFeedbackCommentListDTO  result);

private:
	ApiResponseStatusType status;
	GoodsFeedbackCommentListDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetGoodsFeedbackCommentsResponse_H_ */
