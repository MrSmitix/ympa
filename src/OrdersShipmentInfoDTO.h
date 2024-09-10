/*
 * OrdersShipmentInfoDTO.h
 *
 * Годные/негодные ярлыки по заказам в отгрузке.
 */

#ifndef _OrdersShipmentInfoDTO_H_
#define _OrdersShipmentInfoDTO_H_


#include <string>
#include "Set.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Годные/негодные ярлыки по заказам в отгрузке.
 *
 *  \ingroup Models
 *
 */

class OrdersShipmentInfoDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrdersShipmentInfoDTO();
	OrdersShipmentInfoDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrdersShipmentInfoDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
	 */
	Set<long long> getOrderIdsWithLabels();

	/*! \brief Set Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
	 */
	void setOrderIdsWithLabels(Set <long long> orderIdsWithLabels);
	/*! \brief Get Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
	 */
	Set<long long> getOrderIdsWithoutLabels();

	/*! \brief Set Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
	 */
	void setOrderIdsWithoutLabels(Set <long long> orderIdsWithoutLabels);

private:
	Set <long long>orderIdsWithLabels;
	Set <long long>orderIdsWithoutLabels;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrdersShipmentInfoDTO_H_ */
