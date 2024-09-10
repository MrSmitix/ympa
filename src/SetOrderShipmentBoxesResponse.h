/*
 * SetOrderShipmentBoxesResponse.h
 *
 * 
 */

#ifndef _SetOrderShipmentBoxesResponse_H_
#define _SetOrderShipmentBoxesResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "ShipmentBoxesDTO.h"
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

class SetOrderShipmentBoxesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	SetOrderShipmentBoxesResponse();
	SetOrderShipmentBoxesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SetOrderShipmentBoxesResponse();

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
	ShipmentBoxesDTO getResult();

	/*! \brief Set 
	 */
	void setResult(ShipmentBoxesDTO  result);

private:
	ApiResponseStatusType status;
	ShipmentBoxesDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SetOrderShipmentBoxesResponse_H_ */
