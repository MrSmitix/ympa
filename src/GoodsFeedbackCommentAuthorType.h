/*
 * GoodsFeedbackCommentAuthorType.h
 *
 * Тип автора:  * &#x60;USER&#x60; — пользователь. * &#x60;BUSINESS&#x60; — кабинет. 
 */

#ifndef _GoodsFeedbackCommentAuthorType_H_
#define _GoodsFeedbackCommentAuthorType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Тип автора:  * `USER` — пользователь. * `BUSINESS` — кабинет. 
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackCommentAuthorType : public Object {
public:
	/*! \brief Constructor.
	 */
	GoodsFeedbackCommentAuthorType();
	GoodsFeedbackCommentAuthorType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoodsFeedbackCommentAuthorType();

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

#endif /* _GoodsFeedbackCommentAuthorType_H_ */
