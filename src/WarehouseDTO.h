/*
 * WarehouseDTO.h
 *
 * Информация о складе.
 */

#ifndef _WarehouseDTO_H_
#define _WarehouseDTO_H_


#include <string>
#include "WarehouseAddressDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о складе.
 *
 *  \ingroup Models
 *
 */

class WarehouseDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	WarehouseDTO();
	WarehouseDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~WarehouseDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор склада.
	 */
	long long getId();

	/*! \brief Set Идентификатор склада.
	 */
	void setId(long long  id);
	/*! \brief Get Название склада.
	 */
	std::string getName();

	/*! \brief Set Название склада.
	 */
	void setName(std::string  name);
	/*! \brief Get Идентификатор кампании в API и идентификатор магазина.
	 */
	long long getCampaignId();

	/*! \brief Set Идентификатор кампании в API и идентификатор магазина.
	 */
	void setCampaignId(long long  campaignId);
	/*! \brief Get Возможна ли доставка по модели Экспресс.
	 */
	bool getExpress();

	/*! \brief Set Возможна ли доставка по модели Экспресс.
	 */
	void setExpress(bool  express);
	/*! \brief Get 
	 */
	WarehouseAddressDTO getAddress();

	/*! \brief Set 
	 */
	void setAddress(WarehouseAddressDTO  address);

private:
	long long id;
	std::string name;
	long long campaignId;
	bool express;
	WarehouseAddressDTO address;
	void __init();
	void __cleanup();

};
}
}

#endif /* _WarehouseDTO_H_ */
