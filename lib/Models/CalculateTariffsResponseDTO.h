
/*
 * CalculateTariffsResponseDTO.h
 *
 * Расчет стоимости услуг.
 */

#ifndef TINY_CPP_CLIENT_CalculateTariffsResponseDTO_H_
#define TINY_CPP_CLIENT_CalculateTariffsResponseDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CalculateTariffsOfferInfoDTO.h"
#include <list>

namespace Tiny {


/*! \brief Расчет стоимости услуг.
 *
 *  \ingroup Models
 *
 */

class CalculateTariffsResponseDTO{
public:

    /*! \brief Constructor.
	 */
    CalculateTariffsResponseDTO();
    CalculateTariffsResponseDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CalculateTariffsResponseDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Стоимость услуг.
	 */
	std::list<CalculateTariffsOfferInfoDTO> getOffers();

	/*! \brief Set Стоимость услуг.
	 */
	void setOffers(std::list <CalculateTariffsOfferInfoDTO> offers);


    private:
    std::list<CalculateTariffsOfferInfoDTO> offers;
};
}

#endif /* TINY_CPP_CLIENT_CalculateTariffsResponseDTO_H_ */
