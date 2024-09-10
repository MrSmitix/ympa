
/*
 * FeedIndexLogsResultDTO.h
 *
 * Результат выполнения запроса отчета по индексации прайс-листа.
 */

#ifndef TINY_CPP_CLIENT_FeedIndexLogsResultDTO_H_
#define TINY_CPP_CLIENT_FeedIndexLogsResultDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedIndexLogsFeedDTO.h"
#include "FeedIndexLogsRecordDTO.h"
#include <list>

namespace Tiny {


/*! \brief Результат выполнения запроса отчета по индексации прайс-листа.
 *
 *  \ingroup Models
 *
 */

class FeedIndexLogsResultDTO{
public:

    /*! \brief Constructor.
	 */
    FeedIndexLogsResultDTO();
    FeedIndexLogsResultDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedIndexLogsResultDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	long getTotal();

	/*! \brief Set Количество отчетов на всех страницах выходных данных.
	 */
	void setTotal(long  total);


    private:
    FeedIndexLogsFeedDTO feed;
    std::list<FeedIndexLogsRecordDTO> indexLogRecords;
    long total{};
};
}

#endif /* TINY_CPP_CLIENT_FeedIndexLogsResultDTO_H_ */
