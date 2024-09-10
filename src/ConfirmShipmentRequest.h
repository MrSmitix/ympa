/*
 * ConfirmShipmentRequest.h
 *
 * Запрос для подтверждения отгрузки.
 */

#ifndef _ConfirmShipmentRequest_H_
#define _ConfirmShipmentRequest_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос для подтверждения отгрузки.
 *
 *  \ingroup Models
 *
 */

class ConfirmShipmentRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	ConfirmShipmentRequest();
	ConfirmShipmentRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConfirmShipmentRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор отгрузки в системе поставщика.
	 */
	std::string getExternalShipmentId();

	/*! \brief Set Идентификатор отгрузки в системе поставщика.
	 */
	void setExternalShipmentId(std::string  externalShipmentId);

private:
	std::string externalShipmentId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConfirmShipmentRequest_H_ */
