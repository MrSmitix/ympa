/*
 * FeedIndexLogsOffersDTO.h
 *
 * Информация о предложениях прайс-листа.
 */

#ifndef _FeedIndexLogsOffersDTO_H_
#define _FeedIndexLogsOffersDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о предложениях прайс-листа.
 *
 *  \ingroup Models
 *
 */

class FeedIndexLogsOffersDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedIndexLogsOffersDTO();
	FeedIndexLogsOffersDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedIndexLogsOffersDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
	 */
	long long getRejectedCount();

	/*! \brief Set Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
	 */
	void setRejectedCount(long long  rejectedCount);
	/*! \brief Get Количество предложений в прайс-листе.
	 */
	long long getTotalCount();

	/*! \brief Set Количество предложений в прайс-листе.
	 */
	void setTotalCount(long long  totalCount);

private:
	long long rejectedCount;
	long long totalCount;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedIndexLogsOffersDTO_H_ */
