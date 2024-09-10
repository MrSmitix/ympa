
/*
 * GetOfferCardsContentStatusRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetOfferCardsContentStatusRequest_H_
#define TINY_CPP_CLIENT_GetOfferCardsContentStatusRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferCardStatusType.h"
#include "Set.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetOfferCardsContentStatusRequest{
public:

    /*! \brief Constructor.
	 */
    GetOfferCardsContentStatusRequest();
    GetOfferCardsContentStatusRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetOfferCardsContentStatusRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    Set<std::string> offerIds;
    Set<OfferCardStatusType> cardStatuses;
    Set<int> categoryIds;
};
}

#endif /* TINY_CPP_CLIENT_GetOfferCardsContentStatusRequest_H_ */
