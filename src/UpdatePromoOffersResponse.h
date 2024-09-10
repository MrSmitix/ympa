/*
 * UpdatePromoOffersResponse.h
 *
 * Результат добавления товаров в акцию.
 */

#ifndef _UpdatePromoOffersResponse_H_
#define _UpdatePromoOffersResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "UpdatePromoOffersResultDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Результат добавления товаров в акцию.
 *
 *  \ingroup Models
 *
 */

class UpdatePromoOffersResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdatePromoOffersResponse();
	UpdatePromoOffersResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdatePromoOffersResponse();

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
	UpdatePromoOffersResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(UpdatePromoOffersResultDTO  result);

private:
	ApiResponseStatusType status;
	UpdatePromoOffersResultDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdatePromoOffersResponse_H_ */
