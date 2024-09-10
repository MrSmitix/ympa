/*
 * GetChatsResponse.h
 *
 * 
 */

#ifndef _GetChatsResponse_H_
#define _GetChatsResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "GetChatsInfoDTO.h"
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

class GetChatsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetChatsResponse();
	GetChatsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetChatsResponse();

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
	GetChatsInfoDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetChatsInfoDTO  result);

private:
	ApiResponseStatusType status;
	GetChatsInfoDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetChatsResponse_H_ */
