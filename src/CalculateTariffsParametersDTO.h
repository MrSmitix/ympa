/*
 * CalculateTariffsParametersDTO.h
 *
 * Параметры для расчета стоимости услуг.
 */

#ifndef _CalculateTariffsParametersDTO_H_
#define _CalculateTariffsParametersDTO_H_


#include <string>
#include "PaymentFrequencyType.h"
#include "SellingProgramType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Параметры для расчета стоимости услуг.
 *
 *  \ingroup Models
 *
 */

class CalculateTariffsParametersDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	CalculateTariffsParametersDTO();
	CalculateTariffsParametersDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CalculateTariffsParametersDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке. 
	 */
	long long getCampaignId();

	/*! \brief Set Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке. 
	 */
	void setCampaignId(long long  campaignId);
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
	long long campaignId;
	SellingProgramType sellingProgram;
	PaymentFrequencyType frequency;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CalculateTariffsParametersDTO_H_ */
