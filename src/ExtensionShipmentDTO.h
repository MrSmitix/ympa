/*
 * ExtensionShipmentDTO.h
 *
 * Информация об отгрузке.
 */

#ifndef _ExtensionShipmentDTO_H_
#define _ExtensionShipmentDTO_H_


#include <string>
#include "Set.h"
#include "ShipmentActionType.h"
#include "ShipmentStatusChangeDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об отгрузке.
 *
 *  \ingroup Models
 *
 */

class ExtensionShipmentDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ExtensionShipmentDTO();
	ExtensionShipmentDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ExtensionShipmentDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ShipmentStatusChangeDTO getCurrentStatus();

	/*! \brief Set 
	 */
	void setCurrentStatus(ShipmentStatusChangeDTO  currentStatus);
	/*! \brief Get Доступные действия над отгрузкой.
	 */
	Set<ShipmentActionType> getAvailableActions();

	/*! \brief Set Доступные действия над отгрузкой.
	 */
	void setAvailableActions(Set <ShipmentActionType> availableActions);

private:
	ShipmentStatusChangeDTO currentStatus;
	Set <ShipmentActionType>availableActions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ExtensionShipmentDTO_H_ */
