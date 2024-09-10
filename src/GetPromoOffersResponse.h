/*
 * GetPromoOffersResponse.h
 *
 * 
 */

#ifndef _GetPromoOffersResponse_H_
#define _GetPromoOffersResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "GetPromoOffersResultDTO.h"
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

class GetPromoOffersResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPromoOffersResponse();
	GetPromoOffersResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPromoOffersResponse();

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
	GetPromoOffersResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetPromoOffersResultDTO  result);

private:
	ApiResponseStatusType status;
	GetPromoOffersResultDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPromoOffersResponse_H_ */
