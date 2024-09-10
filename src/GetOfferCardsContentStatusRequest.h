/*
 * GetOfferCardsContentStatusRequest.h
 *
 * 
 */

#ifndef _GetOfferCardsContentStatusRequest_H_
#define _GetOfferCardsContentStatusRequest_H_


#include <string>
#include "OfferCardStatusType.h"
#include "Set.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetOfferCardsContentStatusRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetOfferCardsContentStatusRequest();
	GetOfferCardsContentStatusRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetOfferCardsContentStatusRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
	 */
	Set<std::string> getOfferIds();

	/*! \brief Set Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
	 */
	void setOfferIds(Set <std::string> offerIds);
	/*! \brief Get Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
	 */
	Set<OfferCardStatusType> getCardStatuses();

	/*! \brief Set Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
	 */
	void setCardStatuses(Set <OfferCardStatusType> cardStatuses);
	/*! \brief Get Фильтр по категориям на Маркете.
	 */
	Set<int> getCategoryIds();

	/*! \brief Set Фильтр по категориям на Маркете.
	 */
	void setCategoryIds(Set <int> categoryIds);

private:
	Set <std::string>offerIds;
	Set <OfferCardStatusType>cardStatuses;
	Set <int>categoryIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetOfferCardsContentStatusRequest_H_ */
