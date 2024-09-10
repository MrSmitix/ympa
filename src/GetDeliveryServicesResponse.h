/*
 * GetDeliveryServicesResponse.h
 *
 * Ответ на запрос списка служб доставки.
 */

#ifndef _GetDeliveryServicesResponse_H_
#define _GetDeliveryServicesResponse_H_


#include <string>
#include "DeliveryServicesDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос списка служб доставки.
 *
 *  \ingroup Models
 *
 */

class GetDeliveryServicesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetDeliveryServicesResponse();
	GetDeliveryServicesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetDeliveryServicesResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	DeliveryServicesDTO getResult();

	/*! \brief Set 
	 */
	void setResult(DeliveryServicesDTO  result);

private:
	DeliveryServicesDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetDeliveryServicesResponse_H_ */
