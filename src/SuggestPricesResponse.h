/*
 * SuggestPricesResponse.h
 *
 * Ответ на запрос списка цен для продвижения.
 */

#ifndef _SuggestPricesResponse_H_
#define _SuggestPricesResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "SuggestPricesResultDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос списка цен для продвижения.
 *
 *  \ingroup Models
 *
 */

class SuggestPricesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	SuggestPricesResponse();
	SuggestPricesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SuggestPricesResponse();

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
	SuggestPricesResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(SuggestPricesResultDTO  result);

private:
	ApiResponseStatusType status;
	SuggestPricesResultDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SuggestPricesResponse_H_ */
