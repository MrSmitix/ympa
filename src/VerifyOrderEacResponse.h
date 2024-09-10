/*
 * VerifyOrderEacResponse.h
 *
 * 
 */

#ifndef _VerifyOrderEacResponse_H_
#define _VerifyOrderEacResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "EacVerificationResultDTO.h"
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

class VerifyOrderEacResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	VerifyOrderEacResponse();
	VerifyOrderEacResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VerifyOrderEacResponse();

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
	EacVerificationResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(EacVerificationResultDTO  result);

private:
	ApiResponseStatusType status;
	EacVerificationResultDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VerifyOrderEacResponse_H_ */
