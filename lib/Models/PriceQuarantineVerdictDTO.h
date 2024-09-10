
/*
 * PriceQuarantineVerdictDTO.h
 *
 * Причина попадания товара в карантин.
 */

#ifndef TINY_CPP_CLIENT_PriceQuarantineVerdictDTO_H_
#define TINY_CPP_CLIENT_PriceQuarantineVerdictDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PriceQuarantineVerdictParameterDTO.h"
#include "PriceQuarantineVerdictType.h"
#include <list>

namespace Tiny {


/*! \brief Причина попадания товара в карантин.
 *
 *  \ingroup Models
 *
 */

class PriceQuarantineVerdictDTO{
public:

    /*! \brief Constructor.
	 */
    PriceQuarantineVerdictDTO();
    PriceQuarantineVerdictDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PriceQuarantineVerdictDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	PriceQuarantineVerdictType getType();

	/*! \brief Set 
	 */
	void setType(PriceQuarantineVerdictType  type);
	/*! \brief Get Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
	 */
	std::list<PriceQuarantineVerdictParameterDTO> getParams();

	/*! \brief Set Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
	 */
	void setParams(std::list <PriceQuarantineVerdictParameterDTO> params);


    private:
    PriceQuarantineVerdictType type;
    std::list<PriceQuarantineVerdictParameterDTO> params;
};
}

#endif /* TINY_CPP_CLIENT_PriceQuarantineVerdictDTO_H_ */
