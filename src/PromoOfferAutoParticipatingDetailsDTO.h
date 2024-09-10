/*
 * PromoOfferAutoParticipatingDetailsDTO.h
 *
 * Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 */

#ifndef _PromoOfferAutoParticipatingDetailsDTO_H_
#define _PromoOfferAutoParticipatingDetailsDTO_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 *
 *  \ingroup Models
 *
 */

class PromoOfferAutoParticipatingDetailsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	PromoOfferAutoParticipatingDetailsDTO();
	PromoOfferAutoParticipatingDetailsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PromoOfferAutoParticipatingDetailsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — `PARTIALLY_AUTO`. 
	 */
	std::list<long long> getCampaignIds();

	/*! \brief Set Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — `PARTIALLY_AUTO`. 
	 */
	void setCampaignIds(std::list <long long> campaignIds);

private:
	std::list <long long>campaignIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PromoOfferAutoParticipatingDetailsDTO_H_ */
