/*
 * UpdateGoodsFeedbackCommentRequest.h
 *
 * Комментарий к отзыву.
 */

#ifndef _UpdateGoodsFeedbackCommentRequest_H_
#define _UpdateGoodsFeedbackCommentRequest_H_


#include <string>
#include "UpdateGoodsFeedbackCommentDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Комментарий к отзыву.
 *
 *  \ingroup Models
 *
 */

class UpdateGoodsFeedbackCommentRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateGoodsFeedbackCommentRequest();
	UpdateGoodsFeedbackCommentRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateGoodsFeedbackCommentRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор отзыва. 
	 */
	long long getFeedbackId();

	/*! \brief Set Идентификатор отзыва. 
	 */
	void setFeedbackId(long long  feedbackId);
	/*! \brief Get 
	 */
	UpdateGoodsFeedbackCommentDTO getComment();

	/*! \brief Set 
	 */
	void setComment(UpdateGoodsFeedbackCommentDTO  comment);

private:
	long long feedbackId;
	UpdateGoodsFeedbackCommentDTO comment;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateGoodsFeedbackCommentRequest_H_ */
