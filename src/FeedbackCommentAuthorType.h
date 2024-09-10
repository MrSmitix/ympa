/*
 * FeedbackCommentAuthorType.h
 *
 * Тип автора:  * &#x60;USER&#x60; — пользователь. * &#x60;SHOP&#x60; — магазин. 
 */

#ifndef _FeedbackCommentAuthorType_H_
#define _FeedbackCommentAuthorType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Тип автора:  * `USER` — пользователь. * `SHOP` — магазин. 
 *
 *  \ingroup Models
 *
 */

class FeedbackCommentAuthorType : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedbackCommentAuthorType();
	FeedbackCommentAuthorType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedbackCommentAuthorType();

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

#endif /* _FeedbackCommentAuthorType_H_ */
