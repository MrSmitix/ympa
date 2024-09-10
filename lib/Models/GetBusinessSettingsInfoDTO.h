
/*
 * GetBusinessSettingsInfoDTO.h
 *
 * Информация о кабинете и его настройках.
 */

#ifndef TINY_CPP_CLIENT_GetBusinessSettingsInfoDTO_H_
#define TINY_CPP_CLIENT_GetBusinessSettingsInfoDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BusinessDTO.h"
#include "BusinessSettingsDTO.h"

namespace Tiny {


/*! \brief Информация о кабинете и его настройках.
 *
 *  \ingroup Models
 *
 */

class GetBusinessSettingsInfoDTO{
public:

    /*! \brief Constructor.
	 */
    GetBusinessSettingsInfoDTO();
    GetBusinessSettingsInfoDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetBusinessSettingsInfoDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	BusinessDTO getInfo();

	/*! \brief Set 
	 */
	void setInfo(BusinessDTO  info);
	/*! \brief Get 
	 */
	BusinessSettingsDTO getSettings();

	/*! \brief Set 
	 */
	void setSettings(BusinessSettingsDTO  settings);


    private:
    BusinessDTO info;
    BusinessSettingsDTO settings;
};
}

#endif /* TINY_CPP_CLIENT_GetBusinessSettingsInfoDTO_H_ */
