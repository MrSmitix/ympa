/*
 * DeliveryServicesDTO.h
 *
 * Информация о службах доставки.
 */

#ifndef _DeliveryServicesDTO_H_
#define _DeliveryServicesDTO_H_


#include <string>
#include "DeliveryServiceInfoDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о службах доставки.
 *
 *  \ingroup Models
 *
 */

class DeliveryServicesDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	DeliveryServicesDTO();
	DeliveryServicesDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeliveryServicesDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Информация о службе доставки.
	 */
	std::list<DeliveryServiceInfoDTO> getDeliveryService();

	/*! \brief Set Информация о службе доставки.
	 */
	void setDeliveryService(std::list <DeliveryServiceInfoDTO> deliveryService);

private:
	std::list <DeliveryServiceInfoDTO>deliveryService;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeliveryServicesDTO_H_ */
