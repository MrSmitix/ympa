/*
 * CalculateTariffsResponse.h
 *
 * 
 */

#ifndef _CalculateTariffsResponse_H_
#define _CalculateTariffsResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "CalculateTariffsResponseDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CalculateTariffsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CalculateTariffsResponse();
	CalculateTariffsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CalculateTariffsResponse();

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
	CalculateTariffsResponseDTO getResult();

	/*! \brief Set 
	 */
	void setResult(CalculateTariffsResponseDTO  result);

private:
	ApiResponseStatusType status;
	CalculateTariffsResponseDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CalculateTariffsResponse_H_ */
