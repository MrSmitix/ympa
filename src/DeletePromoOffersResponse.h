/*
 * DeletePromoOffersResponse.h
 *
 * Результат удаления товаров из акции.
 */

#ifndef _DeletePromoOffersResponse_H_
#define _DeletePromoOffersResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "DeletePromoOffersResultDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Результат удаления товаров из акции.
 *
 *  \ingroup Models
 *
 */

class DeletePromoOffersResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	DeletePromoOffersResponse();
	DeletePromoOffersResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeletePromoOffersResponse();

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
	DeletePromoOffersResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(DeletePromoOffersResultDTO  result);

private:
	ApiResponseStatusType status;
	DeletePromoOffersResultDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeletePromoOffersResponse_H_ */
