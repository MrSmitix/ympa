/*
 * TariffDTO.h
 *
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 */

#ifndef _TariffDTO_H_
#define _TariffDTO_H_


#include <string>
#include "TariffParameterDTO.h"
#include "TariffType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 *
 *  \ingroup Models
 *
 */

class TariffDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	TariffDTO();
	TariffDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TariffDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	TariffType getType();

	/*! \brief Set 
	 */
	void setType(TariffType  type);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
	 */
	long long getPercent();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
	 */
	void setPercent(long long  percent);
	/*! \brief Get Значение тарифа в рублях.
	 */
	long long getAmount();

	/*! \brief Set Значение тарифа в рублях.
	 */
	void setAmount(long long  amount);
	/*! \brief Get Параметры расчета тарифа.
	 */
	std::list<TariffParameterDTO> getParameters();

	/*! \brief Set Параметры расчета тарифа.
	 */
	void setParameters(std::list <TariffParameterDTO> parameters);

private:
	TariffType type;
	long long percent;
	long long amount;
	std::list <TariffParameterDTO>parameters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TariffDTO_H_ */
