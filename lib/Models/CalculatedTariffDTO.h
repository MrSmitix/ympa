
/*
 * CalculatedTariffDTO.h
 *
 * Информация об услугах Маркета.
 */

#ifndef TINY_CPP_CLIENT_CalculatedTariffDTO_H_
#define TINY_CPP_CLIENT_CalculatedTariffDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CalculatedTariffType.h"
#include "TariffParameterDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация об услугах Маркета.
 *
 *  \ingroup Models
 *
 */

class CalculatedTariffDTO{
public:

    /*! \brief Constructor.
	 */
    CalculatedTariffDTO();
    CalculatedTariffDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CalculatedTariffDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CalculatedTariffType getType();

	/*! \brief Set 
	 */
	void setType(CalculatedTariffType  type);
	/*! \brief Get Стоимость услуги в рублях.
	 */
	long getAmount();

	/*! \brief Set Стоимость услуги в рублях.
	 */
	void setAmount(long  amount);
	/*! \brief Get Параметры расчета тарифа.
	 */
	std::list<TariffParameterDTO> getParameters();

	/*! \brief Set Параметры расчета тарифа.
	 */
	void setParameters(std::list <TariffParameterDTO> parameters);


    private:
    CalculatedTariffType type;
    long amount{};
    std::list<TariffParameterDTO> parameters;
};
}

#endif /* TINY_CPP_CLIENT_CalculatedTariffDTO_H_ */
