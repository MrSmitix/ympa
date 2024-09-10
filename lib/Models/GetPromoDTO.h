
/*
 * GetPromoDTO.h
 *
 * Информация об акции.
 */

#ifndef TINY_CPP_CLIENT_GetPromoDTO_H_
#define TINY_CPP_CLIENT_GetPromoDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChannelType.h"
#include "GetPromoAssortmentInfoDTO.h"
#include "GetPromoBestsellerInfoDTO.h"
#include "GetPromoConstraintsDTO.h"
#include "GetPromoMechanicsInfoDTO.h"
#include "PromoPeriodDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация об акции.
 *
 *  \ingroup Models
 *
 */

class GetPromoDTO{
public:

    /*! \brief Constructor.
	 */
    GetPromoDTO();
    GetPromoDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPromoDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	bool isParticipating();

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
    std::string id{};
    std::string name{};
    PromoPeriodDTO period;
    bool participating{};
    GetPromoAssortmentInfoDTO assortmentInfo;
    GetPromoMechanicsInfoDTO mechanicsInfo;
    GetPromoBestsellerInfoDTO bestsellerInfo;
    std::list<ChannelType> channels;
    GetPromoConstraintsDTO constraints;
};
}

#endif /* TINY_CPP_CLIENT_GetPromoDTO_H_ */
