/*
 * GoodsFeedbackCommentStatusType.h
 *
 * Статус комментария:  * &#x60;PUBLISHED&#x60; — опубликован. * &#x60;UNMODERATED&#x60; — не проверен. * &#x60;BANNED&#x60; — заблокирован. * &#x60;DELETED&#x60; — удален. 
 */

#ifndef _GoodsFeedbackCommentStatusType_H_
#define _GoodsFeedbackCommentStatusType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Статус комментария:  * `PUBLISHED` — опубликован. * `UNMODERATED` — не проверен. * `BANNED` — заблокирован. * `DELETED` — удален. 
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackCommentStatusType : public Object {
public:
	/*! \brief Constructor.
	 */
	GoodsFeedbackCommentStatusType();
	GoodsFeedbackCommentStatusType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoodsFeedbackCommentStatusType();

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

#endif /* _GoodsFeedbackCommentStatusType_H_ */
