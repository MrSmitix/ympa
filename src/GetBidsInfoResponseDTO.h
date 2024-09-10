/*
 * GetBidsInfoResponseDTO.h
 *
 * Список товаров с указанными ставками.
 */

#ifndef _GetBidsInfoResponseDTO_H_
#define _GetBidsInfoResponseDTO_H_


#include <string>
#include "ForwardScrollingPagerDTO.h"
#include "SkuBidItemDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список товаров с указанными ставками.
 *
 *  \ingroup Models
 *
 */

class GetBidsInfoResponseDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetBidsInfoResponseDTO();
	GetBidsInfoResponseDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetBidsInfoResponseDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::list <SkuBidItemDTO>bids;
	ForwardScrollingPagerDTO paging;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetBidsInfoResponseDTO_H_ */
