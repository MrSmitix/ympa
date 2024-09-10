/*
 * GetFulfillmentWarehousesResponse.h
 *
 * 
 */

#ifndef _GetFulfillmentWarehousesResponse_H_
#define _GetFulfillmentWarehousesResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "FulfillmentWarehousesDTO.h"
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

class GetFulfillmentWarehousesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetFulfillmentWarehousesResponse();
	GetFulfillmentWarehousesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetFulfillmentWarehousesResponse();

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
	FulfillmentWarehousesDTO getResult();

	/*! \brief Set 
	 */
	void setResult(FulfillmentWarehousesDTO  result);

private:
	ApiResponseStatusType status;
	FulfillmentWarehousesDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetFulfillmentWarehousesResponse_H_ */
