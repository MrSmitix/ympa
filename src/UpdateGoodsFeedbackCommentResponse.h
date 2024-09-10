/*
 * UpdateGoodsFeedbackCommentResponse.h
 *
 * 
 */

#ifndef _UpdateGoodsFeedbackCommentResponse_H_
#define _UpdateGoodsFeedbackCommentResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "GoodsFeedbackCommentDTO.h"
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

class UpdateGoodsFeedbackCommentResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateGoodsFeedbackCommentResponse();
	UpdateGoodsFeedbackCommentResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateGoodsFeedbackCommentResponse();

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
	GoodsFeedbackCommentDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GoodsFeedbackCommentDTO  result);

private:
	ApiResponseStatusType status;
	GoodsFeedbackCommentDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateGoodsFeedbackCommentResponse_H_ */
