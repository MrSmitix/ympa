/*
 * FeedbackStateType.h
 *
 * Статус отзыва:  * &#x60;LAST&#x60; — актуален. * &#x60;PREVIOUS&#x60; — устарел. * &#x60;DELETED&#x60; — удален. 
 */

#ifndef _FeedbackStateType_H_
#define _FeedbackStateType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Статус отзыва:  * `LAST` — актуален. * `PREVIOUS` — устарел. * `DELETED` — удален. 
 *
 *  \ingroup Models
 *
 */

class FeedbackStateType : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedbackStateType();
	FeedbackStateType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedbackStateType();

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

#endif /* _FeedbackStateType_H_ */
