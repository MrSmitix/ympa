
/*
 * GenerateGoodsRealizationReportRequest.h
 *
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 */

#ifndef TINY_CPP_CLIENT_GenerateGoodsRealizationReportRequest_H_
#define TINY_CPP_CLIENT_GenerateGoodsRealizationReportRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 *
 *  \ingroup Models
 *
 */

class GenerateGoodsRealizationReportRequest{
public:

    /*! \brief Constructor.
	 */
    GenerateGoodsRealizationReportRequest();
    GenerateGoodsRealizationReportRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenerateGoodsRealizationReportRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор кампании.
	 */
	long getCampaignId();

	/*! \brief Set Идентификатор кампании.
	 */
	void setCampaignId(long  campaignId);
	/*! \brief Get Год.
	 */
	int getYear();

	/*! \brief Set Год.
	 */
	void setYear(int  year);
	/*! \brief Get Номер месяца.
	 */
	int getMonth();

	/*! \brief Set Номер месяца.
	 */
	void setMonth(int  month);


    private:
    long campaignId{};
    int year{};
    int month{};
};
}

#endif /* TINY_CPP_CLIENT_GenerateGoodsRealizationReportRequest_H_ */
