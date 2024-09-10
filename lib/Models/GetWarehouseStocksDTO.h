
/*
 * GetWarehouseStocksDTO.h
 *
 * Список складов с информацией об остатках на каждом из них.
 */

#ifndef TINY_CPP_CLIENT_GetWarehouseStocksDTO_H_
#define TINY_CPP_CLIENT_GetWarehouseStocksDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ScrollingPagerDTO.h"
#include "WarehouseOffersDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список складов с информацией об остатках на каждом из них.
 *
 *  \ingroup Models
 *
 */

class GetWarehouseStocksDTO{
public:

    /*! \brief Constructor.
	 */
    GetWarehouseStocksDTO();
    GetWarehouseStocksDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetWarehouseStocksDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ScrollingPagerDTO  paging);
	/*! \brief Get Страница списка складов.
	 */
	std::list<WarehouseOffersDTO> getWarehouses();

	/*! \brief Set Страница списка складов.
	 */
	void setWarehouses(std::list <WarehouseOffersDTO> warehouses);


    private:
    ScrollingPagerDTO paging;
    std::list<WarehouseOffersDTO> warehouses;
};
}

#endif /* TINY_CPP_CLIENT_GetWarehouseStocksDTO_H_ */
