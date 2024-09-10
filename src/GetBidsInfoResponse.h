/*
 * GetBidsInfoResponse.h
 *
 * description.
 */

#ifndef _GetBidsInfoResponse_H_
#define _GetBidsInfoResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "GetBidsInfoResponseDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief description.
 *
 *  \ingroup Models
 *
 */

class GetBidsInfoResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetBidsInfoResponse();
	GetBidsInfoResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetBidsInfoResponse();

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
	GetBidsInfoResponseDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetBidsInfoResponseDTO  result);

private:
	ApiResponseStatusType status;
	GetBidsInfoResponseDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetBidsInfoResponse_H_ */
