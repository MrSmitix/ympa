/*
 * GenerateReportResponse.h
 *
 * Ответ на запрос генерации отчета.
 */

#ifndef _GenerateReportResponse_H_
#define _GenerateReportResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "GenerateReportDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос генерации отчета.
 *
 *  \ingroup Models
 *
 */

class GenerateReportResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GenerateReportResponse();
	GenerateReportResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenerateReportResponse();

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
	GenerateReportDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GenerateReportDTO  result);

private:
	ApiResponseStatusType status;
	GenerateReportDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenerateReportResponse_H_ */
