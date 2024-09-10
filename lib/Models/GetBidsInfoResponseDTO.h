
/*
 * GetBidsInfoResponseDTO.h
 *
 * Список товаров с указанными ставками.
 */

#ifndef TINY_CPP_CLIENT_GetBidsInfoResponseDTO_H_
#define TINY_CPP_CLIENT_GetBidsInfoResponseDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ForwardScrollingPagerDTO.h"
#include "SkuBidItemDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список товаров с указанными ставками.
 *
 *  \ingroup Models
 *
 */

class GetBidsInfoResponseDTO{
public:

    /*! \brief Constructor.
	 */
    GetBidsInfoResponseDTO();
    GetBidsInfoResponseDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetBidsInfoResponseDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Страница списка товаров.
	 */
	std::list<SkuBidItemDTO> getBids();

	/*! \brief Set Страница списка товаров.
	 */
	void setBids(std::list <SkuBidItemDTO> bids);
	/*! \brief Get 
	 */
	ForwardScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ForwardScrollingPagerDTO  paging);


    private:
    std::list<SkuBidItemDTO> bids;
    ForwardScrollingPagerDTO paging;
};
}

#endif /* TINY_CPP_CLIENT_GetBidsInfoResponseDTO_H_ */
