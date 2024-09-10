/*
 * ReportInfoDTO.h
 *
 * Статус генерации и ссылка на готовый отчет.
 */

#ifndef _ReportInfoDTO_H_
#define _ReportInfoDTO_H_


#include <string>
#include "ReportStatusType.h"
#include "ReportSubStatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Статус генерации и ссылка на готовый отчет.
 *
 *  \ingroup Models
 *
 */

class ReportInfoDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ReportInfoDTO();
	ReportInfoDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ReportInfoDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ReportStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(ReportStatusType  status);
	/*! \brief Get 
	 */
	ReportSubStatusType getSubStatus();

	/*! \brief Set 
	 */
	void setSubStatus(ReportSubStatusType  subStatus);
	/*! \brief Get Дата и время запроса на генерацию.
	 */
	std::string getGenerationRequestedAt();

	/*! \brief Set Дата и время запроса на генерацию.
	 */
	void setGenerationRequestedAt(std::string  generationRequestedAt);
	/*! \brief Get Дата и время завершения генерации.
	 */
	std::string getGenerationFinishedAt();

	/*! \brief Set Дата и время завершения генерации.
	 */
	void setGenerationFinishedAt(std::string  generationFinishedAt);
	/*! \brief Get Ссылка на готовый отчет.
	 */
	std::string getFile();

	/*! \brief Set Ссылка на готовый отчет.
	 */
	void setFile(std::string  file);
	/*! \brief Get Ожидаемая продолжительность генерации в миллисекундах.
	 */
	long long getEstimatedGenerationTime();

	/*! \brief Set Ожидаемая продолжительность генерации в миллисекундах.
	 */
	void setEstimatedGenerationTime(long long  estimatedGenerationTime);

private:
	ReportStatusType status;
	ReportSubStatusType subStatus;
	std::string generationRequestedAt;
	std::string generationFinishedAt;
	std::string file;
	long long estimatedGenerationTime;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ReportInfoDTO_H_ */
