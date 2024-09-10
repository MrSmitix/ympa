
/*
 * GetDeliveryServicesResponse.h
 *
 * Ответ на запрос списка служб доставки.
 */

#ifndef TINY_CPP_CLIENT_GetDeliveryServicesResponse_H_
#define TINY_CPP_CLIENT_GetDeliveryServicesResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DeliveryServicesDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос списка служб доставки.
 *
 *  \ingroup Models
 *
 */

class GetDeliveryServicesResponse{
public:

    /*! \brief Constructor.
	 */
    GetDeliveryServicesResponse();
    GetDeliveryServicesResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetDeliveryServicesResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	DeliveryServicesDTO getResult();

	/*! \brief Set 
	 */
	void setResult(DeliveryServicesDTO  result);


    private:
    DeliveryServicesDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetDeliveryServicesResponse_H_ */
