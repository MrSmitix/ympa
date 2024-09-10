
/*
 * ExtensionShipmentDTO.h
 *
 * Информация об отгрузке.
 */

#ifndef TINY_CPP_CLIENT_ExtensionShipmentDTO_H_
#define TINY_CPP_CLIENT_ExtensionShipmentDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Set.h"
#include "ShipmentActionType.h"
#include "ShipmentStatusChangeDTO.h"

namespace Tiny {


/*! \brief Информация об отгрузке.
 *
 *  \ingroup Models
 *
 */

class ExtensionShipmentDTO{
public:

    /*! \brief Constructor.
	 */
    ExtensionShipmentDTO();
    ExtensionShipmentDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ExtensionShipmentDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    Set<ShipmentActionType> availableActions;
};
}

#endif /* TINY_CPP_CLIENT_ExtensionShipmentDTO_H_ */
