/*
 * GetOrderBuyerInfoResponse.h
 *
 * 
 */

#ifndef _GetOrderBuyerInfoResponse_H_
#define _GetOrderBuyerInfoResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "OrderBuyerInfoDTO.h"
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

class GetOrderBuyerInfoResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetOrderBuyerInfoResponse();
	GetOrderBuyerInfoResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetOrderBuyerInfoResponse();

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
	OrderBuyerInfoDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OrderBuyerInfoDTO  result);

private:
	ApiResponseStatusType status;
	OrderBuyerInfoDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetOrderBuyerInfoResponse_H_ */
