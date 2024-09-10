
/*
 * CalculateTariffsRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CalculateTariffsRequest_H_
#define TINY_CPP_CLIENT_CalculateTariffsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CalculateTariffsOfferDTO.h"
#include "CalculateTariffsParametersDTO.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CalculateTariffsRequest{
public:

    /*! \brief Constructor.
	 */
    CalculateTariffsRequest();
    CalculateTariffsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CalculateTariffsRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CalculateTariffsParametersDTO getParameters();

	/*! \brief Set 
	 */
	void setParameters(CalculateTariffsParametersDTO  parameters);
	/*! \brief Get Товары, для которых нужно рассчитать стоимость услуг.
	 */
	std::list<CalculateTariffsOfferDTO> getOffers();

	/*! \brief Set Товары, для которых нужно рассчитать стоимость услуг.
	 */
	void setOffers(std::list <CalculateTariffsOfferDTO> offers);


    private:
    CalculateTariffsParametersDTO parameters;
    std::list<CalculateTariffsOfferDTO> offers;
};
}

#endif /* TINY_CPP_CLIENT_CalculateTariffsRequest_H_ */
