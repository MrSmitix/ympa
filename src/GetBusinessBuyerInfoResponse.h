/*
 * GetBusinessBuyerInfoResponse.h
 *
 * 
 */

#ifndef _GetBusinessBuyerInfoResponse_H_
#define _GetBusinessBuyerInfoResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "OrderBusinessBuyerDTO.h"
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

class GetBusinessBuyerInfoResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetBusinessBuyerInfoResponse();
	GetBusinessBuyerInfoResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetBusinessBuyerInfoResponse();

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
	OrderBusinessBuyerDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OrderBusinessBuyerDTO  result);

private:
	ApiResponseStatusType status;
	OrderBusinessBuyerDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetBusinessBuyerInfoResponse_H_ */
