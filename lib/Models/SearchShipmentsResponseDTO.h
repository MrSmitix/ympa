
/*
 * SearchShipmentsResponseDTO.h
 *
 * Информация об отгрузках.
 */

#ifndef TINY_CPP_CLIENT_SearchShipmentsResponseDTO_H_
#define TINY_CPP_CLIENT_SearchShipmentsResponseDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ForwardScrollingPagerDTO.h"
#include "ShipmentInfoDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация об отгрузках.
 *
 *  \ingroup Models
 *
 */

class SearchShipmentsResponseDTO{
public:

    /*! \brief Constructor.
	 */
    SearchShipmentsResponseDTO();
    SearchShipmentsResponseDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SearchShipmentsResponseDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<ShipmentInfoDTO> shipments;
    ForwardScrollingPagerDTO paging;
};
}

#endif /* TINY_CPP_CLIENT_SearchShipmentsResponseDTO_H_ */
