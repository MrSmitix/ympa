/*
 * CalculatedTariffDTO.h
 *
 * Информация об услугах Маркета.
 */

#ifndef _CalculatedTariffDTO_H_
#define _CalculatedTariffDTO_H_


#include <string>
#include "CalculatedTariffType.h"
#include "TariffParameterDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об услугах Маркета.
 *
 *  \ingroup Models
 *
 */

class CalculatedTariffDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	CalculatedTariffDTO();
	CalculatedTariffDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CalculatedTariffDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CalculatedTariffType getType();

	/*! \brief Set 
	 */
	void setType(CalculatedTariffType  type);
	/*! \brief Get Стоимость услуги в рублях.
	 */
	long long getAmount();

	/*! \brief Set Стоимость услуги в рублях.
	 */
	void setAmount(long long  amount);
	/*! \brief Get Параметры расчета тарифа.
	 */
	std::list<TariffParameterDTO> getParameters();

	/*! \brief Set Параметры расчета тарифа.
	 */
	void setParameters(std::list <TariffParameterDTO> parameters);

private:
	CalculatedTariffType type;
	long long amount;
	std::list <TariffParameterDTO>parameters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CalculatedTariffDTO_H_ */
