/*
 * GetBusinessSettingsInfoDTO.h
 *
 * Информация о кабинете и его настройках.
 */

#ifndef _GetBusinessSettingsInfoDTO_H_
#define _GetBusinessSettingsInfoDTO_H_


#include <string>
#include "BusinessDTO.h"
#include "BusinessSettingsDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о кабинете и его настройках.
 *
 *  \ingroup Models
 *
 */

class GetBusinessSettingsInfoDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetBusinessSettingsInfoDTO();
	GetBusinessSettingsInfoDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetBusinessSettingsInfoDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetBusinessSettingsInfoDTO_H_ */
