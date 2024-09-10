
/*
 * OfferConditionDTO.h
 *
 * Состояние уцененного товара. 
 */

#ifndef TINY_CPP_CLIENT_OfferConditionDTO_H_
#define TINY_CPP_CLIENT_OfferConditionDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferConditionQualityType.h"
#include "OfferConditionType.h"

namespace Tiny {


/*! \brief Состояние уцененного товара. 
 *
 *  \ingroup Models
 *
 */

class OfferConditionDTO{
public:

    /*! \brief Constructor.
	 */
    OfferConditionDTO();
    OfferConditionDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferConditionDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OfferConditionType getType();

	/*! \brief Set 
	 */
	void setType(OfferConditionType  type);
	/*! \brief Get 
	 */
	OfferConditionQualityType getQuality();

	/*! \brief Set 
	 */
	void setQuality(OfferConditionQualityType  quality);
	/*! \brief Get Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
	 */
	std::string getReason();

	/*! \brief Set Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
	 */
	void setReason(std::string  reason);


    private:
    OfferConditionType type;
    OfferConditionQualityType quality;
    std::string reason{};
};
}

#endif /* TINY_CPP_CLIENT_OfferConditionDTO_H_ */
