/*
 * GetPricesResponse.h
 *
 * Ответ на запрос списка цен.
 */

#ifndef _GetPricesResponse_H_
#define _GetPricesResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "OfferPriceListResponseDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос списка цен.
 *
 *  \ingroup Models
 *
 */

class GetPricesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPricesResponse();
	GetPricesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPricesResponse();

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
	OfferPriceListResponseDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OfferPriceListResponseDTO  result);

private:
	ApiResponseStatusType status;
	OfferPriceListResponseDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPricesResponse_H_ */
