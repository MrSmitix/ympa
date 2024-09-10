/*
 * FeedIndexLogsRecordDTO.h
 *
 * Список отчетов по индексации прайс-листа.
 */

#ifndef _FeedIndexLogsRecordDTO_H_
#define _FeedIndexLogsRecordDTO_H_


#include <string>
#include "FeedIndexLogsErrorDTO.h"
#include "FeedIndexLogsIndexType.h"
#include "FeedIndexLogsOffersDTO.h"
#include "FeedIndexLogsStatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список отчетов по индексации прайс-листа.
 *
 *  \ingroup Models
 *
 */

class FeedIndexLogsRecordDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedIndexLogsRecordDTO();
	FeedIndexLogsRecordDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedIndexLogsRecordDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	long long getGenerationId();

	/*! \brief Set Идентификатор индексации.
	 */
	void setGenerationId(long long  generationId);
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
	std::string downloadTime;
	std::string fileTime;
	long long generationId;
	FeedIndexLogsIndexType indexType;
	std::string publishedTime;
	FeedIndexLogsStatusType status;
	FeedIndexLogsErrorDTO error;
	FeedIndexLogsOffersDTO offers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedIndexLogsRecordDTO_H_ */
