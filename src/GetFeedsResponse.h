/*
 * GetFeedsResponse.h
 *
 * Ответ на запрос списка прайс-листов.
 */

#ifndef _GetFeedsResponse_H_
#define _GetFeedsResponse_H_


#include <string>
#include "FeedDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос списка прайс-листов.
 *
 *  \ingroup Models
 *
 */

class GetFeedsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetFeedsResponse();
	GetFeedsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetFeedsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список прайс-листов.
	 */
	std::list<FeedDTO> getFeeds();

	/*! \brief Set Список прайс-листов.
	 */
	void setFeeds(std::list <FeedDTO> feeds);

private:
	std::list <FeedDTO>feeds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetFeedsResponse_H_ */
