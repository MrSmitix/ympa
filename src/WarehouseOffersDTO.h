/*
 * WarehouseOffersDTO.h
 *
 * Информация об остатках товаров на складе.
 */

#ifndef _WarehouseOffersDTO_H_
#define _WarehouseOffersDTO_H_


#include <string>
#include "WarehouseOfferDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об остатках товаров на складе.
 *
 *  \ingroup Models
 *
 */

class WarehouseOffersDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	WarehouseOffersDTO();
	WarehouseOffersDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~WarehouseOffersDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор склада.
	 */
	long long getWarehouseId();

	/*! \brief Set Идентификатор склада.
	 */
	void setWarehouseId(long long  warehouseId);
	/*! \brief Get Информация об остатках.
	 */
	std::list<WarehouseOfferDTO> getOffers();

	/*! \brief Set Информация об остатках.
	 */
	void setOffers(std::list <WarehouseOfferDTO> offers);

private:
	long long warehouseId;
	std::list <WarehouseOfferDTO>offers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _WarehouseOffersDTO_H_ */
