/*
 * GetShipmentOrdersInfoResponse.h
 *
 * 
 */

#ifndef _GetShipmentOrdersInfoResponse_H_
#define _GetShipmentOrdersInfoResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "OrdersShipmentInfoDTO.h"
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

class GetShipmentOrdersInfoResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetShipmentOrdersInfoResponse();
	GetShipmentOrdersInfoResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetShipmentOrdersInfoResponse();

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
	OrdersShipmentInfoDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OrdersShipmentInfoDTO  result);

private:
	ApiResponseStatusType status;
	OrdersShipmentInfoDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetShipmentOrdersInfoResponse_H_ */
