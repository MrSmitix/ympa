
/*
 * TariffDTO.h
 *
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 */

#ifndef TINY_CPP_CLIENT_TariffDTO_H_
#define TINY_CPP_CLIENT_TariffDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TariffParameterDTO.h"
#include "TariffType.h"
#include <list>

namespace Tiny {


/*! \brief Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 *
 *  \ingroup Models
 *
 */

class TariffDTO{
public:

    /*! \brief Constructor.
	 */
    TariffDTO();
    TariffDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TariffDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	TariffType getType();

	/*! \brief Set 
	 */
	void setType(TariffType  type);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
	 */
	long getPercent();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
	 */
	void setPercent(long  percent);
	/*! \brief Get Значение тарифа в рублях.
	 */
	long getAmount();

	/*! \brief Set Значение тарифа в рублях.
	 */
	void setAmount(long  amount);
	/*! \brief Get Параметры расчета тарифа.
	 */
	std::list<TariffParameterDTO> getParameters();

	/*! \brief Set Параметры расчета тарифа.
	 */
	void setParameters(std::list <TariffParameterDTO> parameters);


    private:
    TariffType type;
    long percent{};
    long amount{};
    std::list<TariffParameterDTO> parameters;
};
}

#endif /* TINY_CPP_CLIENT_TariffDTO_H_ */
