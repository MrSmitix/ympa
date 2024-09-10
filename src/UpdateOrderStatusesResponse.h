/*
 * UpdateOrderStatusesResponse.h
 *
 * 
 */

#ifndef _UpdateOrderStatusesResponse_H_
#define _UpdateOrderStatusesResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "UpdateOrderStatusesDTO.h"
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

class UpdateOrderStatusesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateOrderStatusesResponse();
	UpdateOrderStatusesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateOrderStatusesResponse();

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
	UpdateOrderStatusesDTO getResult();

	/*! \brief Set 
	 */
	void setResult(UpdateOrderStatusesDTO  result);

private:
	ApiResponseStatusType status;
	UpdateOrderStatusesDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateOrderStatusesResponse_H_ */
