
/*
 * GeneratePricesReportRequest.h
 *
 * Данные, необходимые для генерации отчета.
 */

#ifndef TINY_CPP_CLIENT_GeneratePricesReportRequest_H_
#define TINY_CPP_CLIENT_GeneratePricesReportRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"
#include <list>

namespace Tiny {


/*! \brief Данные, необходимые для генерации отчета.
 *
 *  \ingroup Models
 *
 */

class GeneratePricesReportRequest{
public:

    /*! \brief Constructor.
	 */
    GeneratePricesReportRequest();
    GeneratePricesReportRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GeneratePricesReportRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 
	 */
	long getBusinessId();

	/*! \brief Set Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 
	 */
	void setBusinessId(long  businessId);
	/*! \brief Get Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. 
	 */
	long getCampaignId();

	/*! \brief Set Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. 
	 */
	void setCampaignId(long  campaignId);
	/*! \brief Get Фильтр по категориям на Маркете.
	 */
	std::list<long> getCategoryIds();

	/*! \brief Set Фильтр по категориям на Маркете.
	 */
	void setCategoryIds(std::list <long> categoryIds);
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
    long businessId{};
    long campaignId{};
    std::list<long> categoryIds;
    Date creationDateFrom;
    Date creationDateTo;
};
}

#endif /* TINY_CPP_CLIENT_GeneratePricesReportRequest_H_ */
