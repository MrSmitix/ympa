
/*
 * GenerateReportDTO.h
 *
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 */

#ifndef TINY_CPP_CLIENT_GenerateReportDTO_H_
#define TINY_CPP_CLIENT_GenerateReportDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 *
 *  \ingroup Models
 *
 */

class GenerateReportDTO{
public:

    /*! \brief Constructor.
	 */
    GenerateReportDTO();
    GenerateReportDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenerateReportDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
	 */
	std::string getReportId();

	/*! \brief Set Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
	 */
	void setReportId(std::string  reportId);
	/*! \brief Get Ожидаемая продолжительность генерации в миллисекундах.
	 */
	long getEstimatedGenerationTime();

	/*! \brief Set Ожидаемая продолжительность генерации в миллисекундах.
	 */
	void setEstimatedGenerationTime(long  estimatedGenerationTime);


    private:
    std::string reportId{};
    long estimatedGenerationTime{};
};
}

#endif /* TINY_CPP_CLIENT_GenerateReportDTO_H_ */
