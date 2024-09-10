
/*
 * PriceCompetitivenessThresholdsDTO.h
 *
 * Максимальные значения цены, при которых она является привлекательной или умеренной.
 */

#ifndef TINY_CPP_CLIENT_PriceCompetitivenessThresholdsDTO_H_
#define TINY_CPP_CLIENT_PriceCompetitivenessThresholdsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BasePriceDTO.h"

namespace Tiny {


/*! \brief Максимальные значения цены, при которых она является привлекательной или умеренной.
 *
 *  \ingroup Models
 *
 */

class PriceCompetitivenessThresholdsDTO{
public:

    /*! \brief Constructor.
	 */
    PriceCompetitivenessThresholdsDTO();
    PriceCompetitivenessThresholdsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PriceCompetitivenessThresholdsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	BasePriceDTO getOptimalPrice();

	/*! \brief Set 
	 */
	void setOptimalPrice(BasePriceDTO  optimalPrice);
	/*! \brief Get 
	 */
	BasePriceDTO getAveragePrice();

	/*! \brief Set 
	 */
	void setAveragePrice(BasePriceDTO  averagePrice);


    private:
    BasePriceDTO optimalPrice;
    BasePriceDTO averagePrice;
};
}

#endif /* TINY_CPP_CLIENT_PriceCompetitivenessThresholdsDTO_H_ */
