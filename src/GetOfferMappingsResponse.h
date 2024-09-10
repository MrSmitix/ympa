/*
 * GetOfferMappingsResponse.h
 *
 * 
 */

#ifndef _GetOfferMappingsResponse_H_
#define _GetOfferMappingsResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "GetOfferMappingsResultDTO.h"
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

class GetOfferMappingsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetOfferMappingsResponse();
	GetOfferMappingsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetOfferMappingsResponse();

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
	GetOfferMappingsResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetOfferMappingsResultDTO  result);

private:
	ApiResponseStatusType status;
	GetOfferMappingsResultDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetOfferMappingsResponse_H_ */
