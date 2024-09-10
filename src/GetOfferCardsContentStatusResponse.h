/*
 * GetOfferCardsContentStatusResponse.h
 *
 * Ответ со списком состояний товаров и пагинацией.
 */

#ifndef _GetOfferCardsContentStatusResponse_H_
#define _GetOfferCardsContentStatusResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "OfferCardsContentStatusDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ со списком состояний товаров и пагинацией.
 *
 *  \ingroup Models
 *
 */

class GetOfferCardsContentStatusResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetOfferCardsContentStatusResponse();
	GetOfferCardsContentStatusResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetOfferCardsContentStatusResponse();

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
	OfferCardsContentStatusDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OfferCardsContentStatusDTO  result);

private:
	ApiResponseStatusType status;
	OfferCardsContentStatusDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetOfferCardsContentStatusResponse_H_ */
