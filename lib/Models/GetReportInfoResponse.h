
/*
 * GetReportInfoResponse.h
 *
 * Ответ на запрос информации об отчете.
 */

#ifndef TINY_CPP_CLIENT_GetReportInfoResponse_H_
#define TINY_CPP_CLIENT_GetReportInfoResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "ReportInfoDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос информации об отчете.
 *
 *  \ingroup Models
 *
 */

class GetReportInfoResponse{
public:

    /*! \brief Constructor.
	 */
    GetReportInfoResponse();
    GetReportInfoResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetReportInfoResponse();


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
	ReportInfoDTO getResult();

	/*! \brief Set 
	 */
	void setResult(ReportInfoDTO  result);


    private:
    ApiResponseStatusType status;
    ReportInfoDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetReportInfoResponse_H_ */
