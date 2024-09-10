/*
 * GenerateReportDTO.h
 *
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 */

#ifndef _GenerateReportDTO_H_
#define _GenerateReportDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 *
 *  \ingroup Models
 *
 */

class GenerateReportDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GenerateReportDTO();
	GenerateReportDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenerateReportDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
	 */
	std::string getReportId();

	/*! \brief Set Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
	 */
	void setReportId(std::string  reportId);
	/*! \brief Get Ожидаемая продолжительность генерации в миллисекундах.
	 */
	long long getEstimatedGenerationTime();

	/*! \brief Set Ожидаемая продолжительность генерации в миллисекундах.
	 */
	void setEstimatedGenerationTime(long long  estimatedGenerationTime);

private:
	std::string reportId;
	long long estimatedGenerationTime;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenerateReportDTO_H_ */
