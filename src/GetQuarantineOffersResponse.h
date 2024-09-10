/*
 * GetQuarantineOffersResponse.h
 *
 * Ответ на запрос списка товаров в карантине.
 */

#ifndef _GetQuarantineOffersResponse_H_
#define _GetQuarantineOffersResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "GetQuarantineOffersResultDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос списка товаров в карантине.
 *
 *  \ingroup Models
 *
 */

class GetQuarantineOffersResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetQuarantineOffersResponse();
	GetQuarantineOffersResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetQuarantineOffersResponse();

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
	GetQuarantineOffersResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetQuarantineOffersResultDTO  result);

private:
	ApiResponseStatusType status;
	GetQuarantineOffersResultDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetQuarantineOffersResponse_H_ */
