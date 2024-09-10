
/*
 * FeedIndexLogsRecordDTO.h
 *
 * Список отчетов по индексации прайс-листа.
 */

#ifndef TINY_CPP_CLIENT_FeedIndexLogsRecordDTO_H_
#define TINY_CPP_CLIENT_FeedIndexLogsRecordDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedIndexLogsErrorDTO.h"
#include "FeedIndexLogsIndexType.h"
#include "FeedIndexLogsOffersDTO.h"
#include "FeedIndexLogsStatusType.h"

namespace Tiny {


/*! \brief Список отчетов по индексации прайс-листа.
 *
 *  \ingroup Models
 *
 */

class FeedIndexLogsRecordDTO{
public:

    /*! \brief Constructor.
	 */
    FeedIndexLogsRecordDTO();
    FeedIndexLogsRecordDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FeedIndexLogsRecordDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	 */
	std::string getDownloadTime();

	/*! \brief Set Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	 */
	void setDownloadTime(std::string  downloadTime);
	/*! \brief Get Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	 */
	std::string getFileTime();

	/*! \brief Set Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	 */
	void setFileTime(std::string  fileTime);
	/*! \brief Get Идентификатор индексации.
	 */
	long getGenerationId();

	/*! \brief Set Идентификатор индексации.
	 */
	void setGenerationId(long  generationId);
	/*! \brief Get 
	 */
	FeedIndexLogsIndexType getIndexType();

	/*! \brief Set 
	 */
	void setIndexType(FeedIndexLogsIndexType  indexType);
	/*! \brief Get Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	 */
	std::string getPublishedTime();

	/*! \brief Set Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	 */
	void setPublishedTime(std::string  publishedTime);
	/*! \brief Get 
	 */
	FeedIndexLogsStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(FeedIndexLogsStatusType  status);
	/*! \brief Get 
	 */
	FeedIndexLogsErrorDTO getError();

	/*! \brief Set 
	 */
	void setError(FeedIndexLogsErrorDTO  error);
	/*! \brief Get 
	 */
	FeedIndexLogsOffersDTO getOffers();

	/*! \brief Set 
	 */
	void setOffers(FeedIndexLogsOffersDTO  offers);


    private:
    std::string downloadTime{};
    std::string fileTime{};
    long generationId{};
    FeedIndexLogsIndexType indexType;
    std::string publishedTime{};
    FeedIndexLogsStatusType status;
    FeedIndexLogsErrorDTO error;
    FeedIndexLogsOffersDTO offers;
};
}

#endif /* TINY_CPP_CLIENT_FeedIndexLogsRecordDTO_H_ */
