
/*
 * GetGoodsFeedbackRequest.h
 *
 * Фильтр запроса отзывов в кабинете. 
 */

#ifndef TINY_CPP_CLIENT_GetGoodsFeedbackRequest_H_
#define TINY_CPP_CLIENT_GetGoodsFeedbackRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedbackReactionStatusType.h"
#include "Set.h"

namespace Tiny {


/*! \brief Фильтр запроса отзывов в кабинете. 
 *
 *  \ingroup Models
 *
 */

class GetGoodsFeedbackRequest{
public:

    /*! \brief Constructor.
	 */
    GetGoodsFeedbackRequest();
    GetGoodsFeedbackRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetGoodsFeedbackRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
	 */
	std::string getDateTimeFrom();

	/*! \brief Set Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
	 */
	void setDateTimeFrom(std::string  dateTimeFrom);
	/*! \brief Get Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
	 */
	std::string getDateTimeTo();

	/*! \brief Set Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
	 */
	void setDateTimeTo(std::string  dateTimeTo);
	/*! \brief Get 
	 */
	FeedbackReactionStatusType getReactionStatus();

	/*! \brief Set 
	 */
	void setReactionStatus(FeedbackReactionStatusType  reactionStatus);
	/*! \brief Get Оценка товара.
	 */
	Set<int> getRatingValues();

	/*! \brief Set Оценка товара.
	 */
	void setRatingValues(Set <int> ratingValues);
	/*! \brief Get Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
	 */
	Set<long> getModelIds();

	/*! \brief Set Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
	 */
	void setModelIds(Set <long> modelIds);
	/*! \brief Get Фильтр отзывов за баллы Плюса.
	 */
	bool isPaid();

	/*! \brief Set Фильтр отзывов за баллы Плюса.
	 */
	void setPaid(bool  paid);


    private:
    std::string dateTimeFrom{};
    std::string dateTimeTo{};
    FeedbackReactionStatusType reactionStatus;
    Set<int> ratingValues;
    Set<long> modelIds;
    bool paid{};
};
}

#endif /* TINY_CPP_CLIENT_GetGoodsFeedbackRequest_H_ */
