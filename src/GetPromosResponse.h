/*
 * GetPromosResponse.h
 *
 * 
 */

#ifndef _GetPromosResponse_H_
#define _GetPromosResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "GetPromosResultDTO.h"
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

class GetPromosResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPromosResponse();
	GetPromosResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPromosResponse();

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
	GetPromosResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetPromosResultDTO  result);

private:
	ApiResponseStatusType status;
	GetPromosResultDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPromosResponse_H_ */
