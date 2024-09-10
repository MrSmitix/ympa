
/*
 * CalculateTariffsParametersDTO.h
 *
 * Параметры для расчета стоимости услуг.
 */

#ifndef TINY_CPP_CLIENT_CalculateTariffsParametersDTO_H_
#define TINY_CPP_CLIENT_CalculateTariffsParametersDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PaymentFrequencyType.h"
#include "SellingProgramType.h"

namespace Tiny {


/*! \brief Параметры для расчета стоимости услуг.
 *
 *  \ingroup Models
 *
 */

class CalculateTariffsParametersDTO{
public:

    /*! \brief Constructor.
	 */
    CalculateTariffsParametersDTO();
    CalculateTariffsParametersDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CalculateTariffsParametersDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке. 
	 */
	long getCampaignId();

	/*! \brief Set Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке. 
	 */
	void setCampaignId(long  campaignId);
	/*! \brief Get 
	 */
	SellingProgramType getSellingProgram();

	/*! \brief Set 
	 */
	void setSellingProgram(SellingProgramType  sellingProgram);
	/*! \brief Get 
	 */
	PaymentFrequencyType getFrequency();

	/*! \brief Set 
	 */
	void setFrequency(PaymentFrequencyType  frequency);


    private:
    long campaignId{};
    SellingProgramType sellingProgram;
    PaymentFrequencyType frequency;
};
}

#endif /* TINY_CPP_CLIENT_CalculateTariffsParametersDTO_H_ */
