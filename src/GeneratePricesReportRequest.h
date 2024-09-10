/*
 * GeneratePricesReportRequest.h
 *
 * Данные, необходимые для генерации отчета.
 */

#ifndef _GeneratePricesReportRequest_H_
#define _GeneratePricesReportRequest_H_


#include <string>
#include "Date.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Данные, необходимые для генерации отчета.
 *
 *  \ingroup Models
 *
 */

class GeneratePricesReportRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GeneratePricesReportRequest();
	GeneratePricesReportRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GeneratePricesReportRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 
	 */
	long long getBusinessId();

	/*! \brief Set Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 
	 */
	void setBusinessId(long long  businessId);
	/*! \brief Get Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. 
	 */
	long long getCampaignId();

	/*! \brief Set Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. 
	 */
	void setCampaignId(long long  campaignId);
	/*! \brief Get Фильтр по категориям на Маркете.
	 */
	std::list<long long> getCategoryIds();

	/*! \brief Set Фильтр по категориям на Маркете.
	 */
	void setCategoryIds(std::list <long long> categoryIds);
	/*! \brief Get Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	Date getCreationDateFrom();

	/*! \brief Set Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	void setCreationDateFrom(Date  creationDateFrom);
	/*! \brief Get Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	Date getCreationDateTo();

	/*! \brief Set Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	void setCreationDateTo(Date  creationDateTo);

private:
	long long businessId;
	long long campaignId;
	std::list <long long>categoryIds;
	Date creationDateFrom;
	Date creationDateTo;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GeneratePricesReportRequest_H_ */
