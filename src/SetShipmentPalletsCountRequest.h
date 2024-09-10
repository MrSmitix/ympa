/*
 * SetShipmentPalletsCountRequest.h
 *
 * Запрос на передачу количества упаковок в отгрузке.
 */

#ifndef _SetShipmentPalletsCountRequest_H_
#define _SetShipmentPalletsCountRequest_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос на передачу количества упаковок в отгрузке.
 *
 *  \ingroup Models
 *
 */

class SetShipmentPalletsCountRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	SetShipmentPalletsCountRequest();
	SetShipmentPalletsCountRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SetShipmentPalletsCountRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Количество упаковок в отгрузке.
	 */
	int getPlacesCount();

	/*! \brief Set Количество упаковок в отгрузке.
	 */
	void setPlacesCount(int  placesCount);

private:
	int placesCount;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SetShipmentPalletsCountRequest_H_ */
