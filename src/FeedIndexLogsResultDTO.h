/*
 * FeedIndexLogsResultDTO.h
 *
 * Результат выполнения запроса отчета по индексации прайс-листа.
 */

#ifndef _FeedIndexLogsResultDTO_H_
#define _FeedIndexLogsResultDTO_H_


#include <string>
#include "FeedIndexLogsFeedDTO.h"
#include "FeedIndexLogsRecordDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Результат выполнения запроса отчета по индексации прайс-листа.
 *
 *  \ingroup Models
 *
 */

class FeedIndexLogsResultDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedIndexLogsResultDTO();
	FeedIndexLogsResultDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedIndexLogsResultDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	FeedIndexLogsFeedDTO getFeed();

	/*! \brief Set 
	 */
	void setFeed(FeedIndexLogsFeedDTO  feed);
	/*! \brief Get Список отчетов по индексации прайс-листа.
	 */
	std::list<FeedIndexLogsRecordDTO> getIndexLogRecords();

	/*! \brief Set Список отчетов по индексации прайс-листа.
	 */
	void setIndexLogRecords(std::list <FeedIndexLogsRecordDTO> indexLogRecords);
	/*! \brief Get Количество отчетов на всех страницах выходных данных.
	 */
	long long getTotal();

	/*! \brief Set Количество отчетов на всех страницах выходных данных.
	 */
	void setTotal(long long  total);

private:
	FeedIndexLogsFeedDTO feed;
	std::list <FeedIndexLogsRecordDTO>indexLogRecords;
	long long total;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedIndexLogsResultDTO_H_ */
