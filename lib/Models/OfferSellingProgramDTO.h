
/*
 * OfferSellingProgramDTO.h
 *
 * Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
 */

#ifndef TINY_CPP_CLIENT_OfferSellingProgramDTO_H_
#define TINY_CPP_CLIENT_OfferSellingProgramDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferSellingProgramStatusType.h"
#include "SellingProgramType.h"

namespace Tiny {


/*! \brief Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
 *
 *  \ingroup Models
 *
 */

class OfferSellingProgramDTO{
public:

    /*! \brief Constructor.
	 */
    OfferSellingProgramDTO();
    OfferSellingProgramDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferSellingProgramDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	SellingProgramType getSellingProgram();

	/*! \brief Set 
	 */
	void setSellingProgram(SellingProgramType  sellingProgram);
	/*! \brief Get 
	 */
	OfferSellingProgramStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(OfferSellingProgramStatusType  status);


    private:
    SellingProgramType sellingProgram;
    OfferSellingProgramStatusType status;
};
}

#endif /* TINY_CPP_CLIENT_OfferSellingProgramDTO_H_ */
