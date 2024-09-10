
/*
 * GenerateReportResponse.h
 *
 * Ответ на запрос генерации отчета.
 */

#ifndef TINY_CPP_CLIENT_GenerateReportResponse_H_
#define TINY_CPP_CLIENT_GenerateReportResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "GenerateReportDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос генерации отчета.
 *
 *  \ingroup Models
 *
 */

class GenerateReportResponse{
public:

    /*! \brief Constructor.
	 */
    GenerateReportResponse();
    GenerateReportResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenerateReportResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ApiResponseStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(ApiResponseStatusType  status);
	/*! \brief Get 
	 */
	GenerateReportDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GenerateReportDTO  result);


    private:
    ApiResponseStatusType status;
    GenerateReportDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GenerateReportResponse_H_ */
