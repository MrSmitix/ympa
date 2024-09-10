
/*
 * ReportInfoDTO.h
 *
 * Статус генерации и ссылка на готовый отчет.
 */

#ifndef TINY_CPP_CLIENT_ReportInfoDTO_H_
#define TINY_CPP_CLIENT_ReportInfoDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ReportStatusType.h"
#include "ReportSubStatusType.h"

namespace Tiny {


/*! \brief Статус генерации и ссылка на готовый отчет.
 *
 *  \ingroup Models
 *
 */

class ReportInfoDTO{
public:

    /*! \brief Constructor.
	 */
    ReportInfoDTO();
    ReportInfoDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ReportInfoDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	long getEstimatedGenerationTime();

	/*! \brief Set Ожидаемая продолжительность генерации в миллисекундах.
	 */
	void setEstimatedGenerationTime(long  estimatedGenerationTime);


    private:
    ReportStatusType status;
    ReportSubStatusType subStatus;
    std::string generationRequestedAt{};
    std::string generationFinishedAt{};
    std::string file{};
    long estimatedGenerationTime{};
};
}

#endif /* TINY_CPP_CLIENT_ReportInfoDTO_H_ */
