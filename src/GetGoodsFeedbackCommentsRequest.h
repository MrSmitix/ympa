/*
 * GetGoodsFeedbackCommentsRequest.h
 *
 * Фильтр запроса комментариев отзыва. 
 */

#ifndef _GetGoodsFeedbackCommentsRequest_H_
#define _GetGoodsFeedbackCommentsRequest_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Фильтр запроса комментариев отзыва. 
 *
 *  \ingroup Models
 *
 */

class GetGoodsFeedbackCommentsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetGoodsFeedbackCommentsRequest();
	GetGoodsFeedbackCommentsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetGoodsFeedbackCommentsRequest();

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

private:
	long long feedbackId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetGoodsFeedbackCommentsRequest_H_ */
