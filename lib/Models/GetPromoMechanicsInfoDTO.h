
/*
 * GetPromoMechanicsInfoDTO.h
 *
 * Информация о типе акции.
 */

#ifndef TINY_CPP_CLIENT_GetPromoMechanicsInfoDTO_H_
#define TINY_CPP_CLIENT_GetPromoMechanicsInfoDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GetPromoPromocodeInfoDTO.h"
#include "MechanicsType.h"

namespace Tiny {


/*! \brief Информация о типе акции.
 *
 *  \ingroup Models
 *
 */

class GetPromoMechanicsInfoDTO{
public:

    /*! \brief Constructor.
	 */
    GetPromoMechanicsInfoDTO();
    GetPromoMechanicsInfoDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPromoMechanicsInfoDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	MechanicsType getType();

	/*! \brief Set 
	 */
	void setType(MechanicsType  type);
	/*! \brief Get 
	 */
	GetPromoPromocodeInfoDTO getPromocodeInfo();

	/*! \brief Set 
	 */
	void setPromocodeInfo(GetPromoPromocodeInfoDTO  promocodeInfo);


    private:
    MechanicsType type;
    GetPromoPromocodeInfoDTO promocodeInfo;
};
}

#endif /* TINY_CPP_CLIENT_GetPromoMechanicsInfoDTO_H_ */
