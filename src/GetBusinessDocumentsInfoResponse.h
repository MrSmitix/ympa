/*
 * GetBusinessDocumentsInfoResponse.h
 *
 * 
 */

#ifndef _GetBusinessDocumentsInfoResponse_H_
#define _GetBusinessDocumentsInfoResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "OrderBusinessDocumentsDTO.h"
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

class GetBusinessDocumentsInfoResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetBusinessDocumentsInfoResponse();
	GetBusinessDocumentsInfoResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetBusinessDocumentsInfoResponse();

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
	OrderBusinessDocumentsDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OrderBusinessDocumentsDTO  result);

private:
	ApiResponseStatusType status;
	OrderBusinessDocumentsDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetBusinessDocumentsInfoResponse_H_ */
