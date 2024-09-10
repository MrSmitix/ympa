/*
 * DeleteGoodsFeedbackCommentRequest.h
 *
 * Фильтр запроса отзывов по бизнесу. 
 */

#ifndef _DeleteGoodsFeedbackCommentRequest_H_
#define _DeleteGoodsFeedbackCommentRequest_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Фильтр запроса отзывов по бизнесу. 
 *
 *  \ingroup Models
 *
 */

class DeleteGoodsFeedbackCommentRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteGoodsFeedbackCommentRequest();
	DeleteGoodsFeedbackCommentRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteGoodsFeedbackCommentRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор комментария к отзыву. 
	 */
	long long getId();

	/*! \brief Set Идентификатор комментария к отзыву. 
	 */
	void setId(long long  id);

private:
	long long id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteGoodsFeedbackCommentRequest_H_ */
