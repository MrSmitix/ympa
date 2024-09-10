
/*
 * CampaignSettingsTimePeriodDTO.h
 *
 * Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
 */

#ifndef TINY_CPP_CLIENT_CampaignSettingsTimePeriodDTO_H_
#define TINY_CPP_CLIENT_CampaignSettingsTimePeriodDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
 *
 *  \ingroup Models
 *
 */

class CampaignSettingsTimePeriodDTO{
public:

    /*! \brief Constructor.
	 */
    CampaignSettingsTimePeriodDTO();
    CampaignSettingsTimePeriodDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignSettingsTimePeriodDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	std::string getFromDate();

	/*! \brief Set Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	void setFromDate(std::string  fromDate);
	/*! \brief Get Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	std::string getToDate();

	/*! \brief Set Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	void setToDate(std::string  toDate);


    private:
    std::string fromDate{};
    std::string toDate{};
};
}

#endif /* TINY_CPP_CLIENT_CampaignSettingsTimePeriodDTO_H_ */
