/*
 * SearchShipmentsResponseDTO.h
 *
 * Информация об отгрузках.
 */

#ifndef _SearchShipmentsResponseDTO_H_
#define _SearchShipmentsResponseDTO_H_


#include <string>
#include "ForwardScrollingPagerDTO.h"
#include "ShipmentInfoDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об отгрузках.
 *
 *  \ingroup Models
 *
 */

class SearchShipmentsResponseDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	SearchShipmentsResponseDTO();
	SearchShipmentsResponseDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SearchShipmentsResponseDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список с информацией об отгрузках.
	 */
	std::list<ShipmentInfoDTO> getShipments();

	/*! \brief Set Список с информацией об отгрузках.
	 */
	void setShipments(std::list <ShipmentInfoDTO> shipments);
	/*! \brief Get 
	 */
	ForwardScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ForwardScrollingPagerDTO  paging);

private:
	std::list <ShipmentInfoDTO>shipments;
	ForwardScrollingPagerDTO paging;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SearchShipmentsResponseDTO_H_ */
