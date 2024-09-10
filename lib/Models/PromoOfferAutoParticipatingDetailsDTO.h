
/*
 * PromoOfferAutoParticipatingDetailsDTO.h
 *
 * Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 */

#ifndef TINY_CPP_CLIENT_PromoOfferAutoParticipatingDetailsDTO_H_
#define TINY_CPP_CLIENT_PromoOfferAutoParticipatingDetailsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 *
 *  \ingroup Models
 *
 */

class PromoOfferAutoParticipatingDetailsDTO{
public:

    /*! \brief Constructor.
	 */
    PromoOfferAutoParticipatingDetailsDTO();
    PromoOfferAutoParticipatingDetailsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PromoOfferAutoParticipatingDetailsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — `PARTIALLY_AUTO`. 
	 */
	std::list<long> getCampaignIds();

	/*! \brief Set Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — `PARTIALLY_AUTO`. 
	 */
	void setCampaignIds(std::list <long> campaignIds);


    private:
    std::list<long> campaignIds;
};
}

#endif /* TINY_CPP_CLIENT_PromoOfferAutoParticipatingDetailsDTO_H_ */
