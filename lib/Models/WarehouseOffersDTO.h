
/*
 * WarehouseOffersDTO.h
 *
 * Информация об остатках товаров на складе.
 */

#ifndef TINY_CPP_CLIENT_WarehouseOffersDTO_H_
#define TINY_CPP_CLIENT_WarehouseOffersDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "WarehouseOfferDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация об остатках товаров на складе.
 *
 *  \ingroup Models
 *
 */

class WarehouseOffersDTO{
public:

    /*! \brief Constructor.
	 */
    WarehouseOffersDTO();
    WarehouseOffersDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~WarehouseOffersDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор склада.
	 */
	long getWarehouseId();

	/*! \brief Set Идентификатор склада.
	 */
	void setWarehouseId(long  warehouseId);
	/*! \brief Get Информация об остатках.
	 */
	std::list<WarehouseOfferDTO> getOffers();

	/*! \brief Set Информация об остатках.
	 */
	void setOffers(std::list <WarehouseOfferDTO> offers);


    private:
    long warehouseId{};
    std::list<WarehouseOfferDTO> offers;
};
}

#endif /* TINY_CPP_CLIENT_WarehouseOffersDTO_H_ */
