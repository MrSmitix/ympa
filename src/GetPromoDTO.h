/*
 * GetPromoDTO.h
 *
 * Информация об акции.
 */

#ifndef _GetPromoDTO_H_
#define _GetPromoDTO_H_


#include <string>
#include "ChannelType.h"
#include "GetPromoAssortmentInfoDTO.h"
#include "GetPromoBestsellerInfoDTO.h"
#include "GetPromoConstraintsDTO.h"
#include "GetPromoMechanicsInfoDTO.h"
#include "PromoPeriodDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об акции.
 *
 *  \ingroup Models
 *
 */

class GetPromoDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPromoDTO();
	GetPromoDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPromoDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор акции.
	 */
	std::string getId();

	/*! \brief Set Идентификатор акции.
	 */
	void setId(std::string  id);
	/*! \brief Get Название акции.
	 */
	std::string getName();

	/*! \brief Set Название акции.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	PromoPeriodDTO getPeriod();

	/*! \brief Set 
	 */
	void setPeriod(PromoPeriodDTO  period);
	/*! \brief Get Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
	 */
	bool getParticipating();

	/*! \brief Set Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
	 */
	void setParticipating(bool  participating);
	/*! \brief Get 
	 */
	GetPromoAssortmentInfoDTO getAssortmentInfo();

	/*! \brief Set 
	 */
	void setAssortmentInfo(GetPromoAssortmentInfoDTO  assortmentInfo);
	/*! \brief Get 
	 */
	GetPromoMechanicsInfoDTO getMechanicsInfo();

	/*! \brief Set 
	 */
	void setMechanicsInfo(GetPromoMechanicsInfoDTO  mechanicsInfo);
	/*! \brief Get 
	 */
	GetPromoBestsellerInfoDTO getBestsellerInfo();

	/*! \brief Set 
	 */
	void setBestsellerInfo(GetPromoBestsellerInfoDTO  bestsellerInfo);
	/*! \brief Get Список каналов продвижения товаров.
	 */
	std::list<ChannelType> getChannels();

	/*! \brief Set Список каналов продвижения товаров.
	 */
	void setChannels(std::list <ChannelType> channels);
	/*! \brief Get 
	 */
	GetPromoConstraintsDTO getConstraints();

	/*! \brief Set 
	 */
	void setConstraints(GetPromoConstraintsDTO  constraints);

private:
	std::string id;
	std::string name;
	PromoPeriodDTO period;
	bool participating;
	GetPromoAssortmentInfoDTO assortmentInfo;
	GetPromoMechanicsInfoDTO mechanicsInfo;
	GetPromoBestsellerInfoDTO bestsellerInfo;
	std::list <ChannelType>channels;
	GetPromoConstraintsDTO constraints;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPromoDTO_H_ */
