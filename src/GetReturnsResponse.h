/*
 * GetReturnsResponse.h
 *
 * 
 */

#ifndef _GetReturnsResponse_H_
#define _GetReturnsResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "PagedReturnsDTO.h"
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

class GetReturnsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetReturnsResponse();
	GetReturnsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetReturnsResponse();

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
	PagedReturnsDTO getResult();

	/*! \brief Set 
	 */
	void setResult(PagedReturnsDTO  result);

private:
	ApiResponseStatusType status;
	PagedReturnsDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetReturnsResponse_H_ */
