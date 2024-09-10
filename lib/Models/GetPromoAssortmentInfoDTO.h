
/*
 * GetPromoAssortmentInfoDTO.h
 *
 * Информация о товарах в акции.
 */

#ifndef TINY_CPP_CLIENT_GetPromoAssortmentInfoDTO_H_
#define TINY_CPP_CLIENT_GetPromoAssortmentInfoDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о товарах в акции.
 *
 *  \ingroup Models
 *
 */

class GetPromoAssortmentInfoDTO{
public:

    /*! \brief Constructor.
	 */
    GetPromoAssortmentInfoDTO();
    GetPromoAssortmentInfoDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPromoAssortmentInfoDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
	 */
	int getActiveOffers();

	/*! \brief Set Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
	 */
	void setActiveOffers(int  activeOffers);
	/*! \brief Get Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. 
	 */
	int getPotentialOffers();

	/*! \brief Set Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. 
	 */
	void setPotentialOffers(int  potentialOffers);
	/*! \brief Get Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. 
	 */
	bool isProcessing();

	/*! \brief Set Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. 
	 */
	void setProcessing(bool  processing);


    private:
    int activeOffers{};
    int potentialOffers{};
    bool processing{};
};
}

#endif /* TINY_CPP_CLIENT_GetPromoAssortmentInfoDTO_H_ */
