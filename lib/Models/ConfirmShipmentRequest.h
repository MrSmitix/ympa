
/*
 * ConfirmShipmentRequest.h
 *
 * Запрос для подтверждения отгрузки.
 */

#ifndef TINY_CPP_CLIENT_ConfirmShipmentRequest_H_
#define TINY_CPP_CLIENT_ConfirmShipmentRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Запрос для подтверждения отгрузки.
 *
 *  \ingroup Models
 *
 */

class ConfirmShipmentRequest{
public:

    /*! \brief Constructor.
	 */
    ConfirmShipmentRequest();
    ConfirmShipmentRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConfirmShipmentRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор отгрузки в системе поставщика.
	 */
	std::string getExternalShipmentId();

	/*! \brief Set Идентификатор отгрузки в системе поставщика.
	 */
	void setExternalShipmentId(std::string  externalShipmentId);


    private:
    std::string externalShipmentId{};
};
}

#endif /* TINY_CPP_CLIENT_ConfirmShipmentRequest_H_ */
