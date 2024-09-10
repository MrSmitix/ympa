/*
 * OrdersStatsDeliveryRegionDTO.h
 *
 * Информация о регионе доставки.
 */

#ifndef _OrdersStatsDeliveryRegionDTO_H_
#define _OrdersStatsDeliveryRegionDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о регионе доставки.
 *
 *  \ingroup Models
 *
 */

class OrdersStatsDeliveryRegionDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrdersStatsDeliveryRegionDTO();
	OrdersStatsDeliveryRegionDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrdersStatsDeliveryRegionDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор региона доставки.
	 */
	long long getId();

	/*! \brief Set Идентификатор региона доставки.
	 */
	void setId(long long  id);
	/*! \brief Get Название региона доставки.
	 */
	std::string getName();

	/*! \brief Set Название региона доставки.
	 */
	void setName(std::string  name);

private:
	long long id;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrdersStatsDeliveryRegionDTO_H_ */
