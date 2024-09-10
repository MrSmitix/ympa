
/*
 * WarehouseDTO.h
 *
 * Информация о складе.
 */

#ifndef TINY_CPP_CLIENT_WarehouseDTO_H_
#define TINY_CPP_CLIENT_WarehouseDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "WarehouseAddressDTO.h"

namespace Tiny {


/*! \brief Информация о складе.
 *
 *  \ingroup Models
 *
 */

class WarehouseDTO{
public:

    /*! \brief Constructor.
	 */
    WarehouseDTO();
    WarehouseDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~WarehouseDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор склада.
	 */
	long getId();

	/*! \brief Set Идентификатор склада.
	 */
	void setId(long  id);
	/*! \brief Get Название склада.
	 */
	std::string getName();

	/*! \brief Set Название склада.
	 */
	void setName(std::string  name);
	/*! \brief Get Идентификатор кампании в API и идентификатор магазина.
	 */
	long getCampaignId();

	/*! \brief Set Идентификатор кампании в API и идентификатор магазина.
	 */
	void setCampaignId(long  campaignId);
	/*! \brief Get Возможна ли доставка по модели Экспресс.
	 */
	bool isExpress();

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
    long id{};
    std::string name{};
    long campaignId{};
    bool express{};
    WarehouseAddressDTO address;
};
}

#endif /* TINY_CPP_CLIENT_WarehouseDTO_H_ */
