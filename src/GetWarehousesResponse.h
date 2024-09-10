/*
 * GetWarehousesResponse.h
 *
 * 
 */

#ifndef _GetWarehousesResponse_H_
#define _GetWarehousesResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "WarehousesDTO.h"
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

class GetWarehousesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetWarehousesResponse();
	GetWarehousesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetWarehousesResponse();

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
	WarehousesDTO getResult();

	/*! \brief Set 
	 */
	void setResult(WarehousesDTO  result);

private:
	ApiResponseStatusType status;
	WarehousesDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetWarehousesResponse_H_ */
