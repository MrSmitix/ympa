
/*
 * OfferCardsContentStatusDTO.h
 *
 * Список товаров с информацией о состоянии карточек.
 */

#ifndef TINY_CPP_CLIENT_OfferCardsContentStatusDTO_H_
#define TINY_CPP_CLIENT_OfferCardsContentStatusDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ForwardScrollingPagerDTO.h"
#include "OfferCardDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список товаров с информацией о состоянии карточек.
 *
 *  \ingroup Models
 *
 */

class OfferCardsContentStatusDTO{
public:

    /*! \brief Constructor.
	 */
    OfferCardsContentStatusDTO();
    OfferCardsContentStatusDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferCardsContentStatusDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Страница списка товаров с информацией о состоянии карточек.
	 */
	std::list<OfferCardDTO> getOfferCards();

	/*! \brief Set Страница списка товаров с информацией о состоянии карточек.
	 */
	void setOfferCards(std::list <OfferCardDTO> offerCards);
	/*! \brief Get 
	 */
	ForwardScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ForwardScrollingPagerDTO  paging);


    private:
    std::list<OfferCardDTO> offerCards;
    ForwardScrollingPagerDTO paging;
};
}

#endif /* TINY_CPP_CLIENT_OfferCardsContentStatusDTO_H_ */
