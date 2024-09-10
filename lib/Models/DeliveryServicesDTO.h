
/*
 * DeliveryServicesDTO.h
 *
 * Информация о службах доставки.
 */

#ifndef TINY_CPP_CLIENT_DeliveryServicesDTO_H_
#define TINY_CPP_CLIENT_DeliveryServicesDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DeliveryServiceInfoDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация о службах доставки.
 *
 *  \ingroup Models
 *
 */

class DeliveryServicesDTO{
public:

    /*! \brief Constructor.
	 */
    DeliveryServicesDTO();
    DeliveryServicesDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeliveryServicesDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Информация о службе доставки.
	 */
	std::list<DeliveryServiceInfoDTO> getDeliveryService();

	/*! \brief Set Информация о службе доставки.
	 */
	void setDeliveryService(std::list <DeliveryServiceInfoDTO> deliveryService);


    private:
    std::list<DeliveryServiceInfoDTO> deliveryService;
};
}

#endif /* TINY_CPP_CLIENT_DeliveryServicesDTO_H_ */
