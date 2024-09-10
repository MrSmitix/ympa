/*
 * GenerateUnitedMarketplaceServicesReportRequest.h
 *
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 */

#ifndef _GenerateUnitedMarketplaceServicesReportRequest_H_
#define _GenerateUnitedMarketplaceServicesReportRequest_H_


#include <string>
#include "Date.h"
#include "PlacementType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 *
 *  \ingroup Models
 *
 */

class GenerateUnitedMarketplaceServicesReportRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GenerateUnitedMarketplaceServicesReportRequest();
	GenerateUnitedMarketplaceServicesReportRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenerateUnitedMarketplaceServicesReportRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор бизнеса.
	 */
	long long getBusinessId();

	/*! \brief Set Идентификатор бизнеса.
	 */
	void setBusinessId(long long  businessId);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
	 */
	std::string getDateTimeFrom();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
	 */
	void setDateTimeFrom(std::string  dateTimeFrom);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
	 */
	std::string getDateTimeTo();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
	 */
	void setDateTimeTo(std::string  dateTimeTo);
	/*! \brief Get Начало периода, включительно.
	 */
	Date getDateFrom();

	/*! \brief Set Начало периода, включительно.
	 */
	void setDateFrom(Date  dateFrom);
	/*! \brief Get Конец периода, включительно. Максимальный период — 1 год.
	 */
	Date getDateTo();

	/*! \brief Set Конец периода, включительно. Максимальный период — 1 год.
	 */
	void setDateTo(Date  dateTo);
	/*! \brief Get Начальный год формирования акта.
	 */
	int getYearFrom();

	/*! \brief Set Начальный год формирования акта.
	 */
	void setYearFrom(int  yearFrom);
	/*! \brief Get Начальный номер месяца формирования акта.
	 */
	int getMonthFrom();

	/*! \brief Set Начальный номер месяца формирования акта.
	 */
	void setMonthFrom(int  monthFrom);
	/*! \brief Get Конечный год формирования акта.
	 */
	int getYearTo();

	/*! \brief Set Конечный год формирования акта.
	 */
	void setYearTo(int  yearTo);
	/*! \brief Get Конечный номер месяца формирования акта.
	 */
	int getMonthTo();

	/*! \brief Set Конечный номер месяца формирования акта.
	 */
	void setMonthTo(int  monthTo);
	/*! \brief Get Список моделей, которые нужны в отчете. 
	 */
	std::list<PlacementType> getPlacementPrograms();

	/*! \brief Set Список моделей, которые нужны в отчете. 
	 */
	void setPlacementPrograms(std::list <PlacementType> placementPrograms);
	/*! \brief Get Список ИНН, которые нужны в отчете.
	 */
	std::list<std::string> getInns();

	/*! \brief Set Список ИНН, которые нужны в отчете.
	 */
	void setInns(std::list <std::string> inns);
	/*! \brief Get Список магазинов, которые нужны в отчете.
	 */
	std::list<long long> getCampaignIds();

	/*! \brief Set Список магазинов, которые нужны в отчете.
	 */
	void setCampaignIds(std::list <long long> campaignIds);

private:
	long long businessId;
	std::string dateTimeFrom;
	std::string dateTimeTo;
	Date dateFrom;
	Date dateTo;
	int yearFrom;
	int monthFrom;
	int yearTo;
	int monthTo;
	std::list <PlacementType>placementPrograms;
	std::list <std::string>inns;
	std::list <long long>campaignIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenerateUnitedMarketplaceServicesReportRequest_H_ */
