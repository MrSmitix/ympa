
/*
 * SetShipmentPalletsCountRequest.h
 *
 * Запрос на передачу количества упаковок в отгрузке.
 */

#ifndef TINY_CPP_CLIENT_SetShipmentPalletsCountRequest_H_
#define TINY_CPP_CLIENT_SetShipmentPalletsCountRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Запрос на передачу количества упаковок в отгрузке.
 *
 *  \ingroup Models
 *
 */

class SetShipmentPalletsCountRequest{
public:

    /*! \brief Constructor.
	 */
    SetShipmentPalletsCountRequest();
    SetShipmentPalletsCountRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SetShipmentPalletsCountRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Количество упаковок в отгрузке.
	 */
	int getPlacesCount();

	/*! \brief Set Количество упаковок в отгрузке.
	 */
	void setPlacesCount(int  placesCount);


    private:
    int placesCount{};
};
}

#endif /* TINY_CPP_CLIENT_SetShipmentPalletsCountRequest_H_ */
