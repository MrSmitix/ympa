/*
 * GetQuarantineOffersRequest.h
 *
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 */

#ifndef _GetQuarantineOffersRequest_H_
#define _GetQuarantineOffersRequest_H_


#include <string>
#include "OfferCardStatusType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 *
 *  \ingroup Models
 *
 */

class GetQuarantineOffersRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetQuarantineOffersRequest();
	GetQuarantineOffersRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetQuarantineOffersRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
	 */
	std::list<std::string> getOfferIds();

	/*! \brief Set Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
	 */
	void setOfferIds(std::list <std::string> offerIds);
	/*! \brief Get Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
	 */
	std::list<OfferCardStatusType> getCardStatuses();

	/*! \brief Set Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
	 */
	void setCardStatuses(std::list <OfferCardStatusType> cardStatuses);
	/*! \brief Get Фильтр по категориям на Маркете.
	 */
	std::list<int> getCategoryIds();

	/*! \brief Set Фильтр по категориям на Маркете.
	 */
	void setCategoryIds(std::list <int> categoryIds);
	/*! \brief Get Фильтр по брендам.
	 */
	std::list<std::string> getVendorNames();

	/*! \brief Set Фильтр по брендам.
	 */
	void setVendorNames(std::list <std::string> vendorNames);
	/*! \brief Get Фильтр по тегам.
	 */
	std::list<std::string> getTags();

	/*! \brief Set Фильтр по тегам.
	 */
	void setTags(std::list <std::string> tags);

private:
	std::list <std::string>offerIds;
	std::list <OfferCardStatusType>cardStatuses;
	std::list <int>categoryIds;
	std::list <std::string>vendorNames;
	std::list <std::string>tags;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetQuarantineOffersRequest_H_ */
