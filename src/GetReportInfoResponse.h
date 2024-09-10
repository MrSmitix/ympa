/*
 * GetReportInfoResponse.h
 *
 * Ответ на запрос информации об отчете.
 */

#ifndef _GetReportInfoResponse_H_
#define _GetReportInfoResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "ReportInfoDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос информации об отчете.
 *
 *  \ingroup Models
 *
 */

class GetReportInfoResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetReportInfoResponse();
	GetReportInfoResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetReportInfoResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetReportInfoResponse_H_ */
