
/*
 * OrdersShipmentInfoDTO.h
 *
 * Годные/негодные ярлыки по заказам в отгрузке.
 */

#ifndef TINY_CPP_CLIENT_OrdersShipmentInfoDTO_H_
#define TINY_CPP_CLIENT_OrdersShipmentInfoDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Set.h"

namespace Tiny {


/*! \brief Годные/негодные ярлыки по заказам в отгрузке.
 *
 *  \ingroup Models
 *
 */

class OrdersShipmentInfoDTO{
public:

    /*! \brief Constructor.
	 */
    OrdersShipmentInfoDTO();
    OrdersShipmentInfoDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrdersShipmentInfoDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
	 */
	Set<long> getOrderIdsWithLabels();

	/*! \brief Set Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
	 */
	void setOrderIdsWithLabels(Set <long> orderIdsWithLabels);
	/*! \brief Get Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
	 */
	Set<long> getOrderIdsWithoutLabels();

	/*! \brief Set Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
	 */
	void setOrderIdsWithoutLabels(Set <long> orderIdsWithoutLabels);


    private:
    Set<long> orderIdsWithLabels;
    Set<long> orderIdsWithoutLabels;
};
}

#endif /* TINY_CPP_CLIENT_OrdersShipmentInfoDTO_H_ */
