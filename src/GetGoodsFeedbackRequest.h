/*
 * GetGoodsFeedbackRequest.h
 *
 * Фильтр запроса отзывов в кабинете. 
 */

#ifndef _GetGoodsFeedbackRequest_H_
#define _GetGoodsFeedbackRequest_H_


#include <string>
#include "FeedbackReactionStatusType.h"
#include "Set.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Фильтр запроса отзывов в кабинете. 
 *
 *  \ingroup Models
 *
 */

class GetGoodsFeedbackRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetGoodsFeedbackRequest();
	GetGoodsFeedbackRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetGoodsFeedbackRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	Set<long long> getModelIds();

	/*! \brief Set Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
	 */
	void setModelIds(Set <long long> modelIds);
	/*! \brief Get Фильтр отзывов за баллы Плюса.
	 */
	bool getPaid();

	/*! \brief Set Фильтр отзывов за баллы Плюса.
	 */
	void setPaid(bool  paid);

private:
	std::string dateTimeFrom;
	std::string dateTimeTo;
	FeedbackReactionStatusType reactionStatus;
	Set <int>ratingValues;
	Set <long long>modelIds;
	bool paid;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetGoodsFeedbackRequest_H_ */
