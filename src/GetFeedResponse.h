/*
 * GetFeedResponse.h
 *
 * Ответ на запрос информации о прайс-листе.
 */

#ifndef _GetFeedResponse_H_
#define _GetFeedResponse_H_


#include <string>
#include "FeedDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос информации о прайс-листе.
 *
 *  \ingroup Models
 *
 */

class GetFeedResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetFeedResponse();
	GetFeedResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetFeedResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	FeedDTO getFeed();

	/*! \brief Set 
	 */
	void setFeed(FeedDTO  feed);

private:
	FeedDTO feed;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetFeedResponse_H_ */
