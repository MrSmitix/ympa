/*
 * GetPromoAssortmentInfoDTO.h
 *
 * Информация о товарах в акции.
 */

#ifndef _GetPromoAssortmentInfoDTO_H_
#define _GetPromoAssortmentInfoDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о товарах в акции.
 *
 *  \ingroup Models
 *
 */

class GetPromoAssortmentInfoDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPromoAssortmentInfoDTO();
	GetPromoAssortmentInfoDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPromoAssortmentInfoDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	bool getProcessing();

	/*! \brief Set Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. 
	 */
	void setProcessing(bool  processing);

private:
	int activeOffers;
	int potentialOffers;
	bool processing;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPromoAssortmentInfoDTO_H_ */
