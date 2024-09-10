
/*
 * ShipmentActionType.h
 *
 * Действия с отгрузкой:  * &#x60;CONFIRM&#x60; — подтвердить отгрузку. * &#x60;DOWNLOAD_ACT&#x60; — скачать акт приема-передачи отгрузки. * &#x60;DOWNLOAD_INBOUND_ACT&#x60; — скачать список принятых заказов. * &#x60;DOWNLOAD_DISCREPANCY_ACT&#x60; — скачать акт расхождений. * &#x60;CHANGE_PALLETS_COUNT&#x60; — указать количество палет. 
 */

#ifndef TINY_CPP_CLIENT_ShipmentActionType_H_
#define TINY_CPP_CLIENT_ShipmentActionType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Действия с отгрузкой:  * `CONFIRM` — подтвердить отгрузку. * `DOWNLOAD_ACT` — скачать акт приема-передачи отгрузки. * `DOWNLOAD_INBOUND_ACT` — скачать список принятых заказов. * `DOWNLOAD_DISCREPANCY_ACT` — скачать акт расхождений. * `CHANGE_PALLETS_COUNT` — указать количество палет. 
 *
 *  \ingroup Models
 *
 */

class ShipmentActionType{
public:

    /*! \brief Constructor.
	 */
    ShipmentActionType();
    ShipmentActionType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ShipmentActionType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ShipmentActionType_H_ */
