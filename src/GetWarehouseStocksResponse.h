/*
 * GetWarehouseStocksResponse.h
 *
 * 
 */

#ifndef _GetWarehouseStocksResponse_H_
#define _GetWarehouseStocksResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "GetWarehouseStocksDTO.h"
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

class GetWarehouseStocksResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetWarehouseStocksResponse();
	GetWarehouseStocksResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetWarehouseStocksResponse();

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
	GetWarehouseStocksDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetWarehouseStocksDTO  result);

private:
	ApiResponseStatusType status;
	GetWarehouseStocksDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetWarehouseStocksResponse_H_ */
