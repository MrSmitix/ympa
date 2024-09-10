/*
 * GetOutletLicensesResponse.h
 *
 * 
 */

#ifndef _GetOutletLicensesResponse_H_
#define _GetOutletLicensesResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "OutletLicensesResponseDTO.h"
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

class GetOutletLicensesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetOutletLicensesResponse();
	GetOutletLicensesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetOutletLicensesResponse();

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
	OutletLicensesResponseDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OutletLicensesResponseDTO  result);

private:
	ApiResponseStatusType status;
	OutletLicensesResponseDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetOutletLicensesResponse_H_ */
