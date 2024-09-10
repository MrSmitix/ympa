/*
 * FeedbackReactionStatusType.h
 *
 * Статус реакции на отзыв:  * &#x60;ALL&#x60; — все отзывы.  * &#x60;NEED_REACTION&#x60; — отзывы, на которые нужно ответить. 
 */

#ifndef _FeedbackReactionStatusType_H_
#define _FeedbackReactionStatusType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Статус реакции на отзыв:  * `ALL` — все отзывы.  * `NEED_REACTION` — отзывы, на которые нужно ответить. 
 *
 *  \ingroup Models
 *
 */

class FeedbackReactionStatusType : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedbackReactionStatusType();
	FeedbackReactionStatusType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedbackReactionStatusType();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedbackReactionStatusType_H_ */
