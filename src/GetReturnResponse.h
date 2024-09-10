/*
 * GetReturnResponse.h
 *
 * 
 */

#ifndef _GetReturnResponse_H_
#define _GetReturnResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "ReturnDTO.h"
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

class GetReturnResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetReturnResponse();
	GetReturnResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetReturnResponse();

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
	ReturnDTO getResult();

	/*! \brief Set 
	 */
	void setResult(ReturnDTO  result);

private:
	ApiResponseStatusType status;
	ReturnDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetReturnResponse_H_ */
