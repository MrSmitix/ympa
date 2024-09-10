/*
 * SkipGoodsFeedbackReactionRequest.h
 *
 * Идентификаторы отзывов.
 */

#ifndef _SkipGoodsFeedbackReactionRequest_H_
#define _SkipGoodsFeedbackReactionRequest_H_


#include <string>
#include "Set.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Идентификаторы отзывов.
 *
 *  \ingroup Models
 *
 */

class SkipGoodsFeedbackReactionRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	SkipGoodsFeedbackReactionRequest();
	SkipGoodsFeedbackReactionRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SkipGoodsFeedbackReactionRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список идентификаторов отзывов, на которые магазин не будет отвечать.
	 */
	Set<long long> getFeedbackIds();

	/*! \brief Set Список идентификаторов отзывов, на которые магазин не будет отвечать.
	 */
	void setFeedbackIds(Set <long long> feedbackIds);

private:
	Set <long long>feedbackIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SkipGoodsFeedbackReactionRequest_H_ */
