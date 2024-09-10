/*
 * OutletAddressDTO.h
 *
 * Адрес точки продаж. 
 */

#ifndef _OutletAddressDTO_H_
#define _OutletAddressDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Адрес точки продаж. 
 *
 *  \ingroup Models
 *
 */

class OutletAddressDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OutletAddressDTO();
	OutletAddressDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OutletAddressDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
	 */
	long long getRegionId();

	/*! \brief Set Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
	 */
	void setRegionId(long long  regionId);
	/*! \brief Get Улица.
	 */
	std::string getStreet();

	/*! \brief Set Улица.
	 */
	void setStreet(std::string  street);
	/*! \brief Get Номер дома.
	 */
	std::string getNumber();

	/*! \brief Set Номер дома.
	 */
	void setNumber(std::string  number);
	/*! \brief Get Номер строения.
	 */
	std::string getBuilding();

	/*! \brief Set Номер строения.
	 */
	void setBuilding(std::string  building);
	/*! \brief Get Номер владения.
	 */
	std::string getEstate();

	/*! \brief Set Номер владения.
	 */
	void setEstate(std::string  estate);
	/*! \brief Get Номер корпуса.
	 */
	std::string getBlock();

	/*! \brief Set Номер корпуса.
	 */
	void setBlock(std::string  block);
	/*! \brief Get Дополнительная информация.
	 */
	std::string getAdditional();

	/*! \brief Set Дополнительная информация.
	 */
	void setAdditional(std::string  additional);
	/*! \brief Get Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
	 */
	int getKm();

	/*! \brief Set Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
	 */
	void setKm(int  km);
	/*! \brief Get {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} 
	 */
	std::string getCity();

	/*! \brief Set {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} 
	 */
	void setCity(std::string  city);

private:
	long long regionId;
	std::string street;
	std::string number;
	std::string building;
	std::string estate;
	std::string block;
	std::string additional;
	int km;
	std::string city;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OutletAddressDTO_H_ */
